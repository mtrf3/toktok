package X;

import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;

/* renamed from: X.3Pr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C83553Pr extends TBS implements InterfaceC88472Yns<IMUserBaseInfo, String> {
    public C83553Pr(C83543Pq c83543Pq) {
        super(1, c83543Pq, C83543Pq.class, "getUserBaseInfoLogString", "getUserBaseInfoLogString$im_base_release(Lcom/ss/android/ugc/aweme/contact/model/IMUserBaseInfo;)Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(IMUserBaseInfo iMUserBaseInfo) {
        IMUserBaseInfo iMUserBaseInfo2 = iMUserBaseInfo;
        this.receiver.getClass();
        if (iMUserBaseInfo2 == null) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(iMUserBaseInfo2.getMafStatus());
        LIZ.append('#');
        LIZ.append(iMUserBaseInfo2.getFollowStatus());
        LIZ.append('#');
        LIZ.append(iMUserBaseInfo2.getUserId());
        LIZ.append('#');
        LIZ.append(iMUserBaseInfo2.getNickName());
        return X1D.LIZIZ(LIZ);
    }
}
