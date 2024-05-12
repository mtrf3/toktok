package X;

import Y.ARunnableS41S0100000_5;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAndroidBackgroundOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBgOptTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostRoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.other.TtliveGameOtherBackgroundImageOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U4t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76607U4t implements InterfaceC75238Tfu {
    public ViewGroup LIZ;
    public final DataChannel LIZIZ;
    public final InterfaceC76609U4v LIZJ;
    public OSZ<Integer, Integer> LIZLLL;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 87));

    public final U5C LIZ() {
        return (U5C) this.LJ.getValue();
    }

    @Override // X.InterfaceC75238Tfu
    public final void onDetach() {
        if (MultiCohostRoomLoadingOptSetting.INSTANCE.isEnable()) {
            ViewGroup viewGroup = this.LIZ;
            if (viewGroup != null) {
                viewGroup.setBackground(null);
            }
            this.LIZ = null;
        }
        if (MultiGuestAndroidBackgroundOptSetting.INSTANCE.isOptSetBg()) {
            U5C LIZ = LIZ();
            LIZ.LJFF = null;
            LIZ.LJI = false;
            LIZ.LJII = false;
            List<String> list = LIZ.LJIIIIZZ;
            if (list == null) {
                return;
            }
            for (String str : list) {
                W6J LIZ2 = W5I.LIZ();
                o.LJIIIIZZ(LIZ2, "getImagePipeline()");
                android.net.Uri parse = UriProtector.parse(str);
                if (LIZ2.LJII(parse)) {
                    LIZ2.LIZJ(parse);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("detach successfully: ");
                    LIZ3.append(parse);
                    C0NB.LIZIZ("WindowMaskDrawable detach", X1D.LIZIZ(LIZ3));
                }
            }
            LIZ.LJIIIIZZ = null;
        }
    }

    @Override // X.InterfaceC75238Tfu
    public final int LIZLLL() {
        U5C LIZ = LIZ();
        LIZ.LIZIZ.LIZ().getBounds().width();
        LIZ.LIZIZ.LIZIZ().getBounds().height();
        LIZ.LIZIZ.LIZJ().getBounds().width();
        return LIZ.LIZIZ.LIZLLL().getBounds().height();
    }

    @Override // X.InterfaceC75238Tfu
    public final void LJFF() {
        U5C LIZ = LIZ();
        int i = 0;
        do {
            LIZ.LJIIIZ[i] = false;
            i++;
        } while (i < 4);
        LIZ.invalidateSelf();
    }

    @Override // X.InterfaceC75238Tfu
    public final void LIZIZ(OSZ<Integer, Integer> osz) {
        this.LIZLLL = osz;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1 A[LOOP:1: B:46:0x00df->B:47:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0159  */
    @Override // X.InterfaceC75238Tfu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.graphics.Rect r11) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76607U4t.LIZJ(android.graphics.Rect):void");
    }

    @Override // X.InterfaceC75238Tfu
    public final void LJ(boolean z) {
        List<String> list;
        boolean z2;
        List<String> list2;
        ImageModel imageModel;
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            viewGroup.setBackground(LIZ());
        }
        MultiGuestAndroidBackgroundOptSetting multiGuestAndroidBackgroundOptSetting = MultiGuestAndroidBackgroundOptSetting.INSTANCE;
        if (multiGuestAndroidBackgroundOptSetting.isOptSetBg() && z) {
            U5C LIZ = LIZ();
            LIZ.getClass();
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null && (imageModel = room.background) != null) {
                list = imageModel.getUrls();
            } else {
                list = null;
            }
            LIZ.LJIIIIZZ = list;
            if (list == null || list.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            LIZ.LJII = z2;
            if (LIZ.LJI || LIZ.LJIIJ != null || !multiGuestAndroidBackgroundOptSetting.isOptSetBg() || !LIZ.LJII || (list2 = LIZ.LJIIIIZZ) == null) {
                return;
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(it.next()));
                LIZLLL.LJIILJJIL = new C76608U4u(LIZ);
                W5I.LIZ().LJIIL(LIZLLL.LIZ(), C15380j0.LIZLLL());
            }
        }
    }

    public C76607U4t(ViewGroup viewGroup, DataChannel dataChannel, InterfaceC76609U4v interfaceC76609U4v) {
        this.LIZ = viewGroup;
        this.LIZIZ = dataChannel;
        this.LIZJ = interfaceC76609U4v;
        if (TtliveGameOtherBackgroundImageOptimizeSetting.INSTANCE.isBackgroundLightSensitiveBlack() && MultiGuestBgOptTechSwitchSetting.INSTANCE.isEnable()) {
            U5C LIZ = LIZ();
            if (LIZ.LIZJ().LIZ == null) {
                C28733BPl.LJIILIIL().getClass();
                C0NE.LIZ("WindowMaskDrawable", "preLoadLightSensitiveBlackDrawable start");
                C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(LIZ, 31));
            }
        }
    }
}
