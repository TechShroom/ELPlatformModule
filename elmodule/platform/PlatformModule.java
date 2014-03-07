package elmodule.platform;

import emergencylanding.k.exst.modules.IModule;
import emergencylanding.k.library.main.KMain;

public class PlatformModule extends IModule {
    private static final String FULL_BINARY_NAME = PlatformModule.class
            .getName();

    @Override
    public void init(KMain instance) {
    }

    public static String getFullBinaryName() {
        return FULL_BINARY_NAME;
    }

}
