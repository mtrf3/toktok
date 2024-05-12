package X;

/* renamed from: X.TBc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC74224TBc extends AbstractC74228TBg implements InterfaceC74225TBd {
    public abstract /* synthetic */ Object get(Object obj);

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    @Override // X.AbstractC74233TBl
    public InterfaceC74234TBm computeReflected() {
        C65352Pkq.LIZ.getClass();
        return this;
    }

    @Override // X.AbstractC74228TBg, X.AbstractC74231TBj
    public TBX getGetter() {
        ((TBW) getReflected()).getGetter();
        return null;
    }

    @Override // X.AbstractC74228TBg
    public InterfaceC74229TBh getSetter() {
        ((InterfaceC74225TBd) getReflected()).getSetter();
        return null;
    }

    public AbstractC74224TBc() {
    }

    @Override // X.AbstractC74228TBg, X.AbstractC74231TBj
    public /* bridge */ /* synthetic */ InterfaceC39094FVy getGetter() {
        getGetter();
        return null;
    }

    @Override // X.AbstractC74228TBg
    public /* bridge */ /* synthetic */ InterfaceC39095FVz getSetter() {
        getSetter();
        return null;
    }

    public AbstractC74224TBc(Object obj) {
        super(obj);
    }

    @Override // X.TBW
    public Object getDelegate(Object obj) {
        return ((TBW) getReflected()).getDelegate(obj);
    }

    @Override // X.InterfaceC88472Yns
    public Object invoke(Object obj) {
        return get(obj);
    }

    public AbstractC74224TBc(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
