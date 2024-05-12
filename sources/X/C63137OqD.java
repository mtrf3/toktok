package X;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: X.OqD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63137OqD implements InterfaceC63352Otg<Boolean> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.InterfaceC63352Otg
    public final Boolean LIZIZ() {
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        long j = this.LJLJI;
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMConversationDao updateDraft, cid:");
            LIZ.append(str);
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
            long currentTimeMillis = System.currentTimeMillis();
            if (j < 0) {
                j = 0;
            }
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC63136OqC.COLUMN_DRAFT_TIME.key, Long.valueOf(j));
                String str3 = EnumC63136OqC.COLUMN_DRAFT_CONTENT.key;
                if (str2 == null) {
                    str2 = "";
                }
                contentValues.put(str3, str2);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(EnumC63136OqC.COLUMN_ID.key);
                LIZ2.append("=?");
                if (C78847Ux1.LJJLIIIJLJLI("conversation_list", contentValues, X1D.LIZIZ(LIZ2), new String[]{str}) > 0) {
                    z = true;
                }
                C63275OsR.LIZIZ().LJI(currentTimeMillis, "updateDraft");
            } catch (Exception e) {
                C63322OtC.LJ("IMConversationDao updateDraft ", e);
                C63337OtR.LJFF(e);
            }
        }
        return Boolean.valueOf(z);
    }

    public C63137OqD(String str, String str2, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = j;
    }
}
