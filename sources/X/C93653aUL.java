package X;

import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData;
import com.ss.android.ugc.aweme.effectcreator.models.EffectCommandDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectObjectDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aUL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93653aUL {
    public static EffectPackageDataWrapper LIZ(EffectPackageData data) {
        String str;
        o.LJIIIZ(data, "data");
        String str2 = data.projectId;
        String str3 = data.projectSource;
        String str4 = data.LJLIL;
        String str5 = data.LJLILLLLZI;
        String str6 = data.LJLJI;
        String str7 = data.LJLJJI;
        String str8 = data.LJLJJL;
        String str9 = data.LJLJJLL;
        long j = data.LJLJL;
        long j2 = data.duration;
        long j3 = data.layerDuration;
        long j4 = data.interactionDuration;
        int i = data.LJLJLJ;
        int i2 = data.LJLJLLL;
        int i3 = data.LJLL;
        int i4 = data.LJLLI;
        List<C94394agI> list = data.LJLLILLLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (C94394agI c94394agI : list) {
            String str10 = c94394agI.LJLIL;
            String str11 = c94394agI.LJLILLLLZI;
            List<String> list2 = c94394agI.LJLJI;
            String str12 = c94394agI.LJLJJI;
            int i5 = C93652aUK.LIZ[c94394agI.LJLJJL.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                str = CardStruct.IStatusCode.DEFAULT;
                            } else {
                                str = "camera";
                            }
                        } else {
                            str = "giphy";
                        }
                    } else {
                        str = "asset_lib";
                    }
                } else {
                    str = "album";
                }
            } else {
                str = "text";
            }
            arrayList.add(new EffectObjectDataWrapper(str10, str11, str12, str, c94394agI.LJLJJLL, c94394agI.LJLJL, list2));
        }
        List<C94393agH> list3 = data.LJLLJ;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
        for (C94393agH c94393agH : list3) {
            arrayList2.add(new EffectCommandDataWrapper(c94393agH.LJLIL, c94393agH.LJLILLLLZI, c94393agH.LJLJI, c94393agH.LJLJJI, c94393agH.LJLJJL, c94393agH.LJLJJLL, c94393agH.LJLJL, c94393agH.LJLJLJ));
        }
        String str13 = data.LJLLL;
        List<EffectHint> list4 = data.LJLLLL;
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(list4, 10));
        for (EffectHint effectHint : list4) {
            arrayList3.add(new EffectHintWrapper(effectHint.hintKey, effectHint.effectKey, effectHint.hint, effectHint.hintIcon, effectHint.hintFile, effectHint.hintFileFormat));
        }
        return new EffectPackageDataWrapper(str2, str3, str4, str5, str6, str7, str8, str9, j, j2, j3, j4, i, i2, i3, i4, 0, arrayList, arrayList2, str13, arrayList3, 65536);
    }
}
