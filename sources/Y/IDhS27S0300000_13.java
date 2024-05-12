package Y;

import X.C15610jN;
import X.C75918Tqs;
import X.C75919Tqt;
import X.C76677U7l;
import X.C76689U7x;
import X.C76690U7y;
import X.InterfaceC48038ItG;
import X.InterfaceC76622U5i;
import X.InterfaceC76675U7j;
import X.InterfaceC76768UAy;
import X.InterfaceC92693kP;
import X.OSZ;
import X.R2P;
import X.U4R;
import X.U7T;
import X.U7U;
import X.UA0;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPreJoinChannelSetting;
import defpackage.b1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import tikcast.linkmic.controller.JoinGroupResp;
import webcast.data.cohost_biz.BizJoinGroupResponse;

/* loaded from: classes14.dex */
public class IDhS27S0300000_13 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS27S0300000_13 iDhS27S0300000_13, Object obj) {
        R2P cancelJoinGroupResp = (R2P) obj;
        o.LJIIIZ(cancelJoinGroupResp, "cancelJoinGroupResp");
        StringBuilder LIZJ = b1.LIZJ("cancel apply group", " success data=");
        LIZJ.append((C75918Tqs) iDhS27S0300000_13.l0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        C76677U7l c76677U7l = ((U7T) iDhS27S0300000_13.l1).LJJLIIIJ;
        if (c76677U7l != null) {
            long j = ((C75918Tqs) iDhS27S0300000_13.l0).LJLILLLLZI;
            c76677U7l.LJ.remove(Long.valueOf(j));
            InterfaceC92693kP interfaceC92693kP = c76677U7l.LIZJ.get(Long.valueOf(j));
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
            c76677U7l.LIZJ.remove(Long.valueOf(j));
        }
        U7T u7t = (U7T) iDhS27S0300000_13.l1;
        CopyOnWriteArrayList<InterfaceC76675U7j> copyOnWriteArrayList = u7t.LJIIIIZZ;
        C75918Tqs c75918Tqs = (C75918Tqs) iDhS27S0300000_13.l0;
        Iterator<InterfaceC76675U7j> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LJJIIZ(u7t, c75918Tqs.LJLILLLLZI);
        }
        if (((U7T) iDhS27S0300000_13.l1).LJIIJJI.LJJIJIIJI() == null) {
            ((U7T) iDhS27S0300000_13.l1).LJJJJZI("stop_join_channel_advance", "stop_join_channel_advance", true, null);
        }
        return Boolean.valueOf(C15610jN.LIZ().post(new ARunnableS32S0200000_13(cancelJoinGroupResp, (InterfaceC76768UAy) iDhS27S0300000_13.l2, 77)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(IDhS27S0300000_13 iDhS27S0300000_13, Object obj) {
        R2P joinGroupResp = (R2P) obj;
        o.LJIIIZ(joinGroupResp, "joinGroupResp");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("inviteGroup success data=");
        LIZ.append((C76690U7y) iDhS27S0300000_13.l0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        UA0 ua0 = ((C76690U7y) iDhS27S0300000_13.l0).LJI;
        OSZ<Integer, Throwable> osz = null;
        BizJoinGroupResponse bizJoinGroupResponse = null;
        if (ua0 != null) {
            JoinGroupResp joinGroupResp2 = (JoinGroupResp) joinGroupResp.data;
            if (joinGroupResp2 != null) {
                bizJoinGroupResponse = joinGroupResp2.cohostRespExtra;
            }
            osz = ua0.LIZ(bizJoinGroupResponse);
        }
        boolean z = false;
        if (osz != null && osz.getFirst().intValue() == 2) {
            Throwable second = osz.getSecond();
            if (second == null) {
                throw new Exception(LinkCoreError.Companion.getBLOCK_BY_BIZ_SIDE().toString());
            }
            throw second;
        }
        ((U7T) iDhS27S0300000_13.l1).LJIIJJI.LJIIL(((C76690U7y) iDhS27S0300000_13.l0).LIZIZ);
        U7T u7t = (U7T) iDhS27S0300000_13.l1;
        Iterator<InterfaceC76675U7j> it = u7t.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            it.next().LJJIII(u7t, ((JoinGroupResp) joinGroupResp.data).groupUser, joinGroupResp.extra.now);
        }
        if (!((U7T) iDhS27S0300000_13.l1).LJIIIZ.LIZJ && !((U7T) iDhS27S0300000_13.l1).LJIIIZ.LIZ && !TextUtils.isEmpty(((U7T) iDhS27S0300000_13.l1).LJIIJ)) {
            Iterator<InterfaceC76622U5i> it2 = ((U7T) iDhS27S0300000_13.l1).LJII.iterator();
            while (it2.hasNext()) {
                z = it2.next().LLFFF();
            }
            if (z && MultiHostPreJoinChannelSetting.INSTANCE.getValue().sendInviteEnable) {
                U7T u7t2 = (U7T) iDhS27S0300000_13.l1;
                U7U.LJIIZILJ(u7t2.LJIIIZ, u7t2, U7T.LJJI(u7t2.LJIIJ), true, false, false, false, "business_multi_host_invite", null, 128);
            }
        }
        return Boolean.valueOf(C15610jN.LIZ().post(new ARunnableS32S0200000_13(joinGroupResp, (InterfaceC76768UAy) iDhS27S0300000_13.l2, 83)));
    }

    public static final Object apply$2(IDhS27S0300000_13 iDhS27S0300000_13, Object obj) {
        R2P cancelJoinGroupResp = (R2P) obj;
        o.LJIIIZ(cancelJoinGroupResp, "cancelJoinGroupResp");
        StringBuilder LIZJ = b1.LIZJ("cancel invite join group", " success data=");
        LIZJ.append((C75919Tqt) iDhS27S0300000_13.l0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        C76677U7l c76677U7l = ((U7T) iDhS27S0300000_13.l1).LJJLIIIJ;
        if (c76677U7l != null) {
            c76677U7l.LIZIZ(((C75919Tqt) iDhS27S0300000_13.l0).LJLILLLLZI);
        }
        U7T u7t = (U7T) iDhS27S0300000_13.l1;
        CopyOnWriteArrayList<InterfaceC76675U7j> copyOnWriteArrayList = u7t.LJIIIIZZ;
        C75919Tqt c75919Tqt = (C75919Tqt) iDhS27S0300000_13.l0;
        Iterator<InterfaceC76675U7j> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LJIJJ(u7t, c75919Tqt.LJLILLLLZI);
        }
        if (((U7T) iDhS27S0300000_13.l1).LJIIJJI.LJJIJIIJI() == null) {
            ((U7T) iDhS27S0300000_13.l1).LJJJJZI("stop_join_channel_advance", "stop_join_channel_advance", true, null);
        }
        U4R.LIZLLL("Linker", "handleCallbackResult callback for business");
        return Boolean.valueOf(C15610jN.LIZ().post(new ARunnableS32S0200000_13(cancelJoinGroupResp, (InterfaceC76768UAy) iDhS27S0300000_13.l2, 86)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$3(IDhS27S0300000_13 iDhS27S0300000_13, Object obj) {
        R2P joinGroupResp = (R2P) obj;
        o.LJIIIZ(joinGroupResp, "joinGroupResp");
        StringBuilder LIZJ = b1.LIZJ("apply group", " success data=");
        LIZJ.append((C76689U7x) iDhS27S0300000_13.l0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        UA0 ua0 = ((C76689U7x) iDhS27S0300000_13.l0).LJI;
        OSZ<Integer, Throwable> osz = null;
        BizJoinGroupResponse bizJoinGroupResponse = null;
        if (ua0 != null) {
            JoinGroupResp joinGroupResp2 = (JoinGroupResp) joinGroupResp.data;
            if (joinGroupResp2 != null) {
                bizJoinGroupResponse = joinGroupResp2.cohostRespExtra;
            }
            osz = ua0.LIZ(bizJoinGroupResponse);
        }
        boolean z = false;
        if (osz != null && osz.getFirst().intValue() == 2) {
            Throwable second = osz.getSecond();
            if (second == null) {
                throw new Exception(LinkCoreError.Companion.getBLOCK_BY_BIZ_SIDE().toString());
            }
            throw second;
        }
        ((U7T) iDhS27S0300000_13.l1).LJIIJJI.LJIIJJI(((C76689U7x) iDhS27S0300000_13.l0).LIZIZ);
        U7T u7t = (U7T) iDhS27S0300000_13.l1;
        Iterator<InterfaceC76675U7j> it = u7t.LJIIIIZZ.iterator();
        while (it.hasNext()) {
            it.next().LJJIIJZLJL(u7t, ((JoinGroupResp) joinGroupResp.data).groupUser, joinGroupResp.extra.now);
        }
        if (!((U7T) iDhS27S0300000_13.l1).LJIIIZ.LIZJ && !((U7T) iDhS27S0300000_13.l1).LJIIIZ.LIZ && !TextUtils.isEmpty(((U7T) iDhS27S0300000_13.l1).LJIIJ)) {
            Iterator<InterfaceC76622U5i> it2 = ((U7T) iDhS27S0300000_13.l1).LJII.iterator();
            while (it2.hasNext()) {
                z = it2.next().LLFFF();
            }
            if (z && MultiHostPreJoinChannelSetting.INSTANCE.getValue().sendApplyEnable) {
                U7T u7t2 = (U7T) iDhS27S0300000_13.l1;
                U7U.LJIIZILJ(u7t2.LJIIIZ, u7t2, U7T.LJJI(u7t2.LJIIJ), true, false, false, false, "business_multi_host_apply", null, 128);
            }
        }
        return Boolean.valueOf(C15610jN.LIZ().post(new ARunnableS32S0200000_13(joinGroupResp, (InterfaceC76768UAy) iDhS27S0300000_13.l2, 91)));
    }

    public IDhS27S0300000_13(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
