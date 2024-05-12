package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.4Pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108964Pk {
    public final SharePackage LIZ;
    public final IMContact LIZIZ;
    public final Handler LIZJ;
    public RunnableC108944Pi LIZLLL;

    public C108964Pk(SharePackage sharePackage, IMContact contact, Handler handler) {
        o.LJIIIZ(contact, "contact");
        o.LJIIIZ(handler, "handler");
        this.LIZ = sharePackage;
        this.LIZIZ = contact;
        this.LIZJ = handler;
    }
}
