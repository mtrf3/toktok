package X;

import Y.ARunnableS28S0200000_9;
import Y.ARunnableS49S0100000_13;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.liveinteract.multiguestv3.HadInitLinkMicChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3CanExposeForPlayerOptChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3ShowEmptyViewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3RoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostRoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TlN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75577TlN implements B3G, LifecycleOwner {
    public static final String LJZI;
    public final ViewGroup LJLIL;
    public final DataChannel LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public C28272B7s LJLJJI;
    public Rect LJLJJL;
    public OSZ<Integer, Integer> LJLJJLL;
    public final List<InterfaceC75580TlQ> LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLL;
    public final AqS179S0100000_13 LJLLI;
    public final AqS179S0100000_13 LJLLILLLL;
    public final AqS179S0100000_13 LJLLJ;
    public final C75578TlO LJLLL;
    public final C62822Ol8 LJLLLL;
    public final ARunnableS49S0100000_13 LJLLLLLL;
    public boolean LJLZ;
    public final IThemeAbility LJZ;

    static {
        C75581TlR c75581TlR = new C75581TlR();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewMultiGuestV3PreAdjustPlayerManager");
        LIZ.append(c75581TlR.hashCode());
        LJZI = X1D.LIZIZ(LIZ);
    }

    @Override // X.B3G
    public final void LIZJ() {
        if (!this.LJLZ) {
            StringBuilder LIZ = X1D.LIZ();
            C12400eC.LIZIZ(LIZ, LJZI, "_tryReInit", LIZ, "1VNExperienceV1");
            Iterator<InterfaceC75580TlQ> it = this.LJLJL.iterator();
            while (it.hasNext()) {
                it.next().init();
            }
            LJI();
        }
    }

    public final InterfaceC75580TlQ LJFF() {
        List<InterfaceC75580TlQ> list = this.LJLJL;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC75580TlQ interfaceC75580TlQ : list) {
            if (interfaceC75580TlQ.scene() == this.LJLJLJ) {
                arrayList.add(interfaceC75580TlQ);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() > 1) {
            StringBuilder LIZ = X1D.LIZ();
            C12400eC.LIZIZ(LIZ, LJZI, "_getCurrentSceneHandle size is larger than 1", LIZ, "1VNExperienceV1");
            return null;
        }
        return (InterfaceC75580TlQ) ListProtector.get(arrayList, 0);
    }

    public final void LJI() {
        MultiGuestThemeViewModel B70;
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null) {
                dataChannel.nv0(RoomChannel.class, this, this.LJLLI);
            }
        } else {
            DataChannel dataChannel2 = this.LJLILLLLZI;
            if (dataChannel2 != null) {
                AqS179S0100000_13 aqS179S0100000_13 = this.LJLLI;
                dataChannel2.nv0(RoomChannel.class, aqS179S0100000_13, aqS179S0100000_13);
            }
        }
        DataChannel dataChannel3 = this.LJLILLLLZI;
        if (dataChannel3 != null) {
            dataChannel3.mv0(MultiGuestV3ShowEmptyViewEvent.class, this.LJLJI, this.LJLLJ);
        }
        DataChannel dataChannel4 = this.LJLILLLLZI;
        if (dataChannel4 != null) {
            dataChannel4.mv0(MultiGuestV3CanExposeForPlayerOptChannel.class, this.LJLJI, this.LJLLILLLL);
        }
        IThemeAbility iThemeAbility = this.LJZ;
        if (iThemeAbility != null && (B70 = iThemeAbility.B70()) != null) {
            MultiGuestThemeViewModel.iv0(B70, new TBV() { // from class: X.TgF
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return ((C75247Tg3) obj).LJLJJL;
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C75247Tg3) obj).LJLJJL = (Rect) obj2;
                }
            }, this, new AqS179S0100000_13(this, 680), 2);
        }
    }

    @Override // X.B3G
    public final void clear() {
        ((LifecycleRegistry) this.LJLL.getValue()).setCurrentState(Lifecycle.State.DESTROYED);
        Iterator it = ((ArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            ((InterfaceC75580TlQ) it.next()).release();
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LJLL.getValue();
    }

    public final boolean LJII() {
        InterfaceC75580TlQ LJFF = LJFF();
        if (LJFF == null || LJFF.LJI()) {
            return false;
        }
        return true;
    }

    public final void LJIIIIZZ() {
        C76696U8e r1;
        Rect containerActualRange;
        InterfaceC75580TlQ LJFF;
        MultiGuestThemeViewModel B70;
        C75247Tg3 state;
        StringBuilder LIZ = X1D.LIZ();
        C12400eC.LIZIZ(LIZ, LJZI, "_showEmptyView", LIZ, "1VNExperienceV1");
        if (!this.LJLZ) {
            C0NB.LIZIZ("1VNExperienceV1", "showEmptyView return as isPreAdjustIn1VN 's value is false!");
        } else {
            InterfaceC75579TlP interfaceC75579TlP = (InterfaceC75579TlP) this.LJLLLL.getValue();
            if (interfaceC75579TlP != null) {
                DataChannel dataChannel = this.LJLILLLLZI;
                if (dataChannel != null && o.LJ(dataChannel.kv0(MultiGuestV3CanExposeForPlayerOptChannel.class), Boolean.TRUE) && this.LJLJLLL) {
                    this.LJLIL.removeCallbacks(this.LJLLLLLL);
                    this.LJLIL.postDelayed(this.LJLLLLLL, LivePlayEnforceIntervalSetting.DEFAULT);
                }
                IThemeAbility iThemeAbility = this.LJZ;
                if (((((iThemeAbility != null && (B70 = iThemeAbility.B70()) != null && (state = B70.getState()) != null && (containerActualRange = state.LJLJJL) != null) || ((r1 = interfaceC75579TlP.r1()) != null && (containerActualRange = r1.getContainerActualRange()) != null)) && containerActualRange.width() > 0 && containerActualRange.height() > 0) || (containerActualRange = this.LJLJJL) != null) && (LJFF = LJFF()) != null) {
                    LJFF.LJII(containerActualRange);
                }
            }
        }
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 == null || !o.LJ(dataChannel2.kv0(MultiGuestV3CanExposeForPlayerOptChannel.class), Boolean.TRUE) || !this.LJLJLLL) {
            return;
        }
        this.LJLIL.removeCallbacks(this.LJLLLLLL);
        this.LJLIL.postDelayed(this.LJLLLLLL, LivePlayEnforceIntervalSetting.DEFAULT);
    }

    public final void LJIIIZ() {
        StringBuilder LIZ = X1D.LIZ();
        C12400eC.LIZIZ(LIZ, LJZI, "_release", LIZ, "1VNExperienceV1");
        InterfaceC75579TlP interfaceC75579TlP = (InterfaceC75579TlP) this.LJLLLL.getValue();
        if (interfaceC75579TlP != null) {
            interfaceC75579TlP.p1(this.LJLLL);
        }
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            AqS179S0100000_13 observerOwner = this.LJLLI;
            o.LJIIIZ(observerOwner, "observerOwner");
            dataChannel.jv0(observerOwner);
        }
    }

    @Override // X.B3G
    public final boolean LIZIZ() {
        return this.LJLZ;
    }

    @Override // X.B3G
    public final int getScene() {
        return this.LJLJLJ;
    }

    public final InterfaceC75580TlQ LIZLLL(int i) {
        if (i != 2) {
            if (i == 4) {
                C75239Tfv c75239Tfv = new C75239Tfv(this.LJLIL, this.LJLILLLLZI);
                c75239Tfv.init();
                return c75239Tfv;
            }
            throw new IllegalArgumentException("scene is illegal please check!");
        }
        C75571TlH c75571TlH = new C75571TlH(this.LJLIL, this.LJLILLLLZI);
        c75571TlH.LJIIIIZZ(false);
        return c75571TlH;
    }

    public final void LJIIJJI(boolean z) {
        this.LJLZ = z;
        if (!z) {
            this.LJLJLJ = -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJZI);
        LIZ.append("_updateIsPreAdjustIn1VN value = ");
        C19U.LIZJ(LIZ, this.LJLZ, LIZ, "1VNExperienceV1");
    }

    @Override // X.B3G
    public final void d(C28272B7s c28272B7s) {
        Long l;
        boolean z;
        boolean z2;
        InterfaceC75580TlQ LJFF;
        Room room;
        DataChannel dataChannel = this.LJLILLLLZI;
        Integer num = null;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null) {
            z = o.LJ(dataChannel2.kv0(HadInitLinkMicChannel.class), Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z && !LJII()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!this.LJLZ) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJZI);
            LIZ.append("_onSeiUpdate release roomId = ");
            LIZ.append(l);
            C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ));
            if (LJII()) {
                LJIIJ("onSeiUpdate can't handleSei", true);
            }
            LJIIIZ();
            return;
        }
        SeiAppData LJIIJ = C75806Tp4.LJIIJ(c28272B7s);
        if (LJIIJ != null) {
            SeiDsl seiDsl = LJIIJ.dsl;
            if (seiDsl != null) {
                this.LJLJLJ = Integer.valueOf(seiDsl.scene).intValue();
            }
            Iterator it = ((ArrayList) this.LJLJL).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((InterfaceC75580TlQ) next).LIZ() == LJIIJ.version) {
                    if (next != null) {
                        this.LJLJLLL = true;
                        StringBuilder LIZ2 = X1D.LIZ();
                        String str = LJZI;
                        C12400eC.LIZIZ(LIZ2, str, "_onSeiUpdate", LIZ2, "1VNExperienceV1");
                        if (!this.LJLZ) {
                            LJIIJJI(true);
                        }
                        this.LJLJJI = c28272B7s;
                        Room LJIILL = C1DH.LJIILL(this.LJLILLLLZI);
                        InterfaceC75580TlQ LJFF2 = LJFF();
                        if ((LJFF2 != null && !LJFF2.LJI()) || (LJIILL != null && (LJFF = LJFF()) != null && !LJFF.LJFF(LJIILL))) {
                            C279017q.LJ(str, "_sendSeiToLinkLayoutManager1", "1VNExperienceV1");
                            return;
                        }
                        ViewGroup viewGroup = this.LJLIL;
                        AqS144S0200000_13 aqS144S0200000_13 = new AqS144S0200000_13(this, c28272B7s, 107);
                        o.LJIIIZ(viewGroup, "<this>");
                        if (viewGroup.getWidth() > 0) {
                            aqS144S0200000_13.invoke(viewGroup);
                            return;
                        } else {
                            viewGroup.post(new ARunnableS28S0200000_9(viewGroup, aqS144S0200000_13, 56));
                            return;
                        }
                    }
                }
            }
        }
        this.LJLJLLL = false;
        StringBuilder LIZ3 = X1D.LIZ();
        String str2 = LJZI;
        LIZ3.append(str2);
        LIZ3.append("_onSeiUpdate not 1vn sei = ");
        if (c28272B7s != null) {
            num = Integer.valueOf(c28272B7s.hashCode());
        }
        LIZ3.append(num);
        C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ3));
        if (!LJII()) {
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(str2);
        LIZ4.append("_onSeiUpdate release all");
        C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ4));
        LJIIIZ();
        LJIIJ("onSeiUpdate", true);
    }

    @Override // X.B3G
    public final void LIZ(Rect rect, OSZ<Integer, Integer> size) {
        o.LJIIIZ(size, "size");
        this.LJLJJL = rect;
        this.LJLJJLL = size;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updatePlayerRangeAndParentSize actualRange = ");
        LIZ.append(this.LJLJJL);
        LIZ.append(" actualParentSize = ");
        LIZ.append(this.LJLJJLL);
        C0NB.LIZIZ("1VNExperienceV1", X1D.LIZIZ(LIZ));
        InterfaceC75580TlQ LJFF = LJFF();
        if (LJFF != null) {
            LJFF.LIZIZ(size);
        }
        LJIIIIZZ();
    }

    public final void LJIIJ(String str, boolean z) {
        Long l;
        Room room;
        DataChannel dataChannel;
        if (z && (dataChannel = this.LJLILLLLZI) != null && o.LJ(dataChannel.kv0(MultiGuestV3CanExposeForPlayerOptChannel.class), Boolean.FALSE)) {
            return;
        }
        ((LifecycleRegistry) this.LJLL.getValue()).setCurrentState(Lifecycle.State.STARTED);
        Iterator it = ((ArrayList) this.LJLJL).iterator();
        while (it.hasNext()) {
            ((InterfaceC75580TlQ) it.next()).release();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJZI);
        LIZ.append("_releaseView isLinkMicClose = ");
        LIZ.append(LJII());
        LIZ.append(" from = ");
        LIZ.append(str);
        LIZ.append(" hc = ");
        LIZ.append(hashCode());
        LIZ.append(" roomId = ");
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        C07670Rv.LJ(LIZ, l, LIZ, "1VNExperienceV1");
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            DataChannel dataChannel3 = this.LJLILLLLZI;
            if (dataChannel3 != null) {
                dataChannel3.jv0(this);
            }
        } else {
            DataChannel dataChannel4 = this.LJLILLLLZI;
            if (dataChannel4 != null) {
                LifecycleOwner observerOwner = this.LJLJI;
                o.LJIIIZ(observerOwner, "observerOwner");
                dataChannel4.jv0(observerOwner);
            }
        }
        this.LJLIL.removeCallbacks(this.LJLLLLLL);
        LJIIJJI(false);
    }

    public C75577TlN(ViewGroup viewGroup, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = lifecycleOwner;
        this.LJLJJL = new Rect();
        this.LJLJJLL = new OSZ<>(0, 0);
        ArrayList arrayList = new ArrayList();
        this.LJLJL = arrayList;
        this.LJLJLJ = -1;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 755));
        this.LJLL = LIZIZ;
        this.LJLLI = new AqS179S0100000_13(this, 681);
        this.LJLLILLLL = new AqS179S0100000_13(this, 678);
        this.LJLLJ = new AqS179S0100000_13(this, 679);
        this.LJLLL = new C75578TlO(this);
        this.LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 756));
        this.LJLLLLLL = new ARunnableS49S0100000_13(this, 270);
        StringBuilder LIZ = X1D.LIZ();
        C12400eC.LIZIZ(LIZ, LJZI, "_init", LIZ, "1VNExperienceV1");
        IThemeAbility iThemeAbility = null;
        if (dataChannel != null && (interfaceC55235Lm3 = (InterfaceC55235Lm3) dataChannel.kv0(C75415Til.class)) != null) {
            iThemeAbility = (IThemeAbility) UC0.LJIIL(interfaceC55235Lm3, IThemeAbility.class, null);
        }
        this.LJZ = iThemeAbility;
        if (MultiGuestV3RoomLoadingOptSetting.INSTANCE.isEnable()) {
            arrayList.add(LIZLLL(4));
        }
        if (MultiCohostRoomLoadingOptSetting.INSTANCE.isEnable()) {
            arrayList.add(LIZLLL(2));
        }
        LJI();
        ((LifecycleRegistry) LIZIZ.getValue()).setCurrentState(Lifecycle.State.STARTED);
    }
}
