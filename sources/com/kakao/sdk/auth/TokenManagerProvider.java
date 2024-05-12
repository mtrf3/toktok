package com.kakao.sdk.auth;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.InterfaceC74236TBo;
import X.TBT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TokenManagerProvider {
    public static final Companion Companion = new Companion();
    public static final C5H3<TokenManagerProvider> instance$delegate = C221108m2.LIZIZ(TokenManagerProvider$Companion$instance$2.INSTANCE);
    public TokenManageable manager;

    /* loaded from: classes12.dex */
    public static final class Companion {
        public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;

        static {
            TBT tbt = new TBT(C65352Pkq.LIZ(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/TokenManagerProvider;");
            C65352Pkq.LIZ.getClass();
            $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final TokenManagerProvider getInstance() {
            return TokenManagerProvider.instance$delegate.getValue();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TokenManagerProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final TokenManagerProvider getInstance() {
        return Companion.getInstance();
    }

    public final TokenManageable getManager() {
        return this.manager;
    }

    public TokenManagerProvider(TokenManageable manager) {
        o.LJIIIZ(manager, "manager");
        this.manager = manager;
    }

    public final void setManager(TokenManageable tokenManageable) {
        o.LJIIIZ(tokenManageable, "<set-?>");
        this.manager = tokenManageable;
    }

    public /* synthetic */ TokenManagerProvider(TokenManageable tokenManageable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TokenManager.Companion.getInstance() : tokenManageable);
    }
}
