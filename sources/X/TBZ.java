package X;

/* loaded from: classes13.dex */
public abstract class TBZ extends AbstractC74231TBj implements TBW {
    public abstract /* synthetic */ Object get(Object obj);

    @Override // X.AbstractC74233TBl
    public InterfaceC74234TBm computeReflected() {
        C65352Pkq.LIZ.getClass();
        return this;
    }

    @Override // X.AbstractC74231TBj
    public TBX getGetter() {
        ((TBW) getReflected()).getGetter();
        return null;
    }

    public TBZ() {
    }

    @Override // X.AbstractC74231TBj
    public /* bridge */ /* synthetic */ InterfaceC39094FVy getGetter() {
        getGetter();
        return null;
    }

    public TBZ(Object obj) {
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

    public TBZ(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
