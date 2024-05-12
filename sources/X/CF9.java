package X;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.level.BarrageGradeResConfig;
import com.bytedance.android.livesdk.livesetting.level.LevelBarrageQueueSizeSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBarrageSwitchSettings;
import com.bytedance.android.livesdk.livesetting.level.UserLevelTeaMonitorEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CF9 {
    public final CFN LIZ;
    public final CopyOnWriteArrayList<BarrageMessage> LIZIZ;
    public final CopyOnWriteArrayList<BarrageMessage> LIZJ;
    public boolean LIZLLL;
    public CF5 LJ;
    public final Handler LJFF;
    public final boolean LJI;
    public final int LJII;

    public CF9(CFN widgetView) {
        o.LJIIIZ(widgetView, "widgetView");
        this.LIZ = widgetView;
        this.LIZIZ = new CopyOnWriteArrayList<>();
        this.LIZJ = new CopyOnWriteArrayList<>();
        this.LIZLLL = true;
        this.LJFF = new Handler(C16880lQ.LLJJJJ());
        this.LJI = UserLevelBarrageSwitchSettings.INSTANCE.getValue();
        this.LJII = LevelBarrageQueueSizeSetting.INSTANCE.getValue();
        this.LJ = new CF5();
    }

    public static int LIZIZ(BarrageMessage barrageMessage) {
        int i = barrageMessage.msgType;
        if (i != 2) {
            if (i != 4) {
                switch (i) {
                    case 6:
                        break;
                    case 7:
                    case 9:
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        break;
                    case 8:
                    case 10:
                        return Math.max(CF1.LIZLLL(barrageMessage), 0);
                    default:
                        return 0;
                }
            } else if (CF1.LJIIJJI(barrageMessage) && CF1.LIZJ) {
                return 31;
            }
            return 20;
        }
        return 1;
    }

    public final void LIZ(BarrageMessage barrageMessage) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (barrageMessage == null) {
            return;
        }
        switch (barrageMessage.msgType) {
            case 8:
            case 10:
                int LIZLLL = CF1.LIZLLL(barrageMessage);
                if (LIZLLL <= -1) {
                    return;
                }
                BarrageGradeResConfig LJII = CF1.LJII(LIZLLL, barrageMessage.msgType);
                IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
                String str8 = null;
                if (LJII != null) {
                    str = LJII.barrageChannel;
                } else {
                    str = null;
                }
                IHostResource iHostResource2 = (IHostResource) CN1.LIZ(IHostResource.class);
                if (iHostResource2 != null) {
                    if (str == null) {
                        str = "";
                    }
                    z = iHostResource2.Br0(str);
                } else {
                    z = false;
                }
                String str9 = "unknown";
                if (z || !this.LJI) {
                    LIZJ(barrageMessage);
                    if (iHostResource != null) {
                        str2 = iHostResource.getAccessKey();
                    } else {
                        str2 = null;
                    }
                    if (LJII != null) {
                        str3 = LJII.barrageChannel;
                    } else {
                        str3 = null;
                    }
                    CF4.LIZJ(str2, str3, Integer.valueOf(LIZLLL), Integer.valueOf(barrageMessage.msgType), Boolean.TRUE);
                    if (this.LJ == null) {
                        return;
                    }
                    if (LJII != null) {
                        str8 = LJII.barrageChannel;
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (str8 != null) {
                        str9 = str8;
                    }
                    C05630Jz.LJI(jSONObject, "channel", str9);
                    CF5.LIZ(jSONObject, barrageMessage);
                    C0K2.LJIIIIZZ("grade_channel_check_exit_event", 0, jSONObject);
                    return;
                }
                if (LJII != null) {
                    str4 = LJII.barrageChannel;
                } else {
                    str4 = null;
                }
                if (str4 != null && !ujb.o.LJJJJJL(str4)) {
                    CFA cfa = new CFA(this, (IHostResource) CN1.LIZ(IHostResource.class), str4, barrageMessage);
                    InterfaceC06390Mx LIZ = CN1.LIZ(IHostResource.class);
                    o.LJIIIIZZ(LIZ, "getService(IHostResource::class.java)");
                    ((IHostResource) LIZ).FN(cfa, str4);
                }
                if (iHostResource != null) {
                    str5 = iHostResource.getAccessKey();
                } else {
                    str5 = null;
                }
                if (LJII != null) {
                    str6 = LJII.barrageChannel;
                } else {
                    str6 = null;
                }
                CF4.LIZJ(str5, str6, Integer.valueOf(LIZLLL), Integer.valueOf(barrageMessage.msgType), Boolean.FALSE);
                if (this.LJ != null) {
                    if (LJII != null) {
                        str7 = LJII.barrageChannel;
                    } else {
                        str7 = null;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    if (str7 != null) {
                        str9 = str7;
                    }
                    C05630Jz.LJI(jSONObject2, "channel", str9);
                    CF5.LIZ(jSONObject2, barrageMessage);
                    C0K2.LJIIIIZZ("grade_channel_check_exit_event", 1, jSONObject2);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("addMessage channel: ");
                if (LJII != null) {
                    str8 = LJII.barrageChannel;
                }
                LIZ2.append(str8);
                LIZ2.append(", not Exist ");
                C0NB.LJIIIZ("BarrageQueueController", X1D.LIZIZ(LIZ2));
                return;
            case 9:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZJ(barrageMessage);
                return;
            default:
                LIZJ(barrageMessage);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r2 < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.livesdk.model.message.BarrageMessage r7) {
        /*
            r6 = this;
            boolean r0 = r7.isLocalInsertMsg
            r5 = 0
            if (r0 == 0) goto L38
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZIZ
            r0.add(r7)
        La:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZJ
            int r1 = r0.size()
            int r0 = r6.LJII
            if (r1 <= r0) goto L20
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r2 = r6.LIZJ
            int r1 = r2.size()
            int r0 = r6.LJII
            int r1 = r1 - r0
            r6.LIZLLL(r2, r7, r1, r5)
        L20:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZIZ
            int r1 = r0.size()
            int r0 = r6.LJII
            if (r1 <= r0) goto L37
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r2 = r6.LIZIZ
            int r1 = r2.size()
            int r0 = r6.LJII
            int r1 = r1 - r0
            r0 = 1
            r6.LIZLLL(r2, r7, r1, r0)
        L37:
            return
        L38:
            int r4 = LIZIZ(r7)
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZJ
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L43:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r1 = r3.next()
            com.bytedance.android.livesdk.model.message.BarrageMessage r1 = (com.bytedance.android.livesdk.model.message.BarrageMessage) r1
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = LIZIZ(r1)
            if (r4 <= r0) goto L68
        L5a:
            if (r2 >= 0) goto L62
        L5c:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZJ
            int r2 = r0.size()
        L62:
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.livesdk.model.message.BarrageMessage> r0 = r6.LIZJ
            r0.add(r2, r7)
            goto La
        L68:
            if (r4 != r0) goto L77
            boolean r0 = X.CF1.LIZIZ(r7)
            if (r0 == 0) goto L77
            boolean r0 = X.CF1.LIZIZ(r1)
            if (r0 != 0) goto L77
            goto L5a
        L77:
            int r2 = r2 + 1
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CF9.LIZJ(com.bytedance.android.livesdk.model.message.BarrageMessage):void");
    }

    public final void LIZLLL(CopyOnWriteArrayList<BarrageMessage> copyOnWriteArrayList, BarrageMessage barrageMessage, int i, boolean z) {
        int i2 = 0;
        boolean z2 = false;
        if (1 <= i) {
            int i3 = 1;
            while (true) {
                CR6 cr6 = (CR6) ORS.LJJLL(copyOnWriteArrayList);
                if (!z2 && barrageMessage.getMessageId() == cr6.getMessageId()) {
                    z2 = true;
                }
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        C29827BnD.LIZ(barrageMessage, "bufferOverSize");
        if (this.LJ != null) {
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LIZ(i, "delete_size", jSONObject);
            C05630Jz.LJII(jSONObject, "queue_type", z);
            C05630Jz.LJII(jSONObject, "delete_insert_msg", z2);
            C0K2.LJIIIIZZ("grade_delete_more_msg_event", 0, jSONObject);
        }
        Integer valueOf = Integer.valueOf(i);
        Boolean valueOf2 = Boolean.valueOf(z);
        Boolean valueOf3 = Boolean.valueOf(z2);
        Integer valueOf4 = Integer.valueOf(barrageMessage.msgType);
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue() || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_barrage_removed_from_queue", 0.1d)) {
            return;
        }
        try {
            BZI LIZ = C28787BRn.LIZ("livesdk_barrage_removed_from_queue");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(valueOf, "delete_size");
            Boolean bool = Boolean.TRUE;
            if (o.LJ(valueOf2, bool)) {
                i2 = 1;
            }
            LIZ.LJIJJ(Integer.valueOf(i2), "queue_type");
            LIZ.LJIJJ(Integer.valueOf(o.LJ(valueOf3, bool) ? 1 : 0), "delete_insert_msg");
            LIZ.LJIJJ(valueOf4, "barrage_type");
            LIZ.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }
}
