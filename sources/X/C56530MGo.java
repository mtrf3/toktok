package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.MGo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56530MGo extends AbstractC225718tT {
    public static final C56534MGs Companion = new C56534MGs();
    public String LJLIL;
    public WeakReference<ActivityC45651qj> LJLILLLLZI;
    public transient InterfaceC65784Pro<OSZ<Long, String>> LJLJI;
    public Aweme LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C56530MGo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.AbstractC225718tT, X.MGV
    public boolean sendCustomRequest(C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b, int i) {
        return false;
    }

    public final WeakReference<ActivityC45651qj> getActivity() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC65784Pro<OSZ<Long, String>> getPreloadInfoInvoke() {
        return this.LJLJI;
    }

    public final String getSource() {
        return this.LJLIL;
    }

    public final Aweme getToJumpAweme() {
        return this.LJLJJI;
    }

    public C56530MGo(String source) {
        o.LJIIIZ(source, "source");
        this.LJLIL = source;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public void onJumpToDetail(String aid) {
        o.LJIIIZ(aid, "aid");
        super.onJumpToDetail(aid);
    }

    public final void setActivity(WeakReference<ActivityC45651qj> weakReference) {
        this.LJLILLLLZI = weakReference;
    }

    public final void setPreloadInfoInvoke(InterfaceC65784Pro<OSZ<Long, String>> interfaceC65784Pro) {
        this.LJLJI = interfaceC65784Pro;
    }

    public final void setSource(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    public final void setToJumpAweme(Aweme aweme) {
        this.LJLJJI = aweme;
    }

    @Override // X.AbstractC225718tT
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        if (aweme != null && aweme.getNewLiveRoomData() != null) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public MGX getJumpToVideoParam(MGX param, Aweme aweme) {
        o.LJIIIZ(param, "param");
        o.LJIIIZ(aweme, "aweme");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "challenge");
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("tag_id", param.LIZLLL);
        c188727au.LJIIIZ("search_id", MH1.LJLJL.get(aweme.getAid()));
        c188727au.LJIIIZ("rank_index", String.valueOf(param.LJFF));
        c188727au.LJIIIZ("process_id", param.LJ);
        FMX.LJIIL("feed_enter", c188727au.LIZ);
        this.LJLJJI = aweme;
        param.LIZ = "from_challenge";
        param.LIZIZ = "challenge_id";
        return param;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object, X.MH1] */
    @Override // X.AbstractC225718tT, X.MGV
    public C51031K1b<? extends AbstractC51036K1g<?, ?>> getPresenter(int i, ActivityC45651qj activityC45651qj) {
        C68322mC c68322mC = new C68322mC();
        ?? mh1 = new MH1();
        if (activityC45651qj != null) {
            ChallengeDetailViewModel LIZ = C56532MGq.LIZ(activityC45651qj);
            LIZ.getClass();
            LIZ.LJLILLLLZI.setValue(new OSZ<>(Integer.valueOf(i), mh1));
        }
        c68322mC.element = mh1;
        String str = this.LJLIL;
        if (!TextUtils.isEmpty(str)) {
            mh1.LJLJI = str;
        }
        C56531MGp c56531MGp = new C56531MGp(this, c68322mC);
        c56531MGp.LJJ((C8BS) c68322mC.element);
        return c56531MGp;
    }

    public /* synthetic */ C56530MGo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // X.AbstractC225718tT
    public AbstractC208678Gx onCreateDetailAwemeViewHolder(ViewGroup parent, int i, String str, MH9 mh9) {
        o.LJIIIZ(parent, "parent");
        if (i != 1) {
            return new C220538l7(C28289B8j.LIZ(parent, R.layout.ako, parent, false), str, mh9) { // from class: X.8lG
                {
                    f0();
                }

                @Override // X.C220538l7
                public final void a0(Aweme aweme, int i2, boolean z, Bundle bundle) {
                    super.a0(aweme, i2, z, bundle);
                    if (aweme.isPgcShow()) {
                        if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                            this.LJLLILLLL.setVisibility(0);
                            this.LJLLI.setVisibility(8);
                            C220538l7.h0(this.LJLLILLLL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
                            return;
                        }
                        return;
                    }
                    if (aweme.getOriginAuthor() != null || aweme.getMusicStarter() != null || aweme.getOriginAuthor() != null || !TextUtils.equals(this.LJLJLLL, "challenge") || aweme.getIsTop() != 1) {
                        return;
                    }
                    if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                        this.LJLLILLLL.setVisibility(0);
                        this.LJLLI.setVisibility(8);
                        C220538l7.h0(this.LJLLILLLL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
                    } else {
                        this.LJLLILLLL.setVisibility(8);
                        this.LJLLI.setVisibility(0);
                        C78765Uvh.LJI(this.LJLLI, aweme.getLabelTop(), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), null);
                    }
                }
            };
        }
        throw null;
    }
}
