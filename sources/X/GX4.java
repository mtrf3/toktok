package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutSoundSyncModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResults;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.AqS40S1000000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class GX4 {
    public static final /* synthetic */ int LIZ = 0;

    static {
        String LJJLIIIIJ;
        String LIZLLL;
        String LJJIJ;
        String LJI;
        String LJIIIIZZ;
        LJJLIIIIJ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJLIIIIJ("");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        LIZLLL = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LIZLLL("");
        LJJIJ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIJ("");
        LJI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJI("");
        LJIIIIZZ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIIIIZZ("");
        C47261Igj.LJII(s.LJJZZIII(separator, LJJLIIIIJ), s.LJJZZIII(separator, LIZLLL), s.LJJZZIII(separator, C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJL("")), s.LJJZZIII(separator, LJJIJ), s.LJJZZIII(separator, LJI), s.LJJZZIII(separator, LJIIIIZZ));
    }

    public static final DraftFileSaveResult LIZIZ(AwemeDraft draft) {
        boolean z;
        o.LJIIIZ(draft, "draft");
        String str = draft.LIZ.autoCutAnchorModel.nleData;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String nleDataPath = C62850Ola.LJ().LJIILL(draft.LIZIZ(), EnumC43649HBd.AUTOCUT_NLE_DATA, "autocut_nle_data_file_name.json", true).getAbsolutePath();
        AutoCutAnchorModel autoCutAnchorModel = draft.LIZ.autoCutAnchorModel;
        GX5.LIZ("", new AqS40S1000000_2(nleDataPath, 2));
        autoCutAnchorModel.nleDataVersion = 1;
        o.LJIIIIZZ(nleDataPath, "nleDataPath");
        DraftFileSaveException LJJL = V1M.LJJL(nleDataPath, str);
        StringBuilder LIZIZ = C25620zW.LIZIZ("DraftSaveOp write autocut nle path ", nleDataPath, " result ");
        LIZIZ.append(LJJL.getErrorCode());
        LIZIZ.append(" data ");
        LIZIZ.append(draft.LJIIJ);
        C126344xa.LIZ(X1D.LIZIZ(LIZIZ));
        if (!LJJL.isSuc()) {
            return new DraftFileSaveResult(8, LJJL);
        }
        draft.LIZ.autoCutAnchorModel.nleDataPath = nleDataPath;
        return null;
    }

    public static final DraftFileSaveResults LIZJ(AwemeDraft draft) {
        o.LJIIIZ(draft, "draft");
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        OSZ<List<DraftFileSaveResult>, List<DraftFileSaveResult>> LIZLLL = LIZLLL(draft.LIZIZ(), draft.LJJJJI, AVDraftExtras.class, hashMap, new AqS189S0100000_7(draft, 36));
        OSZ<List<DraftFileSaveResult>, List<DraftFileSaveResult>> LIZLLL2 = LIZLLL(draft.LIZIZ(), draft.LIZ, CreativeModel.class, hashMap, new AqS189S0100000_7(draft, 37));
        C68322mC c68322mC = new C68322mC();
        C78841Uwv.LJJIIZ("", new AqS149S0200000_2(draft, (AwemeDraft) c68322mC, (C68322mC<DraftFileSaveResult>) 86));
        T t = c68322mC.element;
        DraftFileSaveResult LIZIZ = LIZIZ(draft);
        DraftFileSaveResult LJFF = LJFF(draft);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZLLL.getFirst());
        arrayList.addAll(LIZLLL2.getFirst());
        if (t != 0) {
            arrayList.add(t);
        }
        if (LIZIZ != null) {
            arrayList.add(LIZIZ);
        }
        if (LJFF != null) {
            arrayList.add(LJFF);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(LIZLLL.getSecond());
        arrayList2.addAll(LIZLLL2.getSecond());
        return new DraftFileSaveResults(currentTimeMillis2, arrayList, arrayList2);
    }

    public static final DraftFileSaveResult LJFF(AwemeDraft draft) {
        boolean z;
        o.LJIIIZ(draft, "draft");
        String str = draft.LIZ.autoCutModel.soundSyncModel.soundSyncNleData;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String nleDataPath = C62850Ola.LJ().LJIILL(draft.LIZIZ(), EnumC43649HBd.SOUND_SYNC, "sound_sync_nle_data_file_name.json", true).getAbsolutePath();
        AutoCutSoundSyncModel autoCutSoundSyncModel = draft.LIZ.autoCutModel.soundSyncModel;
        GX5.LIZ("", new AqS40S1000000_2(nleDataPath, 2));
        autoCutSoundSyncModel.soundSyncNleDataVersion = 1;
        o.LJIIIIZZ(nleDataPath, "nleDataPath");
        DraftFileSaveException LJJL = V1M.LJJL(nleDataPath, str);
        StringBuilder LIZIZ = C25620zW.LIZIZ("DraftSaveOp write sound sync nle path ", nleDataPath, " result ");
        LIZIZ.append(LJJL.getErrorCode());
        LIZIZ.append(" data ");
        LIZIZ.append(draft.LJIIJ);
        C126344xa.LIZ(X1D.LIZIZ(LIZIZ));
        if (!LJJL.isSuc()) {
            return new DraftFileSaveResult(8, LJJL);
        }
        draft.LIZ.autoCutModel.soundSyncModel.soundSyncNleDataPath = nleDataPath;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r6
      0x0025: PHI (r6v7 java.lang.Object) = (r6v6 java.lang.Object), (r6v0 java.lang.Object) binds: [B:26:0x0093, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C41021G8b r10, X.InterfaceC88472Yns<? super com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.C76800UCe> r11, X.InterfaceC67352kd<? super X.C142535ib> r12) {
        /*
            boolean r0 = r12 instanceof X.C41475GPn
            if (r0 == 0) goto L96
            r5 = r12
            X.GPn r5 = (X.C41475GPn) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r6 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r9 = 0
            r3 = 0
            r7 = 1
            r8 = 2
            if (r0 == 0) goto L26
            if (r0 == r7) goto L56
            if (r0 != r8) goto L9d
            X.C141335gf.LIZJ(r6)
        L25:
            return r6
        L26:
            X.C141335gf.LIZJ(r6)
            r5.LJLIL = r10
            r5.LJLILLLLZI = r11
            r5.LJLJJI = r7
            java.lang.String r0 = "studio_convert_draft_model_async"
            boolean r0 = X.C19N.LJ(r0, r9)
            if (r0 == 0) goto L45
            X.XIA r1 = X.C150985wE.LIZIZ
            X.GLH r0 = new X.GLH
            r0.<init>(r10, r3)
            java.lang.Object r6 = X.XKX.LJI(r1, r0, r5)
        L42:
            if (r6 != r4) goto L5d
            return r4
        L45:
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6jp r2 = r0.LJIIJJI()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r10.LJLIL
            X.GLI r0 = r10.LJLILLLLZI
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r6 = r2.LJ(r1, r0)
            goto L42
        L56:
            X.Yns r11 = r5.LJLILLLLZI
            X.G8b r10 = r5.LJLIL
            X.C141335gf.LIZJ(r6)
        L5d:
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r6 = (com.ss.android.ugc.aweme.draft.model.AwemeDraft) r6
            if (r11 == 0) goto L64
            r11.invoke(r6)
        L64:
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "studio_fake_draft_operation_response"
            int r0 = X.C00F.LIZ(r1, r9, r0, r7)
            if (r0 != r7) goto L80
            boolean r0 = X.C79146V4k.LJJJJIZL()
            if (r0 == 0) goto L80
            X.5ib r1 = new X.5ib
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.draft.model.DraftSaveResult r0 = X.C77412UZs.LJIIZILJ(r6, r3, r0, r7)
            r1.<init>(r0, r6)
            return r1
        L80:
            X.GLI r2 = r10.LJLILLLLZI
            r5.LJLIL = r3
            r5.LJLILLLLZI = r3
            r5.LJLJJI = r8
            X.XIA r1 = X.C150985wE.LIZIZ
            X.GPb r0 = new X.GPb
            r0.<init>(r6, r2, r3)
            java.lang.Object r6 = X.XKX.LJI(r1, r0, r5)
            if (r6 != r4) goto L25
            return r4
        L96:
            X.GPn r5 = new X.GPn
            r5.<init>(r12)
            goto L12
        L9d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GX4.LIZ(X.G8b, X.Yns, X.2kd):java.lang.Object");
    }

    public static final <DATA> OSZ<List<DraftFileSaveResult>, List<DraftFileSaveResult>> LIZLLL(CreativeInfo creativeInfo, DATA data, Class<DATA> cls, java.util.Map<String, String> map, InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            C42083GfP.LIZ(cls, InterfaceC43620HAa.class).LIZIZ(data, new C41462GPa(map, interfaceC88471Ynr, creativeInfo, arrayList, arrayList2));
        } catch (GX6 unused) {
        }
        return new OSZ<>(arrayList, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(java.util.Map<java.lang.String, java.lang.String> r18, X.InterfaceC88471Ynr<? super java.lang.String, ? super java.lang.String, X.C76800UCe> r19, com.ss.android.ugc.aweme.creative.CreativeInfo r20, java.util.List<com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult> r21, java.util.List<com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult> r22, java.lang.String r23, X.InterfaceC43620HAa r24, X.InterfaceC88472Yns<? super java.lang.String, X.C76800UCe> r25) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GX4.LJ(java.util.Map, X.Ynr, com.ss.android.ugc.aweme.creative.CreativeInfo, java.util.List, java.util.List, java.lang.String, X.HAa, X.Yns):void");
    }
}
