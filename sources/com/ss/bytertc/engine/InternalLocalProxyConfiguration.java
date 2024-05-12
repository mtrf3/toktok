package com.ss.bytertc.engine;

import X.V0N;
import com.ss.bytertc.engine.type.LocalProxyConfiguration;
import com.ss.bytertc.engine.type.LocalProxyType;

/* loaded from: classes33.dex */
public class InternalLocalProxyConfiguration {
    public String localProxyIp;
    public String localProxyPassword;
    public int localProxyPort;
    public InternalLocalProxyType localProxyType;
    public String localProxyUsername;

    /* renamed from: com.ss.bytertc.engine.InternalLocalProxyConfiguration$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$LocalProxyType;

        static {
            int[] iArr = new int[LocalProxyType.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$LocalProxyType = iArr;
            try {
                iArr[LocalProxyType.SOCKS5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$LocalProxyType[LocalProxyType.HTTP_TUNNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes33.dex */
    public enum InternalLocalProxyType {
        SOCKS5(1),
        HTTP_TUNNEL(2);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static InternalLocalProxyType valueOf(String str) {
            return (InternalLocalProxyType) V0N.LJJJ(InternalLocalProxyType.class, str);
        }

        InternalLocalProxyType(int i) {
            this.value = i;
        }
    }

    public String getLocalProxyIp() {
        return this.localProxyIp;
    }

    public String getLocalProxyPassword() {
        return this.localProxyPassword;
    }

    public int getLocalProxyPort() {
        return this.localProxyPort;
    }

    public InternalLocalProxyType getLocalProxyType() {
        return this.localProxyType;
    }

    public String getLocalProxyUsername() {
        return this.localProxyUsername;
    }

    public InternalLocalProxyConfiguration(LocalProxyConfiguration localProxyConfiguration) {
        this.localProxyType = ConvertEnumValue(localProxyConfiguration.localProxyType);
        this.localProxyIp = localProxyConfiguration.localProxyIp;
        this.localProxyPort = localProxyConfiguration.localProxyPort;
        this.localProxyUsername = localProxyConfiguration.localProxyUsername;
        this.localProxyPassword = localProxyConfiguration.localProxyPassword;
    }

    private InternalLocalProxyType ConvertEnumValue(LocalProxyType localProxyType) {
        InternalLocalProxyType internalLocalProxyType = InternalLocalProxyType.SOCKS5;
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$LocalProxyType[localProxyType.ordinal()];
        if (i == 1 || i != 2) {
            return internalLocalProxyType;
        }
        return InternalLocalProxyType.HTTP_TUNNEL;
    }
}
