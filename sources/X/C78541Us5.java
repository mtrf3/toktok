package X;

import Y.AObserverS62S0300000_1;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.network.response.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Us5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78541Us5 implements InterfaceC48038ItG, InterfaceC78852Ux6, UW1 {
    public static Boolean LJLILLLLZI;
    public static final C78541Us5 LJLIL = new C78541Us5();
    public static final C78541Us5 LJLJI = new C78541Us5();

    public static final boolean LIZJ() {
        if (C146345ok.LIZ() && o.LJ(LJLILLLLZI, Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(VideoPublishEditModel model) {
        boolean z;
        o.LJIIIZ(model, "model");
        if (!model.isMvThemeVideoType() && !model.isCutSameVideoType() && !H7R.LJJJLZIJ(model) && !H7R.LJJLIIIJJIZ(model) && !o.LJ(model.enterFrom, "effect_qr_scan") && C1B8.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        LJLILLLLZI = Boolean.valueOf(z);
        return z;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse it = (BaseResponse) obj;
        o.LJIIIZ(it, "it");
        return it.data;
    }

    @Override // X.InterfaceC78852Ux6
    /* renamed from: apply, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo42apply(Object obj) {
        return true;
    }

    public static final MediatorLiveData LIZIZ(MutableLiveData mutableLiveData, MutableLiveData other, InterfaceC88471Ynr transform) {
        o.LJIIIZ(mutableLiveData, "<this>");
        o.LJIIIZ(other, "other");
        o.LJIIIZ(transform, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(mutableLiveData, new AObserverS62S0300000_1(mediatorLiveData, transform, other, 5));
        mediatorLiveData.addSource(other, new AObserverS62S0300000_1(mediatorLiveData, transform, mutableLiveData, 6));
        return mediatorLiveData;
    }

    @Override // X.UW1
    public boolean LIZ(C32816CuK c32816CuK, C32816CuK c32816CuK2, int i, int i2) {
        C32804Cu8 LJJII;
        C32804Cu8 LJJII2;
        if (i2 != i - 1 || (LJJII = V16.LJJII(c32816CuK)) == null || LJJII.LJJIFFI || (LJJII2 = V16.LJJII(c32816CuK2)) == null || !V16.LJJLI(c32816CuK, c32816CuK2) || LJJII.LIZJ != LJJII2.LIZJ || LJJII.LIZ != LJJII2.LIZ) {
            return false;
        }
        c32816CuK2.LIZ.addAll(c32816CuK.LIZ);
        return true;
    }
}
