package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkMicState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPerfSladarReportSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.crash.CrashType;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.services.apm.api.IApmAgent;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wg5.b;
import wg5.c;

/* loaded from: classes14.dex */
public final class UC0 implements C4JZ {
    public static final UC0 LIZ = new UC0();

    @Override // X.C4JZ
    public void LIZ(String str) {
    }

    public static IApmAgent LJIL() {
        if (C171096nZ.LIZ(IApmAgent.class) == null) {
            try {
                C171096nZ.LIZIZ(IApmAgent.class, new C64114PEg((IApmAgent) Class.forName("com.bytedance.apm.impl.ApmAgentServiceImpl").newInstance()));
            } catch (Throwable unused) {
            }
        }
        return (IApmAgent) C171096nZ.LIZ(IApmAgent.class);
    }

    public static final boolean LJJIIZ() {
        return Keva.getRepo("facebook_sync_repo").getBoolean("facebook_sync_is_removing", false);
    }

    public static final boolean LJJIJIIJI() {
        return Keva.getRepo("mlbb_sync_repo").getBoolean("mlbb_sync_is_removing", false);
    }

    public static final boolean LJJIJIIJIL() {
        return Keva.getRepo("contacts_sync_repo").getBoolean("contacts_sync_is_removing", false);
    }

    public static final boolean LJJIJIL() {
        return IWF.LJJLIIIIJ().isPlaying();
    }

    public static boolean LJJLI() {
        LiveOuterService.LJJJLL().LJJIJLIJ();
        return !Live.invalid();
    }

    public static EnumC47176IfM LIZIZ(String str) {
        for (EnumC47176IfM enumC47176IfM : EnumC47176IfM.values()) {
            if (TextUtils.equals(str, enumC47176IfM.toString(0))) {
                return enumC47176IfM;
            }
        }
        return EnumC47176IfM.Standard;
    }

    public static final InterfaceC68914R2w LJ(InterfaceC68904R2m asDataSource) {
        o.LJIIJ(asDataSource, "$this$asDataSource");
        return (InterfaceC68914R2w) ((AbstractC68899R2h) asDataSource).LIZ.getValue();
    }

    public static final InterfaceC68914R2w LJFF(InterfaceC68903R2l asDataSource) {
        o.LJIIJ(asDataSource, "$this$asDataSource");
        return (InterfaceC68914R2w) ((AbstractC68898R2g) asDataSource).LIZ.getValue();
    }

    public static final InterfaceC68914R2w LJI(InterfaceC68907R2p asDataSource) {
        o.LJIIJ(asDataSource, "$this$asDataSource");
        return (InterfaceC68914R2w) ((R30) asDataSource).LIZ.getValue();
    }

    public static int LJIIIZ(QW9 qw9) {
        if (qw9 == null) {
            return QW9.Device.getValue();
        }
        return qw9.getValue();
    }

    public static C46625IRp LJIIJ(Context context) {
        if (context == null) {
            return null;
        }
        return C46625IRp.LIZLLL(context);
    }

    public static final U94 LJIILIIL(int i) {
        if (i != 2) {
            if (i != 4) {
                return U94.MULTI_GUEST;
            }
            return U94.MULTI_GUEST;
        }
        return U94.MULTI_HOST;
    }

    public static final int LJIILJJIL(Throwable th) {
        if (th instanceof C29401Dk) {
            return ((C276516r) th).getErrorCode();
        }
        return 1;
    }

    public static final OSZ LJIILL(Throwable th) {
        OSZ osz;
        String message;
        String str = "";
        if (th instanceof C29401Dk) {
            Long valueOf = Long.valueOf(r4.getErrorCode());
            String errorMsg = ((C29401Dk) th).getErrorMsg();
            if (errorMsg != null) {
                str = errorMsg;
            }
            osz = new OSZ(valueOf, str);
        } else {
            if (th != null && (message = th.getMessage()) != null) {
                str = message;
            }
            osz = new OSZ(1L, str);
        }
        return osz;
    }

    public static final String LJIJ(Throwable th) {
        if (th instanceof CH1) {
            return ((CH1) th).getxTtLogId();
        }
        return null;
    }

