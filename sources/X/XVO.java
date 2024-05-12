package X;

import androidx.lifecycle.MutableLiveData;

/* loaded from: classes16.dex */
public final class XVO extends AbstractC65781Prl implements InterfaceC65784Pro<MutableLiveData<XWC>> {
    public static final XVO LJLIL = new XVO();

    public XVO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final MutableLiveData<XWC> invoke() {
        MutableLiveData<XWC> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(XWE.LIZ);
        return mutableLiveData;
    }
}
