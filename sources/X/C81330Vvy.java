package X;

import androidx.lifecycle.MutableLiveData;

/* renamed from: X.Vvy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81330Vvy {
    public final MutableLiveData<EnumC81223VuF> LIZ;
    public final MutableLiveData LIZIZ;

    public C81330Vvy() {
        MutableLiveData<EnumC81223VuF> mutableLiveData = new MutableLiveData<>();
        this.LIZ = mutableLiveData;
        this.LIZIZ = mutableLiveData;
    }

    public final void LIZ(boolean z) {
        if (z) {
            this.LIZ.setValue(EnumC81223VuF.HIDDEN);
        } else {
            C116484hg.LIZ("status", "off", "notifications_show");
            this.LIZ.setValue(EnumC81223VuF.WITH_TEXT);
        }
    }
}
