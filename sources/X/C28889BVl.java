package X;

import com.bytedance.android.livesdk.qa.QAFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BVl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28889BVl extends C1CZ {
    public final /* synthetic */ QAFragment LJLIL;

    public C28889BVl(QAFragment qAFragment) {
        this.LJLIL = qAFragment;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Integer, O] */
    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        C78856UxA tabAt = ((C80261Vej) this.LJLIL._$_findCachedViewById(R.id.kyt)).getTabAt(i);
        if (tabAt != null) {
            tabAt.LIZIZ();
        }
        DataChannel dataChannel = this.LJLIL.LJLIL;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C28891BVn.class)).LIZ = Integer.valueOf(i);
        }
    }
}
