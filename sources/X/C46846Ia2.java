package X;

import java.util.HashMap;

/* renamed from: X.Ia2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46846Ia2 implements InterfaceC47884Iqm {
    public final /* synthetic */ IXO LIZ;

    public C46846Ia2(IXO ixo) {
        this.LIZ = ixo;
    }

    @Override // X.InterfaceC47884Iqm
    public final String LIZ(int i, java.util.Map map) {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = (HashMap) map;
        if (hashMap.size() > 0) {
            for (String str : hashMap.keySet()) {
                C1DI.LIZIZ(sb, "&", str, "=");
                sb.append((String) hashMap.get(str));
            }
        }
        IXO ixo = this.LIZ;
        return C16880lQ.LLLZ("%s/video/openapi/v1/?action=GetPlayInfo&video_id=%s&ptoken=%s&aid=%s%s", new Object[]{ixo.LIZLLL, ixo.LJ, ixo.LJI, ixo.LJII, sb.toString()});
    }
}
