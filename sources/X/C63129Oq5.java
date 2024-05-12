package X;

import android.text.TextUtils;

/* renamed from: X.Oq5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63129Oq5 implements InterfaceC63352Otg {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC63352Otg
    public Object LIZIZ() {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        C63089OpR c63089OpR;
        String str = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        InterfaceC63132Oq8 interfaceC63132Oq82 = null;
        C63089OpR c63089OpR2 = null;
        interfaceC63132Oq82 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationMemberDao queryMember, cid:");
        LIZ.append(str);
        LIZ.append(", uid:");
        LIZ.append(str2);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("select * from participant where ");
                LIZ2.append(EnumC63126Oq2.COLUMN_CONVERSATION_ID.key);
                LIZ2.append("=?  and ");
                LIZ2.append(EnumC63126Oq2.COLUMN_USER_ID.key);
                LIZ2.append("=?");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ2), new String[]{str, str2});
                while (interfaceC63132Oq8.moveToNext()) {
                    try {
                        c63089OpR2 = C63124Oq0.LIZIZ(interfaceC63132Oq8);
                    } catch (Exception e) {
                        e = e;
                        c63089OpR = c63089OpR2;
                        interfaceC63132Oq82 = interfaceC63132Oq8;
                        C63322OtC.LJ("IMConversationMemberDao queryMember", e);
                        C16880lQ.LLLLIIL(e);
                        C63337OtR.LJFF(e);
                        C63143OqJ.LIZ(interfaceC63132Oq82);
                        return c63089OpR;
                    } catch (Throwable th) {
                        th = th;
                        C63143OqJ.LIZ(interfaceC63132Oq8);
                        throw th;
                    }
                }
                C63275OsR.LIZIZ().LJI(currentTimeMillis, "queryMember");
                C63143OqJ.LIZ(interfaceC63132Oq8);
                return c63089OpR2;
            } catch (Exception e2) {
                e = e2;
                c63089OpR = null;
            }
        } catch (Throwable th2) {
            th = th2;
            interfaceC63132Oq8 = interfaceC63132Oq82;
        }
    }

    public String LIZ() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ C63129Oq5(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
