package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.AqS31S0100100_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.GPf */
/* loaded from: classes8.dex */
public final class C41467GPf {
    public static final C41467GPf LIZ = new C41467GPf();

    public static AwemeDraft LIZ(AwemeDraft awemeDraft) {
        o.LJIIIZ(awemeDraft, "<this>");
        Gson LIZ2 = C60903NvH.LJIIJJI().LIZ();
        String json = GsonProtectorUtils.toJson(LIZ2, awemeDraft);
        o.LJIIIIZZ(json, "json");
        Object fromJson = GsonProtectorUtils.fromJson(LIZ2, json, (Class<Object>) AwemeDraft.class);
        o.LJIIIIZZ(fromJson, "fromJson");
        return (AwemeDraft) fromJson;
    }

    public final Object LIZLLL(AwemeDraft awemeDraft, AqS31S0100100_7 aqS31S0100100_7, InterfaceC67352kd interfaceC67352kd) {
        String creationId = awemeDraft.LIZIZ().getCreationId();
        int i = 0;
        int LJJLIIIJLLLLLLLZ = s.LJJLIIIJLLLLLLLZ(creationId, '_', 0, 6);
        if (LJJLIIIJLLLLLLLZ != -1) {
            String substring = creationId.substring(LJJLIIIJLLLLLLLZ + 1);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            int parseInt = CastIntegerProtector.parseInt(substring) + 1;
            creationId = creationId.substring(0, LJJLIIIJLLLLLLLZ);
            o.LJIIIIZZ(creationId, "this as java.lang.String…ing(startIndex, endIndex)");
            i = parseInt;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(creationId);
        LIZ2.append('_');
        LIZ2.append(i);
        return LIZIZ(awemeDraft, X1D.LIZIZ(LIZ2), "CopyPostedDraft", false, aqS31S0100100_7, C41469GPh.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r18, java.lang.String r19, java.lang.String r20, boolean r21, X.InterfaceC88472Yns<? super com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.C76800UCe> r22, X.InterfaceC88472Yns<? super java.lang.Throwable, X.C76800UCe> r23, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.draft.model.AwemeDraft> r24) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41467GPf.LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, java.lang.String, java.lang.String, boolean, X.Yns, X.Yns, X.2kd):java.lang.Object");
    }

    public static /* synthetic */ Object LIZJ(C41467GPf c41467GPf, AwemeDraft awemeDraft, String str, boolean z, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, InterfaceC67352kd interfaceC67352kd, int i) {
        String str2;
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = "DraftCopy";
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return c41467GPf.LIZIZ(awemeDraft, str, str2, z2, interfaceC88472Yns, interfaceC88472Yns2, interfaceC67352kd);
    }
}
