package X;

import android.content.Intent;

/* renamed from: X.PvS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66010PvS implements InterfaceC66022Pve {
    @Override // X.InterfaceC66022Pve
    public final /* bridge */ /* synthetic */ String LIZ(Object obj) {
        Intent intent = (Intent) obj;
        if (intent == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Intent { ");
        OGT.LIZJ(intent, sb);
        sb.append(" }");
        return sb.toString();
    }
}
