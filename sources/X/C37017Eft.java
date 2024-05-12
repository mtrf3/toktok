package X;

import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Eft, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37017Eft extends AbstractC37121EhZ {
    public EnumC38014Evy LJLIL;
    public final String LJLILLLLZI;
    public boolean LJLJI;
    public final CopyOnWriteArraySet<InterfaceC37007Efj> LJLJJI;
    public final C37003Eff LJLJJL;
    public final F3T LJLJJLL;
    public final InterfaceC37002Efe LJLJL;

    @Override // X.AbstractC37121EhZ, X.InterfaceC37788EsK
    public final void release() {
        this.LJLJJI.clear();
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final boolean getNeedCallback() {
        return this.LJLJI;
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIJ(enumC38014Evy, "<set-?>");
        this.LJLIL = enumC38014Evy;
    }

    @Override // X.AbstractC37121EhZ
    public final void setNeedCallback(boolean z) {
        this.LJLJI = z;
    }

    @Override // X.InterfaceC38186Eyk
    public final void handle(JSONObject params, InterfaceC37120EhY callback) {
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        C37018Efu c37018Efu = new C37018Efu(this, callback, params);
        this.LJLJJI.add(c37018Efu);
        new C37005Efh(this.LJLJL, c37018Efu).LIZIZ(params);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37017Eft(String bridgeName, C37003Eff prefetchService, F3T providerFactory, InterfaceC37002Efe prefetchProcessor) {
        super(providerFactory);
        o.LJIIJ(bridgeName, "bridgeName");
        o.LJIIJ(prefetchService, "prefetchService");
        o.LJIIJ(providerFactory, "providerFactory");
        o.LJIIJ(prefetchProcessor, "prefetchProcessor");
        this.LJLJJL = prefetchService;
        this.LJLJJLL = providerFactory;
        this.LJLJL = prefetchProcessor;
        this.LJLIL = EnumC38014Evy.PRIVATE;
        this.LJLILLLLZI = bridgeName;
        this.LJLJJI = new CopyOnWriteArraySet<>();
    }
}
