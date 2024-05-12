package X;

import com.ss.android.ugc.aweme.specact.model.NowShareModel$TextItem;

/* renamed from: X.Oc9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62265Oc9 {
    public static final C62273OcH LIZ(NowShareModel$TextItem nowShareModel$TextItem) {
        String str = nowShareModel$TextItem.text;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = nowShareModel$TextItem.starlingKey;
        if (str3 != null) {
            str2 = str3;
        }
        return new C62273OcH(str, str2);
    }
}