    public static final JSONObject LJIJI(U66 linker) {
        String str;
        MicPositionInfo micPositionData;
        Object valueOf;
        boolean z;
        o.LJIIIZ(linker, "linker");
        JSONObject jSONObject = new JSONObject();
        try {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            UC5 uc5 = null;
            if (room != null) {
                str = room.getIdStr();
            } else {
                str = null;
            }
            jSONObject.put("room_id", String.valueOf(str));
            jSONObject.put("current_user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            jSONObject.put("channel_id", String.valueOf(linker.LJJLI()));
            jSONObject.put("linked_users_num", linker.LLZZ().LJJIIZI().size());
            jSONObject.put("linkmic_state", LinkMicState.Companion.castStateToString(linker.k().LIZ));
            OnLineMicInfo LJII = linker.c().LJII(linker.LLZL().getLinkMicId());
            String str2 = "";
            if (LJII == null || (micPositionData = LJII.getMicPositionData()) == null) {
                valueOf = "";
            } else {
                valueOf = Integer.valueOf(micPositionData.getStrategy());
            }
            jSONObject.put("mic_position_strategy", valueOf);
            DSLConfig LLZZZIL = linker.LLZZZIL();
            int i = 0;
            if (LLZZZIL != null) {
                JSONObject jSONObject2 = new JSONObject(C09650Zl.LIZIZ.LJIILL(LLZZZIL));
                InterfaceC75011TcF JR = ((ILinkMicService) CN1.LIZ(ILinkMicService.class)).JR();
                if (JR != null) {
                    uc5 = JR.LIZLLL();
                }
                if (uc5 == UC5.LOCAL) {
                    z = true;
                } else {
                    z = false;
                }
                jSONObject2.put("is_default", z);
                jSONObject.put("dsl_info", jSONObject2);
            }
            linker.LLLLZLL();
            jSONObject.put("rtc_version", U7U.LJIILL());
            String layoutType = linker.LLLZI().getLayoutType();
            if (layoutType != null) {
                str2 = layoutType;
            }
            jSONObject.put("layout_name", str2);
            if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
                jSONObject.put("group_channel_id", linker.LLZZ().LJJIJIIJI());
            }
            if (C1XY.LJIJJ(linker) && linker.getScene() == 4) {
                if (linker.LLLLJI()) {
                    i = 1;
                }
                jSONObject.put("is_resume_broadcast", String.valueOf(i));
            }
        } catch (Exception e) {
            C0K2.LIZ("LinkLayerMonitor Error", e);
        }
        return jSONObject;
    }

