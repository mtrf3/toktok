package Y;

import X.A2F;
import X.A2G;
import X.A2I;
import X.C201657vl;
import X.C201667vm;
import X.C217268fq;
import X.C217798gh;
import X.C217808gi;
import X.C217878gp;
import X.C252569vg;
import X.C25678A5y;
import X.C2NU;
import X.C2U8;
import X.C38333F2r;
import X.C3C5;
import X.C5S1;
import X.C73305Spp;
import X.C76800UCe;
import X.C8JF;
import X.EF7;
import X.EnumC217688gW;
import X.EnumC217778gf;
import X.EnumC217828gk;
import X.InterfaceC116954iR;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC92693kP;
import X.Y9G;
import X.Y9H;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.api.CancelVideoMaskApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.mention.model.MentionCheckResult;
import com.ss.android.ugc.aweme.mention.model.MentionCheckSingleTypeResult;
import com.ss.android.ugc.aweme.mention.models.FollowFriendResponse;
import com.ss.android.ugc.aweme.mention.viewmodel.CommentMentionViewModel;
import com.ss.android.ugc.aweme.prefab.NetworkHelper;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDxS24S0300000_3 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onComplete$1(IDxS24S0300000_3 iDxS24S0300000_3) {
    }

    public static final void onComplete$2(IDxS24S0300000_3 iDxS24S0300000_3) {
    }

    public static final void onComplete$3(IDxS24S0300000_3 iDxS24S0300000_3) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            case 2:
                onComplete$2(this);
                return;
            case 3:
                onComplete$3(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(th, "e");
                return;
            case 1:
                onError$1(this, th);
                return;
            case 2:
                onError$2(this, th);
                return;
            case 3:
                onError$3(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            case 2:
                onNext$2(this, obj);
                return;
            case 3:
                onNext$3(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC92693kP);
                return;
            case 1:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 2:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 3:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            default:
                return;
        }
    }

    public static final void onComplete$0(IDxS24S0300000_3 iDxS24S0300000_3) {
        NetworkHelper networkHelper = (NetworkHelper) iDxS24S0300000_3.l0;
        InterfaceC92693kP interfaceC92693kP = networkHelper.LJLLI;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            InterfaceC92693kP interfaceC92693kP2 = networkHelper.LJLLI;
            o.LJI(interfaceC92693kP2);
            interfaceC92693kP2.dispose();
        }
    }

    public static final void onError$1(IDxS24S0300000_3 iDxS24S0300000_3, Throwable e) {
        String errorMsg;
        o.LJIIIZ(e, "e");
        if (e instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) e;
            if (TextUtils.isEmpty(c38333F2r.getErrorMsg())) {
                errorMsg = ((Context) iDxS24S0300000_3.l2).getString(R.string.imc);
            } else {
                errorMsg = c38333F2r.getErrorMsg();
            }
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(errorMsg);
            c5s1.LJ();
            Object rawResponse = c38333F2r.getRawResponse();
            o.LJII(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
            String str = ((BaseResponse) rawResponse).extra.logid;
            o.LJIIIIZZ(str, "e.rawResponse as BaseResponse).extra.logid");
            Object rawResponse2 = c38333F2r.getRawResponse();
            o.LJII(rawResponse2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
            CancelVideoMaskApi.LIZIZ(str, String.valueOf(((BaseResponse) rawResponse2).status_code));
            return;
        }
        C5S1 c5s12 = new C5S1(EF7.LIZIZ());
        c5s12.LIZJ(R.string.imc);
        c5s12.LJ();
        CancelVideoMaskApi.LIZ(1);
    }

    public static final void onError$2(IDxS24S0300000_3 iDxS24S0300000_3, Throwable e) {
        o.LJIIIZ(e, "e");
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDxS24S0300000_3.l1;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception();
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
        C217268fq c217268fq = ((CommentMentionViewModel) iDxS24S0300000_3.l0).LJLIL;
        if (c217268fq != null) {
            c217268fq.LIZIZ(true);
        }
        C217268fq c217268fq2 = ((CommentMentionViewModel) iDxS24S0300000_3.l0).LJLIL;
        if (c217268fq2 != null) {
            c217268fq2.LIZ();
        }
    }

    public static final void onError$3(IDxS24S0300000_3 iDxS24S0300000_3, Throwable e) {
        o.LJIIIZ(e, "e");
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDxS24S0300000_3.l1;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception();
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
        C217268fq c217268fq = ((CommentMentionViewModel) iDxS24S0300000_3.l0).LJLIL;
        if (c217268fq != null) {
            c217268fq.LIZIZ(true);
        }
    }

    public static final void onNext$0(IDxS24S0300000_3 iDxS24S0300000_3, Object obj) {
        ((Number) obj).longValue();
        NetworkHelper networkHelper = (NetworkHelper) iDxS24S0300000_3.l0;
        Activity activity = networkHelper.LJLJJL;
        if (activity != null) {
            C25678A5y.LIZ(activity, networkHelper.LJLJJLL, (Exception) iDxS24S0300000_3.l2, null);
        }
        NetworkHelper networkHelper2 = (NetworkHelper) iDxS24S0300000_3.l0;
        if (networkHelper2.LJLJL == 0) {
            C73305Spp c73305Spp = (C73305Spp) iDxS24S0300000_3.l1;
            if (c73305Spp != null && c73305Spp.getVisibility() == 0) {
                NetworkHelper networkHelper3 = (NetworkHelper) iDxS24S0300000_3.l0;
                Exception exc = (Exception) iDxS24S0300000_3.l2;
                C73305Spp c73305Spp2 = (C73305Spp) iDxS24S0300000_3.l1;
                if (c73305Spp2 != null) {
                    C252569vg.LIZ(c73305Spp2, networkHelper3.LJLJJLL, exc, new AqS153S0100000_3(networkHelper3, 1656));
                    c73305Spp2.setVisibility(0);
                } else {
                    networkHelper3.getClass();
                }
            }
        } else {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = networkHelper2.LJLJJI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
        C2NU.LIZ.LIZLLL(((NetworkHelper) iDxS24S0300000_3.l0).LJLL);
    }

    public static final void onNext$1(IDxS24S0300000_3 iDxS24S0300000_3, Object obj) {
        String str;
        BaseResponse t = (BaseResponse) obj;
        o.LJIIIZ(t, "t");
        if (t.status_code == 0) {
            ((C201657vl) iDxS24S0300000_3.l0).LIZ.LIZJ.setReportMaskInfo(new VideoMaskInfo(null, null, null, null, null, null, null, null, null, 511, null));
            AwemeService.LIZ().R1((Aweme) iDxS24S0300000_3.l1);
            ((C201657vl) iDxS24S0300000_3.l0).LIZIZ(false, new VideoMaskInfo(null, null, null, null, null, null, null, null, null, 511, null));
            C201657vl c201657vl = (C201657vl) iDxS24S0300000_3.l0;
            c201657vl.getClass();
            Aweme aweme = c201657vl.LIZ.LIZJ;
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            C2U8.LIZ(new C8JF(false, str, false));
            C2U8.LIZ(new C201667vm(false));
            CancelVideoMaskApi.LIZ(0);
            return;
        }
        BaseResponse.ServerTimeExtra serverTimeExtra = t.extra;
        if (serverTimeExtra == null) {
            return;
        }
        String str2 = serverTimeExtra.logid;
        o.LJIIIIZZ(str2, "t.extra.logid");
        CancelVideoMaskApi.LIZIZ(str2, String.valueOf(t.status_code));
    }

    public static final void onNext$2(IDxS24S0300000_3 iDxS24S0300000_3, Object obj) {
        C217808gi data = (C217808gi) obj;
        o.LJIIIZ(data, "data");
        ((CommentMentionViewModel) iDxS24S0300000_3.l0).kv0(data, (InterfaceC67352kd) iDxS24S0300000_3.l1, (EnumC217688gW) iDxS24S0300000_3.l2);
    }

    public static final void onNext$3(IDxS24S0300000_3 iDxS24S0300000_3, Object obj) {
        List arrayList;
        EnumC217828gk enumC217828gk;
        FollowFriendResponse response = (FollowFriendResponse) obj;
        o.LJIIIZ(response, "response");
        C217808gi c217808gi = ((CommentMentionViewModel) iDxS24S0300000_3.l0).LJLILLLLZI;
        if (c217808gi == null || (arrayList = c217808gi.LJLILLLLZI) == null) {
            arrayList = new ArrayList();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet2.add(((Y9G) it.next()).LIZ);
        }
        ArrayList arrayList2 = new ArrayList();
        for (MentionCheckResult mentionCheckResult : response.blockResults) {
            if (((MentionCheckSingleTypeResult) ListProtector.get(mentionCheckResult.userBlockedResults, 0)).blockType == 1) {
                linkedHashSet.add(mentionCheckResult.uid);
            }
        }
        for (User user : response.users) {
            if (!linkedHashSet2.contains(user.getUid())) {
                Y9G LIZIZ = Y9H.LIZIZ(user);
                int i = LIZIZ.LIZIZ;
                if (i != 1) {
                    if (i != 2) {
                        enumC217828gk = EnumC217828gk.ALL;
                    } else {
                        enumC217828gk = EnumC217828gk.FRIEND;
                    }
                } else {
                    enumC217828gk = EnumC217828gk.FOLLOW;
                }
                LIZIZ.LJIJI = new C217878gp(!linkedHashSet.contains(LIZIZ.LIZ), enumC217828gk, false, null, null, null, 0, null, null, 508);
                arrayList2.add(LIZIZ);
            }
        }
        ((CommentMentionViewModel) iDxS24S0300000_3.l0).kv0(new C217808gi(new C217798gh(null, response.hasMore, null, EnumC217778gf.RECOMMEND, null, null, (int) response.cursor, null, 363), arrayList2), (InterfaceC67352kd) iDxS24S0300000_3.l1, (EnumC217688gW) iDxS24S0300000_3.l2);
    }

    public static final void onSubscribe$0(IDxS24S0300000_3 iDxS24S0300000_3, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        ((NetworkHelper) iDxS24S0300000_3.l0).LJLLI = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDxS24S0300000_3(Object obj, CommentMentionViewModel commentMentionViewModel, InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd, EnumC217688gW enumC217688gW) {
        this.$t = enumC217688gW;
        this.l0 = obj;
        this.l1 = commentMentionViewModel;
        this.l2 = interfaceC67352kd;
    }
}
