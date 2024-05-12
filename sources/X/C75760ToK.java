package X;

import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostManagerContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostManagerFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.core.countdown.MultiCoHostCountDownEvent;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.model.message.CohostTopicMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.ToK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75760ToK extends AbstractC75839Tpb implements InterfaceC75451TjL {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final DataChannel LJLJJI;
    public final CJ2 LJLJJL;
    public final AqS195S0100000_13 LJLJJLL;
    public final C31657Cbd LJLJL;

    static {
        TBT tbt = new TBT(C75760ToK.class, "linkMessageCenter", "getLinkMessageCenter()Lcom/bytedance/android/live/liveinteract/platform/core/message/LinkMessageCenter;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void LIZIZ() {
        DataChannel dataChannel = this.LJLJJI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        C8E.LIZLLL().LJZI(C75593Tld.class, this.LJLJJLL);
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) this.LJLJL.LIZ(this, LJLJLJ[0]);
        if (linkMessageCenter != null) {
            linkMessageCenter.LJ(this);
        }
    }

    @Override // X.AbstractC75839Tpb
    public final boolean LIZLLL() {
        Object obj;
        V v;
        String string;
        C75768ToS c75768ToS;
        V v2;
        String string2;
        V v3;
        String string3;
        Iterator<Object> it = this.LJLJJL.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
            if (obj instanceof C75883TqJ) {
                C75883TqJ c75883TqJ = (C75883TqJ) obj;
                if (c75883TqJ.LJJI == EnumC75909Tqj.LINKED && !c75883TqJ.LJIILL.isMultiCoHost()) {
                    break;
                }
            }
        }
        if (obj != null && (obj instanceof C75883TqJ)) {
            C75768ToS c75768ToS2 = ((C75883TqJ) obj).LJIIZILJ;
            if (c75768ToS2 != null && (v3 = this.LJLILLLLZI) != 0 && (string3 = v3.getString(R.string.km9)) != null) {
                String LLLZ = C16880lQ.LLLZ(string3, Arrays.copyOf(new Object[]{C05170If.LIZIZ(c75768ToS2.LIZ, c75768ToS2.LIZIZ)}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                C30868C9o.LJI(LLLZ);
            }
            return false;
        }
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
            RandomLinkMicManager.LJLIL.getClass();
            if (!RandomLinkMicManager.LJLLLLLL) {
                Iterator<Object> it2 = this.LJLJJL.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C75883TqJ) {
                        C75883TqJ c75883TqJ2 = (C75883TqJ) next;
                        if (!c75883TqJ2.LIZJ() && c75883TqJ2.LJJI == EnumC75909Tqj.LINKED) {
                            if (next != null && (next instanceof C75883TqJ) && (c75768ToS = ((C75883TqJ) next).LJIIZILJ) != null && (v2 = this.LJLILLLLZI) != 0 && (string2 = v2.getString(R.string.km9)) != null) {
                                String LLLZ2 = C16880lQ.LLLZ(string2, Arrays.copyOf(new Object[]{C05170If.LIZIZ(c75768ToS.LIZ, c75768ToS.LIZIZ)}, 1));
                                o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                                C30868C9o.LJI(LLLZ2);
                            }
                        }
                    }
                }
                return false;
            }
        }
        Iterator<Object> it3 = this.LJLJJL.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (next2 instanceof C75883TqJ) {
                C75883TqJ c75883TqJ3 = (C75883TqJ) next2;
                if (c75883TqJ3.LJJI == EnumC75909Tqj.LINKED && c75883TqJ3.LJIJJ) {
                    if (next2 != null && (next2 instanceof C75883TqJ)) {
                        C75768ToS c75768ToS3 = ((C75883TqJ) next2).LJIIZILJ;
                        if (c75768ToS3 != null && (v = this.LJLILLLLZI) != 0 && (string = v.getString(R.string.km8)) != null) {
                            String LLLZ3 = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{C05170If.LIZIZ(c75768ToS3.LIZ, c75768ToS3.LIZIZ)}, 1));
                            o.LJIIIIZZ(LLLZ3, "format(format, *args)");
                            C30868C9o.LJI(LLLZ3);
                        }
                        return false;
                    }
                }
            }
        }
        Object value = C8E.LJFF.getValue();
        o.LJIIIIZZ(value, "<get-micRoomService>(...)");
        if (!((IMicRoomService) value).oT()) {
            return true;
        }
        C30868C9o.LIZJ(R.string.m8s);
        return false;
    }

    @Override // X.AbstractC75839Tpb
    public final C75883TqJ LJ() {
        Object obj;
        Iterator<Object> it = this.LJLJJL.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof C75883TqJ) {
                    C75883TqJ c75883TqJ = (C75883TqJ) obj;
                    if (!c75883TqJ.LIZJ() && c75883TqJ.LJJI == EnumC75909Tqj.LINKED) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C75883TqJ) obj;
    }

    @Override // X.AbstractC75839Tpb
    public final int LJFF() {
        CJ2 cj2 = this.LJLJJL;
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = cj2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof C75883TqJ) && ((C75883TqJ) next).LJJI == EnumC75909Tqj.LINKED) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    @Override // X.AbstractC75839Tpb
    public final void LJIIIZ() {
        int i;
        this.LJLJJL.clear();
        List<C75883TqJ> LJIL = C8E.LIZLLL().LJIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateUserList, coHostUserList size = ");
        LIZ.append(LJIL.size());
        C0NB.LJIIIZ("MultiCoHostManager", X1D.LIZIZ(LIZ));
        List<C75883TqJ> LJIL2 = C8E.LIZLLL().LJIL();
        ArrayList arrayList = new ArrayList();
        Iterator<C75883TqJ> it = LJIL2.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C75883TqJ next = it.next();
            C75883TqJ c75883TqJ = next;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateUserList, coHostUser = ");
            LIZ2.append(c75883TqJ);
            C0NB.LJIIIZ("MultiCoHostManager", X1D.LIZIZ(LIZ2));
            if (!c75883TqJ.LIZJ() && (c75883TqJ.LJJI == EnumC75909Tqj.LINKED || c75883TqJ.LJ())) {
                arrayList.add(next);
            }
        }
        C75883TqJ LJI = C8E.LIZLLL().LJI(C44432HcC.LJI());
        if (LJI != null) {
            this.LJLJJL.add(LJI);
        }
        this.LJLJJL.addAll(arrayList);
        int size = 4 - this.LJLJJL.size();
        CJ2 cj2 = this.LJLJJL;
        C40517FvF LJJ = C78842Uww.LJJ(0, size);
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJJ, 10));
        Iterator<Integer> it2 = LJJ.iterator();
        while (it2.hasNext()) {
            ((AbstractC118224kU) it2).nextInt();
            arrayList2.add(new C75766ToQ());
        }
        cj2.addAll(arrayList2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("updateUserList, listItems size = ");
        LIZ3.append(this.LJLJJL.size());
        C0NB.LJIIIZ("MultiCoHostManager", X1D.LIZIZ(LIZ3));
        Iterator<Object> it3 = this.LJLJJL.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("updateUserList, listItem:");
                LIZ4.append(i);
                LIZ4.append(" = ");
                LIZ4.append(next2);
                C0NB.LJIIIZ("MultiCoHostManager", X1D.LIZIZ(LIZ4));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        MultiCoHostManagerContract$AbsView multiCoHostManagerContract$AbsView = (MultiCoHostManagerContract$AbsView) this.LJLILLLLZI;
        if (multiCoHostManagerContract$AbsView != null) {
            multiCoHostManagerContract$AbsView.wl(this.LJLJJL);
        }
    }

    @Override // X.AbstractC75839Tpb
    public final void LJI() {
        String str;
        List<C75883TqJ> LJIL = C8E.LIZLLL().LJIL();
        boolean z = true;
        boolean z2 = false;
        for (C75883TqJ c75883TqJ : LJIL) {
            if (c75883TqJ.LIZJ()) {
                z2 = c75883TqJ.LJIL;
            }
            if (c75883TqJ.LJIL && z) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("check topic permission, coHostUser = ");
            LIZ.append(c75883TqJ);
            LIZ.append(", topicPermission = ");
            FT5.LJ(LIZ, c75883TqJ.LJIL, LIZ, "MultiCoHostManager");
        }
        if (z) {
            MultiCoHostManagerContract$AbsView multiCoHostManagerContract$AbsView = (MultiCoHostManagerContract$AbsView) this.LJLILLLLZI;
            if (multiCoHostManagerContract$AbsView != null) {
                multiCoHostManagerContract$AbsView.Al(EnumC75763ToN.GROUP_PERMISSION, null);
                return;
            }
            return;
        }
        if (z2) {
            loop1: while (true) {
                str = "";
                for (C75883TqJ c75883TqJ2 : LJIL) {
                    if (!c75883TqJ2.LIZJ() && !c75883TqJ2.LJIL) {
                        C75768ToS c75768ToS = c75883TqJ2.LJIIZILJ;
                        if (c75768ToS == null) {
                            break;
                        }
                        str = C05170If.LIZIZ(c75768ToS.LIZ, c75768ToS.LIZIZ);
                        o.LJIIIIZZ(str, "getDisplayName(this.displayId, this.nickName)");
                    }
                }
            }
            MultiCoHostManagerContract$AbsView multiCoHostManagerContract$AbsView2 = (MultiCoHostManagerContract$AbsView) this.LJLILLLLZI;
            if (multiCoHostManagerContract$AbsView2 == null) {
                return;
            }
            multiCoHostManagerContract$AbsView2.Al(EnumC75763ToN.SELF_PERMISSION, str);
            return;
        }
        MultiCoHostManagerContract$AbsView multiCoHostManagerContract$AbsView3 = (MultiCoHostManagerContract$AbsView) this.LJLILLLLZI;
        if (multiCoHostManagerContract$AbsView3 == null) {
            return;
        }
        multiCoHostManagerContract$AbsView3.Al(EnumC75763ToN.NONE, null);
    }

    @Override // X.AbstractC75839Tpb
    public final void LJIIIIZZ() {
        C8E.LIZLLL().LJLLLLLL();
    }

    @Override // X.AbstractC75839Tpb
    public final void LIZJ(C75883TqJ user) {
        String str;
        long j;
        long j2;
        long j3;
        o.LJIIIZ(user, "user");
        C75642TmQ.LJJJJJL("active_invite_withdraw", String.valueOf(user.LIZ));
        if (user.LJFF()) {
            if (user.LJIIIIZZ && user.LJIIIZ) {
                j = user.LJIIL;
                j2 = user.LJIIJJI;
                j3 = user.LJIILIIL;
            } else {
                j = user.LIZIZ;
                j2 = user.LIZ;
                j3 = user.LIZJ;
            }
            str = "rivalIsCurrentUser";
        } else {
            str = "";
            j = 0;
            j2 = 0;
            j3 = 0;
        }
        StringBuilder LIZLLL = C1FL.LIZLLL("cancelInvite", ", ", str, ", roomId=");
        LIZLLL.append(j);
        C0MT.LIZLLL(LIZLLL, ", userId=", j2, ", channelId=");
        C0RN.LJ(LIZLLL, j3, LIZLLL, "MultiCoHostManager");
        if (user.LJIIIIZZ && user.LJIIIZ) {
            C75904Tqe c75904Tqe = new C75904Tqe(1, j, j2, j3, "cancelApply_manager", C05040Hs.LIZIZ("cancelApply_manager"));
            C30868C9o.LIZJ(R.string.kmj);
            C8E.LIZLLL().LJLIIL(c75904Tqe, new C75761ToL());
        } else {
            C75904Tqe c75904Tqe2 = new C75904Tqe(0, j, j2, j3, "cancelInvite_manager", C05040Hs.LIZIZ("cancelInvite_manager"));
            C30868C9o.LIZJ(R.string.kme);
            C8E.LIZLLL().LJLJLJ(c75904Tqe2, new C75762ToM());
        }
        LJIIIZ();
    }

    @Override // X.AbstractC75839Tpb
    public final void LJII(C75883TqJ c75883TqJ) {
        long j;
        if (c75883TqJ != null) {
            j = c75883TqJ.LIZ;
        } else {
            j = 0;
        }
        OLX olx = new OLX("leave_with_user_click_disconnect", j, 60);
        long LLIILZL = C8E.LIZLLL().LLIILZL();
        C8E.LIZLLL().LJLLJ(olx, new C75717Tnd(c75883TqJ, this, C8E.LIZLLL().LJJLI(), LLIILZL));
    }

    @Override // X.InterfaceC75451TjL
    public final void r8(CohostTopicMessage message) {
        o.LJIIIZ(message, "message");
        MultiCoHostManagerContract$AbsView multiCoHostManagerContract$AbsView = (MultiCoHostManagerContract$AbsView) this.LJLILLLLZI;
        if (multiCoHostManagerContract$AbsView != null) {
            multiCoHostManagerContract$AbsView.r8(message);
        }
    }

    @Override // X.InterfaceC75451TjL
    public final void u2(CohostTopicMessage message) {
        o.LJIIIZ(message, "message");
        MultiCoHostManagerContract$AbsView multiCoHostManagerContract$AbsView = (MultiCoHostManagerContract$AbsView) this.LJLILLLLZI;
        if (multiCoHostManagerContract$AbsView != null) {
            multiCoHostManagerContract$AbsView.u2(message);
        }
    }

    public C75760ToK(MultiCoHostManagerFragment multiCoHostManagerFragment, DataChannel dataChannel) {
        super(multiCoHostManagerFragment);
        this.LJLJJI = dataChannel;
        this.LJLJJL = new CJ2();
        AqS195S0100000_13 aqS195S0100000_13 = new AqS195S0100000_13(this, 72);
        this.LJLJJLL = aqS195S0100000_13;
        C31657Cbd c31657Cbd = new C31657Cbd("LINK_MESSAGE_CENTER");
        this.LJLJL = c31657Cbd;
        C8E.LIZLLL().LJJJZ(C75593Tld.class, aqS195S0100000_13);
        if (dataChannel != null) {
            dataChannel.mv0(MultiCoHostCountDownEvent.class, this, new AqS179S0100000_13(this, 593));
        }
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) c31657Cbd.LIZ(this, LJLJLJ[0]);
        if (linkMessageCenter != null) {
            linkMessageCenter.LIZ(this);
        }
    }
}