    public static Activity LJIJJLI(WeakReference weakReference) {
        if (weakReference == null) {
            return null;
        }
        for (Context context = (Context) weakReference.get(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                return LJIJJ;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public static String LJJ(Context context) {
        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
        if (LLIIJLIL != null) {
            File file = new File(LLIIJLIL.getAbsolutePath(), "ALOG");
            if (!file.exists()) {
                file.mkdir();
            }
            return file.getAbsolutePath();
        }
        return null;
    }

    public static Context LJJI(WeakReference weakReference) {
        if (weakReference == null) {
            return null;
        }
        for (Context context = (Context) weakReference.get(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                return LJIJJ;
            }
            if (!(context instanceof ContextWrapper)) {
                return context;
            }
        }
        return null;
    }

    public static final AbstractC53895LDf LJJIFFI(AbstractC53895LDf abstractC53895LDf) {
        if (abstractC53895LDf instanceof AbstractC53892LDc) {
            return LJJIFFI(((AbstractC53892LDc) abstractC53895LDf).LJLJJLL);
        }
        return abstractC53895LDf;
    }

    public static final AVMusic LJJIII(FaceStickerBean faceStickerBean) {
        o.LJIIIZ(faceStickerBean, "<this>");
        String effectId = String.valueOf(faceStickerBean.getStickerId());
        o.LJIIIZ(effectId, "effectId");
        TNW tnw = HXH.LIZ.get(effectId);
        if (tnw instanceof AVMusic) {
            return (AVMusic) tnw;
        }
        return null;
    }

    public static SparseArray LJJIIJZLJL(C47163If9 c47163If9) {
        int index;
        SparseArray sparseArray = new SparseArray();
        if (c47163If9 != null && c47163If9.LJIIIIZZ() != null) {
            for (C47160If6 c47160If6 : c47163If9.LJIIIIZZ()) {
                if (c47160If6 == null) {
                    index = EnumC47176IfM.Undefine.getIndex();
                } else {
                    String LIZIZ = c47160If6.LIZIZ(7);
                    EnumC47176IfM[] allResolutions = EnumC47176IfM.getAllResolutions();
                    int length = allResolutions.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            EnumC47176IfM enumC47176IfM = allResolutions[i];
                            if (enumC47176IfM.toString(0).equals(LIZIZ)) {
                                index = enumC47176IfM.getIndex();
                                break;
                            }
                            i++;
                        } else {
                            index = EnumC47176IfM.Undefine.getIndex();
                            break;
                        }
                    }
                }
                if (index >= 0) {
                    sparseArray.put(index, c47160If6);
                }
            }
        }
        return sparseArray;
    }

    public static final boolean LJJIIZI(C78072UkW c78072UkW) {
        if (c78072UkW == null || !c78072UkW.LJIJ) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJ(C78072UkW c78072UkW) {
        if (c78072UkW != null && (c78072UkW.LJI == 3 || c78072UkW.LJI == 4)) {
            return true;
        }
        return false;
    }

    public static final InterfaceC55235Lm3 LJJIJL(View view) {
        InterfaceC55235Lm3 interfaceC55235Lm3;
        UC1.LJLJJL.getClass();
        Object tag = view.getTag(UC1.LJLJL);
        if (!(tag instanceof InterfaceC55235Lm3) || (interfaceC55235Lm3 = (InterfaceC55235Lm3) tag) == null) {
            return new UC1(view);
        }
        return interfaceC55235Lm3;
    }

    public static final InterfaceC55235Lm3 LJJIJLIJ(Fragment fragment) {
        return C55230Lly.LIZJ(fragment, "linkMicScope");
    }

    public static final InterfaceC55235Lm3 LJJIL(View view) {
        o.LJIIIZ(view, "<this>");
        UC1.LJLJJL.getClass();
        Object tag = view.getTag(UC1.LJLJL);
        if (tag instanceof InterfaceC55235Lm3) {
            return (InterfaceC55235Lm3) tag;
        }
        return null;
    }

    public static void LJJJ(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (IOException e) {
                C77117UOj.LJIIZILJ(e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.17R] */
    public static final C17R LJJJI(final InterfaceC65784Pro defaultFactory) {
        o.LJIIIZ(defaultFactory, "defaultFactory");
        return new C00C<T>(defaultFactory) { // from class: X.17R
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(defaultFactory);
                o.LJIIIZ(defaultFactory, "defaultFactory");
            }
        };
    }

    public static final int LJJJLIIL(LinkedHashMap linkedHashMap) {
        o.LJIIIZ(linkedHashMap, "<this>");
        Collection values = linkedHashMap.values();
        o.LJIIIIZZ(values, "values");
        Iterator it = values.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((List) it.next()).size();
        }
        return i;
    }

    public static QW9 LJJJLL(int i) {
        QW9 fromValue = QW9.fromValue(i);
        if (fromValue == null) {
            return QW9.Device;
        }
        return fromValue;
    }

    public static final boolean LJJL(C78072UkW c78072UkW) {
        boolean z;
        boolean z2;
        if (c78072UkW == null) {
            return false;
        }
        GiftMessage giftMessage = c78072UkW.LIZ;
        if (giftMessage != null && giftMessage.linkmicGiftExpressionStrategy == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !z;
        long LIZLLL = c78072UkW.LIZLLL();
        Long LJ = C32257ClJ.LJ();
        if (LJ == null || LIZLLL != LJ.longValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z3 || !z2 || !C31120CJg.LIZ.Vc()) {
            return false;
        }
        return true;
    }

    public static final void LJJLIIIIJ(Runnable runnable) {
        o.LJIIIZ(runnable, "runnable");
        try {
            runnable.run();
        } catch (Throwable th) {
            C0K2.LIZ("LinkLayerMonitor Error", th);
        }
    }

    public static final void LIZJ(C26227ARb c26227ARb, InterfaceC88472Yns actionGroup) {
        o.LJIIIZ(actionGroup, "actionGroup");
        ARI ari = new ARI(c26227ARb.LIZ);
        actionGroup.invoke(ari);
        c26227ARb.LJIIL = ari;
    }

    public static final void LIZLLL(ArrayList arrayList, List list) {
        o.LJIIIZ(arrayList, "<this>");
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        o.LJI(list);
        arrayList.addAll(list);
    }

    public static final String LJIJJ(Class cls, String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("link-ability-tag-");
        LIZ2.append(cls.getName());
        if (str == null) {
            str = "";
        }
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }

    public static File LJJII(Context context, String str) {
        boolean z;
        if (context != null) {
            String LLLLLLLZIL = C16880lQ.LLLLLLLZIL();
            boolean z2 = false;
            if ("mounted".equals(LLLLLLLZIL) || "mounted_ro".equals(LLLLLLLZIL)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    z2 = "mounted".equals(C16880lQ.LLLLLLLZIL());
                } catch (Exception unused) {
                }
                if (!z2) {
                    return null;
                }
                File LLIIJI = C16880lQ.LLIIJI(context, str);
                if (LLIIJI != null && !LLIIJI.exists()) {
                    LLIIJI.mkdirs();
                }
                return LLIIJI;
            }
            return null;
        }
        return null;
    }

    public static final ArrayList LJJIIJ(AbstractC53895LDf abstractC53895LDf, AbstractC53895LDf abstractC53895LDf2) {
        if (!(abstractC53895LDf instanceof AbstractC53892LDc)) {
            return new ArrayList();
        }
        ArrayList arrayList = (ArrayList) ((AbstractC53892LDc) abstractC53895LDf).LJLJLJ;
        if (arrayList.contains(abstractC53895LDf2)) {
            ArrayList arrayList2 = new ArrayList();
            ListProtector.add(arrayList2, 0, abstractC53895LDf2);
            ListProtector.add(arrayList2, 0, abstractC53895LDf);
            return arrayList2;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC53895LDf abstractC53895LDf3 = (AbstractC53895LDf) it.next();
            if (abstractC53895LDf3 instanceof AbstractC53892LDc) {
                ArrayList LJJIIJ = LJJIIJ(abstractC53895LDf3, abstractC53895LDf2);
                if (!LJJIIJ.isEmpty()) {
                    ListProtector.add(LJJIIJ, 0, abstractC53895LDf);
                    return LJJIIJ;
                }
            }
        }
        return new ArrayList();
    }

    public static final void LJJIZ(String str, String str2) {
        o.LJIIIZ(str, "<this>");
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("linkState.");
            LIZ2.append(str2);
            C0NB.LIZIZ(X1D.LIZIZ(LIZ2), str);
        }
    }

    public static void LJJJIL(CrashType crashType, long j) {
        IApmAgent LJIL = LJIL();
        if (PK0.LJIIIIZZ.isDebugMode()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("monitorCrash:");
            LIZ2.append(LJIL);
            X1D.LIZIZ(LIZ2);
            C78685UuP.LJJJLL();
        }
        if (LJIL != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_exit_metrics", crashType.getName());
                jSONObject.put(WM7.SCENE_SERVICE, String.valueOf(C64269PKf.LIZLLL().LJIIJ));
                jSONObject.put("crash_time", j);
                jSONObject.put("no_space", true);
                LJIL.monitorEvent("hmd_app_exit_reason", jSONObject, null, null);
            } catch (Exception unused) {
            }
        }
    }

