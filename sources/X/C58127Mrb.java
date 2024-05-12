package X;

import android.content.Context;
import com.ss.android.elearning.lingo.context.ByteLingoService;
import com.ss.android.ugc.aweme.service.ByteLingoServiceImpl;

/* renamed from: X.Mrb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58127Mrb implements ByteLingoService {
    public static final C58127Mrb LIZIZ = new C58127Mrb();
    public final /* synthetic */ ByteLingoService LIZ;

    @Override // com.ss.android.elearning.lingo.context.ByteLingoService
    public final Context getApplicationContext() {
        return this.LIZ.getApplicationContext();
    }

    public C58127Mrb() {
        ByteLingoService byteLingoService;
        Object LIZ = C58096Mr6.LIZ(ByteLingoService.class, false);
        if (LIZ != null) {
            byteLingoService = (ByteLingoService) LIZ;
        } else {
            if (C58096Mr6.O4 == null) {
                synchronized (ByteLingoService.class) {
                    if (C58096Mr6.O4 == null) {
                        C58096Mr6.O4 = new ByteLingoServiceImpl();
                    }
                }
            }
            byteLingoService = C58096Mr6.O4;
        }
        this.LIZ = byteLingoService;
    }
}
