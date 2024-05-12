package X;

import com.bytedance.sync.SyncSDK;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: X.QSw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67042QSw implements InterfaceC67044QSy {
    public final InterfaceC67044QSy LJLIL;

    @Override // X.InterfaceC67044QSy
    public final java.util.Map<String, String> getCommonParams() {
        java.util.Map<String, String> hashMap;
        InterfaceC67044QSy interfaceC67044QSy = this.LJLIL;
        if (interfaceC67044QSy == null || (hashMap = interfaceC67044QSy.getCommonParams()) == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put("bytesync_sdk_version", String.valueOf(10100));
        Collection<QU8> registeredBusinesses = SyncSDK.getRegisteredBusinesses();
        if (registeredBusinesses != null && !registeredBusinesses.isEmpty()) {
            for (QU8 qu8 : registeredBusinesses) {
                if (qu8 != null) {
                    qu8.LIZ.getClass();
                }
            }
        }
        return hashMap;
    }

    public C67042QSw(InterfaceC67044QSy interfaceC67044QSy) {
        this.LJLIL = interfaceC67044QSy;
    }
}
