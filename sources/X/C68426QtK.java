package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.gson.s;
import com.ss.android.ugc.aweme.account.login.loginmethods.EncryptedLoginMethod;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QtK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68426QtK<TResult> implements InterfaceC67677QhF {
    public final /* synthetic */ C68416QtA LJLIL;
    public final /* synthetic */ InterfaceC67677QhF<List<EncryptedLoginMethod>> LJLILLLLZI;

    public C68426QtK(C68416QtA c68416QtA, C68425QtJ c68425QtJ) {
        this.LJLIL = c68416QtA;
        this.LJLILLLLZI = c68425QtJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67677QhF
    public final void onSuccess(Object obj) {
        byte[] bArr;
        String str;
        Object obj2;
        java.util.Map<String, RetrieveBytesResponse.BlockstoreData> LJJJJL = ((RetrieveBytesResponse) obj).LJJJJL();
        o.LJIIIIZZ(LJJJJL, "result.blockstoreDataMap");
        RetrieveBytesResponse.BlockstoreData blockstoreData = LJJJJL.get("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY");
        if (blockstoreData != null) {
            bArr = blockstoreData.zza;
        } else {
            bArr = null;
        }
        if (bArr != null) {
            new String(bArr, PVC.LIZ);
        }
        System.currentTimeMillis();
        C68416QtA c68416QtA = this.LJLIL;
        if (bArr != null) {
            str = new String(bArr, C68416QtA.LIZIZ);
        } else {
            str = "";
        }
        c68416QtA.getClass();
        if (str.length() == 0) {
            obj2 = C61878OQg.INSTANCE;
        } else {
            try {
                Type type = new C68431QtP().getType();
                o.LJIIIIZZ(type, "object : TypeToken<Array…edLoginMethod>>() {}.type");
                obj2 = GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str, type);
                o.LJIIIIZZ(obj2, "get().getGson().fromJson(data, listType)");
            } catch (s unused) {
                obj2 = C61878OQg.INSTANCE;
            }
        }
        this.LJLILLLLZI.onSuccess(obj2);
    }
}
