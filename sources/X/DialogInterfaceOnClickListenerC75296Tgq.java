package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Tgq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC75296Tgq implements DialogInterface.OnClickListener {
    public final /* synthetic */ MultiLiveAnchorSettingDialog LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ EnumC75310Th4 LJLJI;

    public DialogInterfaceOnClickListenerC75296Tgq(MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog, boolean z, EnumC75310Th4 enumC75310Th4) {
        this.LJLIL = multiLiveAnchorSettingDialog;
        this.LJLILLLLZI = z;
        this.LJLJI = enumC75310Th4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        boolean z;
        int LJIIIZ;
        EnumC74991Tbv LJJ;
        String businessType;
        U8H LJJZZI;
        String str;
        dialogInterface.dismiss();
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<Long> arrayList = CL8.LIZIZ;
        boolean z2 = true;
        if (arrayList.size() < CL8.LIZ) {
            arrayList.add(Long.valueOf(currentTimeMillis));
        } else {
            Object obj = ListProtector.get(arrayList, 0);
            o.LJIIIIZZ(obj, "switchLayoutRecords[0]");
            if (currentTimeMillis - ((Number) obj).longValue() < 60000) {
                C30868C9o.LIZJ(R.string.nji);
                String Sl = this.LJLIL.Sl();
                multiLiveAnchorPanelSettings = this.LJLIL.LLJLLL;
                if (multiLiveAnchorPanelSettings != null || multiLiveAnchorPanelSettings.fixMicNumAction != 0) {
                    z2 = false;
                }
                C74824TYe.LJJL(Sl, "switch", z2, this.LJLILLLLZI);
            }
            ListProtector.remove(arrayList, 0);
            arrayList.add(Long.valueOf(currentTimeMillis));
        }
        MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog = this.LJLIL;
        AbstractC75306Th0 abstractC75306Th0 = (AbstractC75306Th0) multiLiveAnchorSettingDialog.LJLILLLLZI;
        if (abstractC75306Th0 != null) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = multiLiveAnchorSettingDialog.LLJLLL;
            if (multiLiveAnchorPanelSettings2 != null) {
                MultiLiveAnchorPanelSettings.L(multiLiveAnchorPanelSettings2);
            }
            abstractC75306Th0.LIZLLL();
            z = true;
        } else {
            z = false;
        }
        EnumC74991Tbv enumC74991Tbv = null;
        if (z) {
            String Rl = this.LJLIL.Rl();
            String Ql = this.LJLIL.Ql();
            String str2 = "";
            if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable()) {
                InterfaceC75441TjB R6 = C8E.LJ().R6();
                if (R6 != null) {
                    if (Ql == null) {
                        str = "";
                    } else {
                        str = Ql;
                    }
                    R6.LJJJJL(str);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sourceLayoutId:");
                LIZ.append(Rl);
                LIZ.append(", targetLayoutId:");
                LIZ.append(Ql);
                C0NB.LIZIZ("MultiLiveAnchorSettingDialog", X1D.LIZIZ(LIZ));
                InterfaceC75441TjB R62 = C8E.LJ().R6();
                if (R62 != null && (LJJZZI = R62.LJJZZI()) != null) {
                    if (Ql != null) {
                        str2 = Ql;
                    }
                    LJIIIZ = LJJZZI.LJJII(str2);
                } else {
                    LJIIIZ = 0;
                }
            } else {
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = this.LJLIL.LLJLLL;
                C74983Tbn LIZ2 = C29556Biq.LIZ();
                if (multiLiveAnchorPanelSettings3 != null && (LJJ = C86793Y4n.LJJ(multiLiveAnchorPanelSettings3)) != null && (businessType = LJJ.getBusinessType()) != null) {
                    str2 = businessType;
                }
                LIZ2.getClass();
                LJIIIZ = C74983Tbn.LJIIIZ(str2);
            }
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings4 = this.LJLIL.LLJLLL;
            if (multiLiveAnchorPanelSettings4 != null) {
                enumC74991Tbv = C86793Y4n.LJJ(multiLiveAnchorPanelSettings4);
            }
            int LJFF = C74776TWi.LJFF(enumC74991Tbv);
            StringBuilder LIZ3 = C06830Op.LIZ("switch layout: maxPos:", LJIIIZ, ", layoutId:", Ql, ", displayId:");
            C1DD.LJFF(LIZ3, LJFF, LIZ3, "MultiLiveAnchorSettingDialog");
            MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog2 = this.LJLIL;
            AbstractC75306Th0 abstractC75306Th02 = (AbstractC75306Th0) multiLiveAnchorSettingDialog2.LJLILLLLZI;
            if (abstractC75306Th02 != null) {
                abstractC75306Th02.LIZJ(LJIIIZ, Ql, LJFF, new C75298Tgs(multiLiveAnchorSettingDialog2, Ql, LJFF, this.LJLJI, Rl));
            }
        } else {
            MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog3 = this.LJLIL;
            multiLiveAnchorSettingDialog3.Yl(multiLiveAnchorSettingDialog3.Ql(), null);
        }
        String Sl2 = this.LJLIL.Sl();
        multiLiveAnchorPanelSettings = this.LJLIL.LLJLLL;
        if (multiLiveAnchorPanelSettings != null) {
        }
        z2 = false;
        C74824TYe.LJJL(Sl2, "switch", z2, this.LJLILLLLZI);
    }
}
