package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Lsp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC55655Lsp implements Runnable {
    public static final RunnableC55655Lsp LJLIL = new RunnableC55655Lsp();

    public static void LIZ() {
        LinkedHashMap<String, String> linkedHashMap = C55657Lsr.LIZJ;
        if (linkedHashMap != null) {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(entry.getKey());
                LIZ.append(',');
                LIZ.append(entry.getValue());
                arrayList.add(X1D.LIZIZ(LIZ));
            }
            if (arrayList != null) {
                String LLD = ORZ.LLD(arrayList, "|", null, null, null, 62);
                InterfaceC32651Px interfaceC32651Px = C55657Lsr.LIZIZ;
                if (interfaceC32651Px != null) {
                    interfaceC32651Px.LIZIZ("playlist_watch_history", LLD);
                }
                C55658Lss.LJFF.LJIIIIZZ("watch history has been written into disk");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
