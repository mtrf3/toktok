package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final /* synthetic */ class OZO extends TAZ implements InterfaceC88471Ynr<OYP, Context, Boolean> {
    public OZO(Object obj) {
        super(2, obj, InterfaceC62225ObV.class, "shareLink", "shareLink(Lcom/ss/android/ugc/aweme/share/base/model/ShareLinkContent;Landroid/content/Context;Lcom/ss/android/ugc/aweme/share/base/listener/ShareChannelFinishListener;)Z", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(OYP oyp, Context context) {
        OYP p0 = oyp;
        Context p1 = context;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        return Boolean.valueOf(((InterfaceC62225ObV) this.receiver).LJIJ(p0, p1, null));
    }
}
