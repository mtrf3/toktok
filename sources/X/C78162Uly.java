package X;

import Y.ARunnableS12S1200000_13;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Uly, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78162Uly implements InterfaceC78188UmO {
    public final C32449CoP LIZ;

    public C78162Uly(C32449CoP request) {
        o.LJIIIZ(request, "request");
        this.LIZ = request;
    }

    @Override // X.InterfaceC78188UmO
    public final void LJI(C78166Um2 c78166Um2) {
        int i;
        java.util.Map<String, String> map;
        String str;
        Integer LJJIL;
        C78160Ulw c78160Ulw = this.LIZ.LIZJ;
        boolean z = false;
        if (c78160Ulw != null && (map = c78160Ulw.LJ) != null && (str = map.get("is_own_send")) != null && (LJJIL = C38350F3i.LJJIL(str)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        if (i == 0) {
            if (C32257ClJ.LJFF() == 1) {
                C65032gt.LIZ(new ARunnableS12S1200000_13(this, "_anchor", c78166Um2, 0));
            }
        } else if (i == 1) {
            C65032gt.LIZ(new ARunnableS12S1200000_13(this, "_self", c78166Um2, 0));
        }
        C78160Ulw c78160Ulw2 = this.LIZ.LIZJ;
        if (c78160Ulw2 != null && c78160Ulw2.LJIILJJIL) {
            z = true;
        }
        if (GiftEventTrackSamplingSetting.shouldBlock(z)) {
            return;
        }
        if (GiftEventTrackSamplingSetting.enable() && (i == 1 || C32257ClJ.LJFF() == 1)) {
            return;
        }
        C65032gt.LIZ(new ARunnableS12S1200000_13(this, "", c78166Um2, 0));
    }
}
