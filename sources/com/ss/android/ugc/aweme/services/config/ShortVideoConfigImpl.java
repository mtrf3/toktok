package com.ss.android.ugc.aweme.services.config;

import X.C61878OQg;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ShortVideoConfigImpl extends ShortVideoConfigBaseImpl {
    public static final Companion Companion = new Companion();
    public static ShortVideoConfigImpl sInstance;

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ShortVideoConfigImpl getInstance() {
            if (ShortVideoConfigImpl.sInstance == null) {
                synchronized (ShortVideoConfigBaseImpl.class) {
                    if (ShortVideoConfigImpl.sInstance == null) {
                        ShortVideoConfigImpl.sInstance = new ShortVideoConfigImpl();
                    }
                }
            }
            ShortVideoConfigImpl shortVideoConfigImpl = ShortVideoConfigImpl.sInstance;
            o.LJI(shortVideoConfigImpl);
            return shortVideoConfigImpl;
        }

        public Companion() {
        }
    }

    public static final ShortVideoConfigImpl getInstance() {
        return Companion.getInstance();
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public String cutsameSdkVersion() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public List<String> getBOEBypassHostList() {
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.services.IShortVideoConfig
    public List<String> getBOEBypassPathList() {
        return C61878OQg.INSTANCE;
    }
}
