package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EhZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37121EhZ implements InterfaceC38186Eyk {
    public EnumC38014Evy access;
    public final F3T contextProviderFactory;
    public boolean needCallback;

    @Override // X.InterfaceC37788EsK
    public void release() {
    }

    public EnumC38014Evy getAccess() {
        return this.access;
    }

    public boolean getNeedCallback() {
        return this.needCallback;
    }

    public AbstractC37121EhZ(F3T contextProviderFactory) {
        o.LJIIJ(contextProviderFactory, "contextProviderFactory");
        this.contextProviderFactory = contextProviderFactory;
        this.access = EnumC38014Evy.PRIVATE;
    }

    public void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIJ(enumC38014Evy, "<set-?>");
        this.access = enumC38014Evy;
    }

    public void setNeedCallback(boolean z) {
        this.needCallback = z;
    }
}
