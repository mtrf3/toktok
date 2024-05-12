package com.ss.android.ugc.aweme.effectcreator;

import X.C16880lQ;
import X.C32I;
import X.C44423Hc3;
import X.C45804HyK;
import X.C58096Mr6;
import X.C60903NvH;
import X.C61878OQg;
import X.C63942P7q;
import X.C68M;
import X.C69B;
import X.C6YM;
import X.C93812aWu;
import X.C93925aYj;
import X.ES2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager;
import com.bytedance.ugc.effectcreator.main.CKEffectEditorActivity;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class EffectCreatorServiceImpl implements IEffectCreatorService {
    public static IEffectCreatorService LJIIJ() {
        Object LIZ = C58096Mr6.LIZ(IEffectCreatorService.class, false);
        if (LIZ != null) {
            return (IEffectCreatorService) LIZ;
        }
        if (C58096Mr6.m0 == null) {
            synchronized (IEffectCreatorService.class) {
                if (C58096Mr6.m0 == null) {
                    C58096Mr6.m0 = new EffectCreatorServiceImpl();
                }
            }
        }
        return (EffectCreatorServiceImpl) C58096Mr6.m0;
    }

    @Override // com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService
    public final List<CKEDraftInfoWrapper> LIZ(Context context) {
        String str;
        List<CKEDraftInfo> list;
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser == null || (str = currentUser.getUid()) == null) {
            str = "";
        }
        ICKDraftManager LIZ = C93925aYj.LIZ(context, str);
        if (LIZ == null || (list = LIZ.getDraftList()) == null) {
            list = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<CKEDraftInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C93812aWu.LIZJ(it.next()));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService
    public final void LIZIZ(Context context, String draftID) {
        String str;
        o.LJIIIZ(draftID, "draftID");
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser == null || (str = currentUser.getUid()) == null) {
            str = "";
        }
        ICKDraftManager LIZ = C93925aYj.LIZ(context, str);
        if (LIZ != null) {
            LIZ.deleteDraft(draftID);
        }
    }

    @Override // com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService
    public final void LIZJ(Context context, CKEDraftInfoWrapper cKEDraftInfoWrapper) {
        String str;
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser == null || (str = currentUser.getUid()) == null) {
            str = "";
        }
        ICKDraftManager LIZ = C93925aYj.LIZ(context, str);
        if (LIZ != null) {
            LIZ.updateDraftInfo(C93812aWu.LIZ(cKEDraftInfoWrapper));
        }
    }

    @Override // com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService
    public final void LJ(Context context, CKEDraftInfoWrapper cKEDraftInfoWrapper) {
        String str;
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser == null || (str = currentUser.getUid()) == null) {
            str = "";
        }
        ICKDraftManager LIZ = C93925aYj.LIZ(context, str);
        if (LIZ != null) {
            LIZ.saveOneDraft(C93812aWu.LIZ(cKEDraftInfoWrapper), false, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService
    public final CKEDraftInfoWrapper LJII(Context context, String draftId) {
        String str;
        CKEDraftInfo draftByDraftId;
        o.LJIIIZ(draftId, "draftId");
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser == null || (str = currentUser.getUid()) == null) {
            str = "";
        }
        ICKDraftManager LIZ = C93925aYj.LIZ(context, str);
        if (LIZ == null || (draftByDraftId = LIZ.getDraftByDraftId(draftId)) == null) {
            return null;
        }
        return C93812aWu.LIZJ(draftByDraftId);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r7, java.lang.String r8, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C94553air
            if (r0 == 0) goto L5c
            r4 = r9
            X.air r4 = (X.C94553air) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r5 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L62
            X.C141335gf.LIZJ(r5)
        L21:
            com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData r5 = (com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData) r5
            if (r5 == 0) goto L29
            com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper r1 = X.C93653aUL.LIZ(r5)
        L29:
            return r1
        L2a:
            X.C141335gf.LIZJ(r5)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.HQ7 r0 = r0.getAccountService()
            X.Hc3 r0 = r0.getCurrentUser()
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L43
        L41:
            java.lang.String r0 = ""
        L43:
            com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager r0 = X.C93925aYj.LIZ(r7, r0)
            if (r0 == 0) goto L29
            com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo r0 = r0.getDraftByDraftId(r8)
            if (r0 == 0) goto L29
            java.lang.String r0 = r0.draftPath
            if (r0 == 0) goto L29
            r4.LJLJI = r2
            java.lang.Object r5 = X.C93677aUj.LIZLLL(r0)
            if (r5 != r3) goto L21
            return r3
        L5c:
            X.air r4 = new X.air
            r4.<init>(r6, r9)
            goto L12
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl.LIZLLL(android.content.Context, java.lang.String, X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService
    public final void LJIIIZ(Context context, String draftID, String effectId) {
        String str;
        CKEDraftInfo draftByDraftId;
        o.LJIIIZ(draftID, "draftID");
        o.LJIIIZ(effectId, "effectId");
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser == null || (str = currentUser.getUid()) == null) {
            str = "";
        }
        ICKDraftManager LIZ = C93925aYj.LIZ(context, str);
        if (LIZ != null && (draftByDraftId = LIZ.getDraftByDraftId(draftID)) != null) {
            LIZ.updateDraftInfo(CKEDraftInfo.L(draftByDraftId, effectId, 65527));
        }
    }

    @Override // com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService
    public final void LJFF(Context context, CKEDraftInfoWrapper draftInfo, String str, String str2, String str3) {
        o.LJIIIZ(draftInfo, "draftInfo");
        LJIIJJI(this, context, "shootpage_draft", str, str2, str3, C93812aWu.LIZ(draftInfo), null, 192);
    }

    @Override // com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService
    public final void LJI(Context context, Effect effect, String str, String str2, String str3) {
        o.LJIIIZ(context, "context");
        if (effect != null) {
            LJIIJJI(this, context, "shootpage_template", str, str2, str3, null, effect, 160);
        } else {
            LJIIJJI(this, context, "shootpage_template", str, str2, str3, null, null, 224);
        }
    }

    @Override // com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService
    public final void LJIIIIZZ(String str, String str2, String str3, String str4, Context context) {
        o.LJIIIZ(context, "context");
        LJIIJJI(this, context, str, str2, str3, str4, null, null, 224);
    }

    public static void LJIIJJI(EffectCreatorServiceImpl effectCreatorServiceImpl, Context context, String str, String str2, String str3, String str4, CKEDraftInfo cKEDraftInfo, Effect effect, int i) {
        String str5;
        String uid;
        CKEDraftInfo cKEDraftInfo2 = cKEDraftInfo;
        if ((i & 32) != 0) {
            cKEDraftInfo2 = null;
        }
        if ((i & 64) != 0) {
            effect = null;
        }
        effectCreatorServiceImpl.getClass();
        boolean LIZ = ES2.LIZ();
        C6YM.LIZ();
        C69B.LIZJ();
        C68M.LJIIJ().LJIJ(context);
        C63942P7q.LJII((byte) 31);
        Intent intent = new Intent();
        intent.putExtra("enter_from", str);
        intent.putExtra("shoot_page_enter_from", str2);
        intent.putExtra("shoot_way", str3);
        intent.putExtra("creation_id", str4);
        intent.putExtra("ame_is_draft", (Serializable) null);
        String str6 = "";
        if (effect == null || (str5 = effect.getResourceId()) == null) {
            str5 = "";
        }
        intent.putExtra("template_res_id", str5);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null) {
            return;
        }
        C44423Hc3 currentUser = C60903NvH.LJIIJJI().getAccountService().getCurrentUser();
        if (currentUser != null && (uid = currentUser.getUid()) != null) {
            str6 = uid;
        }
        C93925aYj.LIZ(context, str6);
        if (cKEDraftInfo2 != null) {
            C93925aYj.LIZIZ(LJIJJ, intent, cKEDraftInfo2, 10088, LIZ, 16);
            return;
        }
        if (effect != null && effect.getUnzipPath() != null) {
            C93925aYj.LIZJ(LJIJJ, intent, effect.getUnzipPath(), 10088, LIZ, effect.getEffectId());
            return;
        }
        intent.setClass(LJIJJ, CKEffectEditorActivity.class);
        intent.putExtra("enableSaveDraft", LIZ);
        C16880lQ.LJFF(LJIJJ, 10088, intent);
    }
}