    public static final void LJJJJZ(String str, String str2) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_mask_layer_click");
        LIZ2.LJIJJ(str2, "click_icon");
        LIZ2.LIZJ(str);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJJJLZIJ(View view, float f) {
        o.LJIIIZ(view, "<this>");
        view.setClipToOutline(true);
        view.setOutlineProvider(new C46028I4q(null, f, 1));
    }

    public static final void LJJJZ(View view, float f) {
        o.LJIIIZ(view, "<this>");
        view.setClipToOutline(true);
        view.setOutlineProvider(new C46028I4q(Float.valueOf(f), 0.0f, 2));
    }

    public static void LJJLIIIJILLIZJL(View view, Class cls) {
        InterfaceC55235Lm3 LJJIL = LJJIL(view);
        if (LJJIL != null) {
            LJJLIIIJ(LJJIL, cls, null);
        }
    }

    public static final void LJJLIIIJJI(JSONObject jSONObject, UAS record) {
        o.LJIIIZ(jSONObject, "<this>");
        o.LJIIIZ(record, "record");
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            jSONObject.put("current_user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            jSONObject.put("remote_user_id", record.LIZJ);
            jSONObject.put("channel_id", record.LJ);
            jSONObject.put("remote_channel_id", record.LJFF);
            jSONObject.put("current_linkmic_id", record.LIZ);
            jSONObject.put("remote_linkmic_id", record.LIZIZ);
            jSONObject.put("room_id", record.LJIILIIL);
            jSONObject.put("remote_room_id", record.LIZLLL);
            jSONObject.put("role_type", record.LJI.toString());
            jSONObject.put("arch_type", record.LJJ);
            return;
        }
        jSONObject.put("current_linkmic_id", record.LIZ);
        jSONObject.put("remote_linkmic_id", record.LIZIZ);
        jSONObject.put("remote_user_id", record.LIZJ);
        jSONObject.put("role_type", record.LJI.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0035, code lost:
    
        if (0 != 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void LJJLIIIJJIZ(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.Class<X.UC0> r4 = X.UC0.class
            monitor-enter(r4)
            if (r5 != 0) goto L7
            monitor-exit(r4)
            return
        L7:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L41
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L41
            r1 = 0
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L35
            if (r0 != 0) goto L16
            LJJJ(r3)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L35
        L16:
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L35
            r0 = 1
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L35
            r2.write(r6)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2d
            r2.flush()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2d
            r2.close()     // Catch: java.io.IOException -> L3b java.lang.Throwable -> L41
            goto L3f
        L26:
            r1 = move-exception
            r2.close()     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L41
            goto L34
        L2b:
            r0 = move-exception
            goto L31
        L2d:
            r1 = r2
            goto L37
        L2f:
            r1 = move-exception
            goto L34
        L31:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L41
        L34:
            throw r1     // Catch: java.lang.Throwable -> L41
        L35:
            if (r1 == 0) goto L3f
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b java.lang.Throwable -> L41
            goto L3f
        L3b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L41
        L3f:
            monitor-exit(r4)
            return
        L41:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UC0.LJJLIIIJJIZ(java.lang.String, java.lang.String):void");
    }

    public static void LJII(InterfaceC55235Lm3 interfaceC55235Lm3, C2K0 ability, Class cls) {
        o.LJIIIZ(ability, "ability");
        LJIIIIZZ(interfaceC55235Lm3, ability, cls, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x010d, code lost:
    
        if (r1 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0127, code lost:
    
        r0 = (X.UC2) r1.getSource();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012d, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012f, code lost:
    
        r1 = r0.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0131, code lost:
    
        if (r1 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0133, code lost:
    
        r1 = r1.provideAbility(X.C16880lQ.LJLLILLLL(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013d, code lost:
    
        if ((r1 instanceof X.C2K0) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0140, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0141, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0125, code lost:
    
        if (r1 != null) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C2K0 LJIIL(X.InterfaceC55235Lm3 r10, java.lang.Class r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UC0.LJIIL(X.Lm3, java.lang.Class, java.lang.String):X.2K0");
    }

    public static final JSONObject LJIILLIIL(Long l, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (l != null) {
            jSONObject.put("error_code", l);
        }
        if (str != null && C29306Beo.LJIJJLI(str)) {
            int length = str.length();
            LinkMicPerfSladarReportSetting linkMicPerfSladarReportSetting = LinkMicPerfSladarReportSetting.INSTANCE;
            if (length > linkMicPerfSladarReportSetting.getValue().maxLength) {
                String substring = str.substring(0, linkMicPerfSladarReportSetting.getValue().maxLength - 1);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                jSONObject.put("error_msg", substring);
            } else {
                jSONObject.put("error_msg", str);
            }
        }
        if (str2 != null && C29306Beo.LJIJJLI(str2)) {
            jSONObject.put("logid", str2);
        }
        return jSONObject;
    }

    public static /* synthetic */ JSONObject LJIIZILJ(int i, Long l, String str) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return LJIILLIIL(l, str, null);
    }

    public static final void LJJJJZI(String str, PunishEventInfo punishEventInfo, Long l) {
        String str2;
        String str3;
        Long l2;
        String str4;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_violation_mask_layer");
        LIZ2.LJIJJ(str, "action_type");
        String str5 = "";
        if (punishEventInfo == null || (str2 = punishEventInfo.punishType) == null) {
            str2 = "";
        }
        LIZ2.LJIJJ(str2, "violation_type");
        if (punishEventInfo == null || (str3 = punishEventInfo.punishId) == null) {
            str3 = "";
        }
        LIZ2.LJIJJ(str3, "record_id");
        if (punishEventInfo != null && (str4 = punishEventInfo.punishReason) != null) {
            str5 = str4;
        }
        LIZ2.LJIJJ(str5, "violation_reason");
        if (punishEventInfo != null) {
            l2 = Long.valueOf(punishEventInfo.violationUid);
        } else {
            l2 = null;
        }
        LIZ2.LJIJJ(l2, "violation_anchor_id");
        LIZ2.LJIJJ(l, "violation_room_id");
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJJLIIIJ(InterfaceC55235Lm3 interfaceC55235Lm3, Class cls, String str) {
        String LJIJJ = LJIJJ(cls, str);
        if (LJIJJ == null) {
            LJIJJ = "source_default_key";
        }
        C55247LmF.LJ(interfaceC55235Lm3, UC2.class, LJIJJ);
    }

    public static final void LJIIIIZZ(InterfaceC55235Lm3 interfaceC55235Lm3, C2K0 c2k0, Class cls, String str) {
        UC2 uc2 = new UC2(new C38773FJp(cls, c2k0));
        String LJIJJ = LJIJJ(cls, str);
        if (LJIJJ == null) {
            LJIJJ = "source_default_key";
        }
        C55247LmF.LIZIZ(interfaceC55235Lm3, uc2, UC2.class, LJIJJ);
        LJJIZ("<" + C16880lQ.LJLLJ(interfaceC55235Lm3.getClass()) + "> bind ability[" + C16880lQ.LJLLJ(cls) + "] on [" + C16880lQ.LJLLJ(c2k0.getClass()) + ']', "linkScope");
    }

    public static void LJJJJI(boolean z, CrashType crashType, long j, String str) {
        IApmAgent LJIL = LJIL();
        if (PK0.LJIIIIZZ.isDebugMode()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("monitorCrash:");
            LIZ2.append(LJIL);
            X1D.LIZIZ(LIZ2);
            C78685UuP.LJJJLL();
        }
        if (LJIL != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_exit_metrics", crashType.getName());
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(WM7.SCENE_SERVICE, str);
                }
                jSONObject.put("crash_time", j);
                jSONObject.put("upload_success", z);
                LJIL.monitorEvent("hmd_app_exit_reason", jSONObject, null, null);
            } catch (Exception unused) {
            }
        }
    }

    public static final void LJJJJJ(U66 linker, int i, List list, C76786UBq linkLayerSeqEventReporter) {
        EnumC76760UAq enumC76760UAq;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(linkLayerSeqEventReporter, "linkLayerSeqEventReporter");
        U94 LJIILIIL = LJIILIIL(linker.getScene());
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(((UAS) next).LJIIL.get(), linker)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            UAS uas = (UAS) it2.next();
            arrayList2.add(new OSZ(uas.LIZIZ(), Boolean.valueOf(uas.LJII)));
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            OSZ osz = (OSZ) it3.next();
            String u94 = LJIILIIL.toString();
            if (((Boolean) osz.getSecond()).booleanValue()) {
                enumC76760UAq = EnumC76760UAq.LINKED;
            } else {
                enumC76760UAq = EnumC76760UAq.LINKING;
            }
            C76786UBq.LIZJ(linkLayerSeqEventReporter, u94, enumC76760UAq.toString(), (String) osz.getFirst(), i);
        }
    }

    public static void LJJJJ(File file, CrashType crashType, long j, String str, boolean z) {
        IApmAgent LJIL = LJIL();
        if (PK0.LJIIIIZZ.isDebugMode()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("monitorCrash:");
            LIZ2.append(LJIL);
            X1D.LIZIZ(LIZ2);
            C78685UuP.LJJJLL();
        }
        if (LJIL != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_exit_metrics", crashType.getName());
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(WM7.SCENE_SERVICE, str);
                }
                jSONObject.put("has_anr_info", z);
                jSONObject.put("crash_time", j);
                if (file != null) {
                    new File(file, "has_report_service").createNewFile();
                }
                LJIL.monitorEvent("hmd_app_exit_reason", jSONObject, null, null);
            } catch (Exception unused) {
            }
        }
    }

    public static b LJIIJJI(c cVar, String pageName, Integer num, String styleType, Integer num2, int i) {
        b bVar = null;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            styleType = "";
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        o.LJIIIZ(cVar, "<this>");
        o.LJIIIZ(pageName, "pageName");
        o.LJIIIZ(styleType, "styleType");
        EnumC28000Ayq LJJZZIII = C78866UxK.LJJZZIII(num);
        if (num2 == null) {
            num2 = Integer.valueOf(C27206Am2.LJ(LJJZZIII, pageName, null));
        }
        C26550AbS c26550AbS = EnumC26549AbR.Companion;
        int intValue = num2.intValue();
        c26550AbS.getClass();
        EnumC26549AbR LIZ2 = C26550AbS.LIZ(intValue, pageName);
        StringBuilder LJFF = C72972SkS.LJFF(pageName, '_');
        LJFF.append(cVar.getViewName());
        LJFF.append('_');
        LJFF.append(LIZ2.name());
        LJFF.append('_');
        LJFF.append(styleType);
        try {
            String str = (String) ((HashMap) C2TR.LIZ).get(X1D.LIZIZ(LJFF));
            if (str == null) {
                return null;
            }
            Object newInstance = Class.forName(str).newInstance();
            if (!(newInstance instanceof b)) {
                return null;
            }
            bVar = (b) newInstance;
            return bVar;
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("IDynamicView reflect exception: ");
            LIZ3.append(e.getMessage());
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ3));
            return bVar;
        }
    }

    public static final void LJJJJL(String str, String str2, long j, long j2, U66 linker, List list) {
        String str3;
        String str4;
        LiveMode streamType;
        o.LJIIIZ(linker, "linker");
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_perf_api_finish", 0.001d)) {
                return;
            }
            HashMap hashMap = new HashMap();
            Room LIZJ = linker.LIZJ();
            if (LIZJ != null) {
                str3 = LIZJ.getIdStr();
            } else {
                str3 = null;
            }
            String str5 = "";
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("room_id", str3);
            hashMap.put("linkmic_id", "");
            hashMap.put("remote_linkmic_id", "");
            hashMap.put("channel_id", String.valueOf(linker.LJJLI()));
            hashMap.put(WM7.SCENE_SERVICE, LJIILIIL(linker.getScene()).toString());
            Room LIZJ2 = linker.LIZJ();
            if (LIZJ2 == null || (streamType = LIZJ2.getStreamType()) == null) {
                str4 = "";
            } else {
                str4 = C28509BGv.LIZ(streamType);
            }
            hashMap.put("live_type", str4);
            hashMap.put("connection_type", C1DJ.LJIILIIL(linker.LIZJ()));
            hashMap.put("role_type", "");
            String layoutId = linker.LLLZI().getLayoutId();
            if (layoutId == null) {
                layoutId = "";
            }
            hashMap.put("layout", layoutId);
            AnonymousClass391.LJFF(hashMap, "source", str, j2, "duration");
            if (str2 != null) {
                str5 = str2;
            }
            hashMap.put("log_id", str5);
            hashMap.put("error_code", String.valueOf(j));
            UAR.LJI(hashMap);
            BZI LIZ2 = C28787BRn.LIZ("livesdk_linkmic_perf_api_finish");
            LIZ2.LJJIFFI(hashMap);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJJIIJZLJL();
                return;
            } else {
                LIZ2.LJJIJ();
                LIZ2.LJJIIZI();
                return;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UAR.LIZIZ((UAS) it.next(), str, j2, str2, j);
        }
    }

    public static final void LJJJJLI(String str, String str2, long j, List list, long j2, boolean z) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            UAR.LJFF(j, j2, (UAS) it.next(), str, str2, z);
        }
    }

    public static final void LJJJJIZL(U66 linker, long j, long j2, JSONObject recordExtraPropsAndStates, String str, JSONObject jSONObject, List list, C76786UBq linkLayerSeqEventReporter) {
        EnumC76760UAq enumC76760UAq;
        EnumC76760UAq enumC76760UAq2;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(recordExtraPropsAndStates, "recordExtraPropsAndStates");
        o.LJIIIZ(linkLayerSeqEventReporter, "linkLayerSeqEventReporter");
        U94 LJIILIIL = LJIILIIL(linker.getScene());
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(((UAS) next).LJIIL.get(), linker)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            UAS uas = (UAS) it2.next();
            arrayList2.add(new OSZ(uas.LIZIZ(), Boolean.valueOf(uas.LJII)));
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            OSZ osz = (OSZ) it3.next();
            String u94 = LJIILIIL.toString();
            if (((Boolean) osz.getSecond()).booleanValue()) {
                enumC76760UAq = EnumC76760UAq.LINKED;
            } else {
                enumC76760UAq = EnumC76760UAq.LINKING;
            }
            linkLayerSeqEventReporter.LIZIZ(j, j2, u94, enumC76760UAq.toString(), (String) osz.getFirst(), str, jSONObject);
            String u942 = LJIILIIL.toString();
            if (((Boolean) osz.getSecond()).booleanValue()) {
                enumC76760UAq2 = EnumC76760UAq.LINKED;
            } else {
                enumC76760UAq2 = EnumC76760UAq.LINKING;
            }
            linkLayerSeqEventReporter.LJII(u942, enumC76760UAq2.toString(), (String) osz.getFirst(), recordExtraPropsAndStates);
        }
    }

    public static final void LJJJJJL(U66 linker, long j, long j2, JSONObject recordExtraPropsAndStates, String str, JSONObject jSONObject, List list, C76786UBq linkLayerSeqEventReporter) {
        EnumC76760UAq enumC76760UAq;
        EnumC76760UAq enumC76760UAq2;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(recordExtraPropsAndStates, "recordExtraPropsAndStates");
        o.LJIIIZ(linkLayerSeqEventReporter, "linkLayerSeqEventReporter");
        U94 LJIILIIL = LJIILIIL(linker.getScene());
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(((UAS) next).LJIIL.get(), linker)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            UAS uas = (UAS) it2.next();
            arrayList2.add(new OSZ(uas.LIZIZ(), Boolean.valueOf(uas.LJII)));
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            OSZ osz = (OSZ) it3.next();
            String u94 = LJIILIIL.toString();
            if (((Boolean) osz.getSecond()).booleanValue()) {
                enumC76760UAq = EnumC76760UAq.LINKED;
            } else {
                enumC76760UAq = EnumC76760UAq.LINKING;
            }
            linkLayerSeqEventReporter.LJ(j, j2, u94, enumC76760UAq.toString(), (String) osz.getFirst(), str, jSONObject);
            String u942 = LJIILIIL.toString();
            if (((Boolean) osz.getSecond()).booleanValue()) {
                enumC76760UAq2 = EnumC76760UAq.LINKED;
            } else {
                enumC76760UAq2 = EnumC76760UAq.LINKING;
            }
            linkLayerSeqEventReporter.LJII(u942, enumC76760UAq2.toString(), (String) osz.getFirst(), recordExtraPropsAndStates);
        }
    }
}
