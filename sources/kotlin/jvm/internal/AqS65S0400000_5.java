package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.B83;
import X.BAF;
import X.BAG;
import X.BZI;
import X.C03880Dg;
import X.C12830et;
import X.C12840eu;
import X.C12850ev;
import X.C15380j0;
import X.C15950jv;
import X.C16880lQ;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29494Bhq;
import X.C29852Bnc;
import X.C29948BpA;
import X.C30868C9o;
import X.C30923CBr;
import X.C31124CJk;
import X.C32044Chs;
import X.C32802Cu6;
import X.C32804Cu8;
import X.C32816CuK;
import X.C32823CuR;
import X.C32825CuT;
import X.C32833Cub;
import X.C34K;
import X.C47071t1;
import X.C65300Pk0;
import X.C68322mC;
import X.C72242sW;
import X.C73943T0h;
import X.C76800UCe;
import X.C88558YpG;
import X.EnumC35442Dva;
import X.InterfaceC65784Pro;
import X.UV7;
import X.V16;
import X.ZCL;
import Y.IDcS93S0200000_5;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.SendGiftSuccessEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.gift.event.LiveGiftSentSucceedEvent;
import com.bytedance.android.livesdk.gift.model.CalmDownInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfoForSend;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class AqS65S0400000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        FragmentManager fragmentManager = (FragmentManager) ((DataChannel) this.l0).kv0(C29494Bhq.class);
        CalmDownInfo calmDownInfo = (CalmDownInfo) this.l1;
        if (calmDownInfo.mShowPopup == 1 && fragmentManager != null) {
            C32833Cub.LJ(EnumC35442Dva.DialogCountdown, calmDownInfo.mRemainTime * 1000);
            C32833Cub.LIZLLL((CalmDownInfo) this.l1, fragmentManager);
            long j = ((CalmDownInfo) this.l1).mThresholdValue;
            BZI LIZ = C28787BRn.LIZ("livesdk_consume_limit_prompt_popup_show");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(Long.valueOf(j), "limit_prompt_money");
            LIZ.LJJIIJZLJL();
            return;
        }
        String LIZJ = C32833Cub.LIZJ(calmDownInfo);
        String string = C15380j0.LJIIJ().getString(R.string.ko_);
        if (string == null) {
            string = "";
        }
        if (LIZJ.length() > 0 && (!ujb.o.LJJJJJL(string))) {
            String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{LIZJ}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            C30868C9o.LJI(LLLZ);
        }
        if (!(((C32804Cu8) this.l2) instanceof C32825CuT)) {
            C73943T0h.LIZ().LIZIZ(new ZCL(((CalmDownInfo) this.l1).mRemainTime * 1000, C32833Cub.LIZIZ()));
            C32833Cub.LJ(EnumC35442Dva.ItemCountdown, ((CalmDownInfo) this.l1).mRemainTime * 1000);
        }
        C32802Cu6.LJIILIIL((C32804Cu8) this.l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS65S0400000_5 aqS65S0400000_5) {
        long j;
        if (((C34K) aqS65S0400000_5.l0).element) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) ((C68322mC) aqS65S0400000_5.l1).element;
            if (activityC45651qj != null) {
                C31124CJk c31124CJk = (C31124CJk) aqS65S0400000_5.l3;
                C32044Chs.LJIIJ(activityC45651qj.getSupportFragmentManager(), c31124CJk, c31124CJk.LJLIL.containerId, new C30923CBr((SparkContext) aqS65S0400000_5.l2));
            }
        } else {
            SparkContext sparkContext = (SparkContext) aqS65S0400000_5.l2;
            C12850ev c12850ev = C12840eu.LIZ;
            if (((ArrayList) c12850ev.LIZIZ).isEmpty()) {
                j = 0;
            } else {
                j = ((C12830et) ListProtector.get(c12850ev.LIZIZ, ((ArrayList) r1).size() - 1)).LJIIIIZZ;
            }
            sparkContext.LJJIIZ(String.valueOf(j), "sheet_stack_token");
            C31124CJk c31124CJk2 = (C31124CJk) aqS65S0400000_5.l3;
            String str = c31124CJk2.LJLIL.containerId;
            if (!((ArrayList) c12850ev.LIZIZ).isEmpty()) {
                ((C12830et) ListProtector.get(c12850ev.LIZIZ, ((ArrayList) r1).size() - 1)).LJIIIZ(c31124CJk2, str);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS65S0400000_5 aqS65S0400000_5) {
        LifecycleOwner lifecycleOwner;
        BAF.LJIIJ((DataChannel) aqS65S0400000_5.l0, "guest_connection_enlarge_screen", "interaction_icon", true);
        Context context = (Context) aqS65S0400000_5.l1;
        if (context != null) {
            C47071t1 c47071t1 = new C47071t1(context);
            c47071t1.LJIILL = false;
            c47071t1.LJIILJJIL = false;
            c47071t1.LJIILLIIL(R.string.kts);
            c47071t1.LJFF(R.string.ksz);
            DataChannel dataChannel = (DataChannel) aqS65S0400000_5.l0;
            if (dataChannel != null) {
                lifecycleOwner = dataChannel.LJLJJI;
            } else {
                lifecycleOwner = null;
            }
            c47071t1.LIZIZ = lifecycleOwner;
            c47071t1.LJIIIZ(R.string.kg7, BAG.LJLIL);
            c47071t1.LJIIL(R.string.ktl, new IDcS93S0200000_5((IInteractService) aqS65S0400000_5.l2, (InterfaceC65784Pro) aqS65S0400000_5.l3, 10));
            LiveDialog LIZ = c47071t1.LIZ();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "4115071473085874036")).LIZ) {
                LIZ.show();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS65S0400000_5 aqS65S0400000_5) {
        String str;
        long j;
        long j2;
        long j3;
        User owner;
        LiveMode streamType;
        long currentTimeMillis = System.currentTimeMillis();
        C72242sW c72242sW = (C72242sW) aqS65S0400000_5.l0;
        if ((currentTimeMillis - c72242sW.element) / 1000 >= 1) {
            c72242sW.element = System.currentTimeMillis();
            ((C29948BpA) aqS65S0400000_5.l1).LJLIL.LLFF(String.valueOf((Long) aqS65S0400000_5.l2));
            Room room = (Room) aqS65S0400000_5.l3;
            if (room != null && (streamType = room.getStreamType()) != null) {
                str = streamType.logStreamingType;
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            Room room2 = (Room) aqS65S0400000_5.l3;
            if (room2 != null && (owner = room2.getOwner()) != null) {
                j = owner.getId();
            } else {
                j = 0;
            }
            Room room3 = (Room) aqS65S0400000_5.l3;
            if (room3 != null) {
                j2 = room3.getId();
            } else {
                j2 = 0;
            }
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lqy);
            if (LJIILJJIL != null) {
                str2 = LJIILJJIL;
            }
            Long l = (Long) aqS65S0400000_5.l2;
            if (l != null) {
                j3 = l.longValue();
            } else {
                j3 = 0;
            }
            C29852Bnc.LIZ(str, j, j2, currentUserId, j3, "all", "finished_goal", str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS65S0400000_5 aqS65S0400000_5) {
        String str;
        long j;
        long j2;
        long j3;
        User owner;
        LiveMode streamType;
        long currentTimeMillis = System.currentTimeMillis();
        C72242sW c72242sW = (C72242sW) aqS65S0400000_5.l0;
        if ((currentTimeMillis - c72242sW.element) / 1000 >= 1) {
            c72242sW.element = System.currentTimeMillis();
            ((C29948BpA) aqS65S0400000_5.l1).LJII((Long) aqS65S0400000_5.l2);
            Room room = (Room) aqS65S0400000_5.l3;
            if (room != null && (streamType = room.getStreamType()) != null) {
                str = streamType.logStreamingType;
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            Room room2 = (Room) aqS65S0400000_5.l3;
            if (room2 != null && (owner = room2.getOwner()) != null) {
                j = owner.getId();
            } else {
                j = 0;
            }
            Room room3 = (Room) aqS65S0400000_5.l3;
            if (room3 != null) {
                j2 = room3.getId();
            } else {
                j2 = 0;
            }
            long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lqs);
            if (LJIILJJIL != null) {
                str2 = LJIILJJIL;
            }
            Long l = (Long) aqS65S0400000_5.l2;
            if (l != null) {
                j3 = l.longValue();
            } else {
                j3 = 0;
            }
            C29852Bnc.LIZ(str, j, j2, currentUserId, j3, "anchor", "ask_top_users", str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS65S0400000_5 aqS65S0400000_5) {
        C32823CuR c32823CuR;
        DataChannel dataChannel = (DataChannel) aqS65S0400000_5.l0;
        long j = ((C32804Cu8) aqS65S0400000_5.l1).LIZ;
        int LJJLJ = V16.LJJLJ((C32816CuK) aqS65S0400000_5.l2);
        int LJJLIL = V16.LJJLIL((C32816CuK) aqS65S0400000_5.l2);
        String str = ((C88558YpG) aqS65S0400000_5.l3).LIZJ;
        C32804Cu8 c32804Cu8 = (C32804Cu8) aqS65S0400000_5.l1;
        GiftsBoxInfoForSend giftsBoxInfoForSend = null;
        if ((c32804Cu8 instanceof C32823CuR) && (c32823CuR = (C32823CuR) c32804Cu8) != null) {
            giftsBoxInfoForSend = c32823CuR.LJJIIZI;
        }
        dataChannel.qv0(SendGiftSuccessEvent.class, new C15950jv(j, LJJLJ, LJJLIL, str, giftsBoxInfoForSend));
        ((DataChannel) aqS65S0400000_5.l0).qv0(LiveGiftSentSucceedEvent.class, ((C88558YpG) aqS65S0400000_5.l3).LIZJ);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AqS65S0400000_5 aqS65S0400000_5) {
        aqS65S0400000_5.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS65S0400000_5 aqS65S0400000_5) {
        C32823CuR c32823CuR;
        DataChannel dataChannel = (DataChannel) aqS65S0400000_5.l0;
        long j = ((C32804Cu8) aqS65S0400000_5.l1).LIZ;
        int LJJLJ = V16.LJJLJ((C32816CuK) aqS65S0400000_5.l2);
        int LJJLIL = V16.LJJLIL((C32816CuK) aqS65S0400000_5.l2);
        String str = ((UV7) aqS65S0400000_5.l3).LJLIL.LIZIZ;
        o.LJIIIIZZ(str, "success.resp.logId");
        C32804Cu8 c32804Cu8 = (C32804Cu8) aqS65S0400000_5.l1;
        GiftsBoxInfoForSend giftsBoxInfoForSend = null;
        if ((c32804Cu8 instanceof C32823CuR) && (c32823CuR = (C32823CuR) c32804Cu8) != null) {
            giftsBoxInfoForSend = c32823CuR.LJJIIZI;
        }
        dataChannel.qv0(SendGiftSuccessEvent.class, new C15950jv(j, LJJLJ, LJJLIL, str, giftsBoxInfoForSend));
        ((DataChannel) aqS65S0400000_5.l0).qv0(LiveGiftSentSucceedEvent.class, ((UV7) aqS65S0400000_5.l3).LJLIL.LIZIZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0400000_5(C72242sW c72242sW, C29948BpA c29948BpA, Long l, Room room, int i) {
        super(0);
        this.$t = i;
        this.l0 = c72242sW;
        this.l1 = c29948BpA;
        this.l2 = l;
        this.l3 = room;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS65S0400000_5(C34K c34k, C34K c34k2, C68322mC<ActivityC45651qj> c68322mC, SparkContext sparkContext, C31124CJk c31124CJk) {
        super(0);
        this.$t = c31124CJk;
        this.l0 = c34k;
        this.l1 = c34k2;
        this.l2 = c68322mC;
        this.l3 = sparkContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0400000_5(DataChannel dataChannel, C32804Cu8 c32804Cu8, C32816CuK c32816CuK, UV7 uv7, int i) {
        super(0);
        this.$t = i;
        this.l0 = dataChannel;
        this.l1 = c32804Cu8;
        this.l2 = c32816CuK;
        this.l3 = uv7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0400000_5(DataChannel dataChannel, C32804Cu8 c32804Cu8, C32816CuK c32816CuK, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l0 = dataChannel;
        this.l1 = c32804Cu8;
        this.l2 = c32816CuK;
        this.l3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS65S0400000_5(DataChannel dataChannel, DataChannel dataChannel2, Context context, IInteractService iInteractService, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = dataChannel;
        this.l1 = dataChannel2;
        this.l2 = context;
        this.l3 = iInteractService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0400000_5(DataChannel dataChannel, CalmDownInfo calmDownInfo, C32804Cu8 c32804Cu8, C32802Cu6 c32802Cu6, int i) {
        super(0);
        this.$t = i;
        this.l0 = dataChannel;
        this.l1 = calmDownInfo;
        this.l2 = c32804Cu8;
        this.l3 = c32802Cu6;
    }
}
