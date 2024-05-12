package X;

import Y.ARunnableS20S0300000_9;
import Y.ARunnableS8S0210000_9;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MH7 extends C220538l7 {
    public boolean LLFII;

    @Override // X.C220538l7
    public final boolean c0() {
        return true;
    }

    @Override // X.AbstractC208618Gr
    public final boolean L() {
        if (((Boolean) C53050Kru.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return super.L();
    }

    @Override // X.AbstractC208468Gc
    public final boolean N() {
        return ((Boolean) C52989Kqv.LIZ.getValue()).booleanValue();
    }

    @Override // X.C220538l7
    public final void i0() {
        if (!this.LLFII) {
            return;
        }
        Context mContext = this.LJLJLJ;
        o.LJIIIIZZ(mContext, "mContext");
        C71895SJn c71895SJn = new C71895SJn(mContext, null, 6);
        Drawable[] drawableArr = {new ColorDrawable(C04330Ez.LIZIZ(this.LJLJLJ, R.color.ay)), new ColorDrawable(c71895SJn.getPlaceholderColor())};
        drawableArr[1] = new ColorDrawable(c71895SJn.getPulsingColor());
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        this.LJLILLLLZI.setBackground(transitionDrawable);
        transitionDrawable.startTransition(1000);
        this.LJLILLLLZI.postDelayed(new ARunnableS8S0210000_9((Object) this, (View) true, (boolean) transitionDrawable, (InterfaceC65784Pro<C76800UCe>) 3), 1200L);
    }

    @Override // X.C220538l7
    public final void g0(View v, MH9 awemeClickListener) {
        W5D w5d;
        o.LJIIIZ(awemeClickListener, "awemeClickListener");
        o.LJIIIZ(v, "v");
        if (C8SG.LIZIZ.LJJI(this.LJLIL) && (w5d = this.LJLILLLLZI.LJLILLLLZI) != null && w5d.LJI) {
            C38995FSd.LIZLLL().execute(new ARunnableS20S0300000_9(this, awemeClickListener, v, 6));
        } else {
            super.g0(v, awemeClickListener);
        }
    }

    public MH7(View view, String str, MH9 mh9) {
        super(view, str, mh9);
        f0();
    }

    @Override // X.C220538l7
    public final void a0(Aweme data, int i, boolean z, Bundle arguments) {
        int i2;
        Music music;
        boolean z2;
        boolean z3;
        SmartImageView smartImageView;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(arguments, "arguments");
        this.LLFII = data.isForMusicDetailLoading();
        super.a0(data, i, z, arguments);
        if (data.isPhotoMode()) {
            i2 = R.string.aba;
        } else {
            i2 = R.string.abc;
        }
        Context context = this.LJLJLJ;
        if (context != null && (smartImageView = this.LJLILLLLZI) != null) {
            smartImageView.setContentDescription(context.getString(i2));
        }
        Serializable serializable = arguments.getSerializable("detail_music_data");
        if (serializable instanceof Music) {
            music = (Music) serializable;
        } else {
            music = null;
        }
        if (data.isPinnedByArtist()) {
            String secUid = data.getAuthor().getSecUid();
            String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
            if (secUid != null && o.LJ(secUid, curSecUserId)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (music != null) {
                z3 = music.isPgc();
            } else {
                z3 = false;
            }
            this.LJLLL.setVisibility(0);
            this.LJLLL.setText(R.string.gd3);
            TuxTextView tuxTextView = this.LJLLL;
            Context mContext = this.LJLJLJ;
            o.LJIIIIZZ(mContext, "mContext");
            Integer LJI = C79045V0n.LJI(R.attr.go, mContext);
            o.LJI(LJI);
            tuxTextView.setTextColor(LJI.intValue());
            this.LJLLL.setBackgroundResource(R.drawable.amp);
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            if (z3 && z2 && curUser.getAccountType() != 3 && Z8A.LIZIZ.enableShowFeatureVideoEntrance()) {
                this.LJLLLL.setVisibility(0);
                MH9 mh9 = this.LLFF;
                if (mh9 != null) {
                    mh9.Q7(this.LJLLLL, this.LJLIL);
                }
            } else {
                this.LJLLLL.setVisibility(8);
            }
        } else if (data.getDetailPageVideoTag() == Aweme.VideoTag.FRIENDS_VIDEO) {
            this.LJLLL.setText(R.string.e0d);
            this.LJLLL.setVisibility(0);
            this.LJLLL.setBackgroundResource(R.drawable.amp);
            this.LJLLL.setTextColorRes(R.attr.d4);
            this.LLFF.p4(Boolean.TRUE);
            String aid = data.getAid();
            o.LJIIIIZZ(aid, "data.aid");
            int followStatus = data.getFollowStatus();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "single_song");
            c188727au.LIZLLL(followStatus, "follow_status");
            c188727au.LIZLLL(i + 1, "order");
            c188727au.LJIIIZ("group_id", aid);
            FMX.LJIIL("friend_tag_show", c188727au.LIZ);
        } else if (data.getDetailPageVideoTag() == Aweme.VideoTag.FOLLOWERS_VIDEO) {
            this.LJLLL.setText(R.string.e0c);
            this.LJLLL.setVisibility(0);
            this.LJLLL.setBackgroundResource(R.drawable.amp);
            this.LJLLL.setTextColorRes(R.attr.d4);
            this.LLFF.l2(Boolean.TRUE);
            String aid2 = data.getAid();
            o.LJIIIIZZ(aid2, "data.aid");
            int followStatus2 = data.getFollowStatus();
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "single_song");
            c188727au2.LIZLLL(followStatus2, "follow_status");
            c188727au2.LIZLLL(i + 1, "order");
            c188727au2.LJIIIZ("group_id", aid2);
            FMX.LJIIL("following_tag_show", c188727au2.LIZ);
        } else {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
            if (MEX.LIZJ() && data.getDetailPageVideoTag() == Aweme.VideoTag.EFFECT) {
                this.LJLLL.setText(R.string.g17);
                this.LJLLL.setVisibility(0);
                Context mContext2 = this.LJLJLJ;
                o.LJIIIIZZ(mContext2, "mContext");
                Integer LJI2 = C79045V0n.LJI(R.attr.dj, mContext2);
                if (LJI2 != null) {
                    this.LJLLL.setTextColor(LJI2.intValue());
                }
                this.LJLLL.setBackgroundResource(R.drawable.amo);
            } else if (data.getMusicStarter() != null) {
                this.LJLLL.setVisibility(0);
                if (!TextUtils.isEmpty(data.getLabelMusicStarterText())) {
                    this.LJLLL.setText(data.getLabelMusicStarterText());
                    TuxTextView tuxTextView2 = this.LJLLL;
                    Context mContext3 = this.LJLJLJ;
                    o.LJIIIIZZ(mContext3, "mContext");
                    Integer LJI3 = C79045V0n.LJI(R.attr.dj, mContext3);
                    o.LJI(LJI3);
                    tuxTextView2.setTextColor(LJI3.intValue());
                    this.LJLLL.setBackgroundResource(R.drawable.amo);
                }
            } else if ((C224868s6.LIZLLL(data) || C224868s6.LIZJ(data)) && !TextUtils.isEmpty(data.getLabelMusicStarterText())) {
                this.LJLLL.setVisibility(0);
                this.LJLLL.setText(data.getLabelMusicStarterText());
                TuxTextView tuxTextView3 = this.LJLLL;
                Context mContext4 = this.LJLJLJ;
                o.LJIIIIZZ(mContext4, "mContext");
                Integer LJI4 = C79045V0n.LJI(R.attr.dj, mContext4);
                o.LJI(LJI4);
                tuxTextView3.setTextColor(LJI4.intValue());
                this.LJLLL.setBackgroundResource(R.drawable.amo);
            }
        }
        if (C224868s6.LIZLLL(data)) {
            if (MH0.LIZ()) {
                this.LJLLL.setText(R.string.s5t);
                this.LJLLL.setVisibility(0);
            } else if (MH0.LIZIZ()) {
                this.LJLLL.setText(R.string.tik);
                this.LJLLL.setVisibility(0);
            }
            TuxTextView tuxTextView4 = this.LJLLL;
            Context mContext5 = this.LJLJLJ;
            o.LJIIIIZZ(mContext5, "mContext");
            Integer LJI5 = C79045V0n.LJI(R.attr.dj, mContext5);
            o.LJI(LJI5);
            tuxTextView4.setTextColor(LJI5.intValue());
            this.LJLLL.setBackgroundResource(R.drawable.amo);
        }
        if (data.isPgcShow()) {
            if (data.getTextTopLabels() != null && data.getTextTopLabels().size() > 0) {
                this.LJLLILLLL.setVisibility(0);
                this.LJLLI.setVisibility(8);
                C220538l7.h0(this.LJLLILLLL, (AwemeTextLabelModel) ListProtector.get(data.getTextTopLabels(), 0));
                return;
            }
            return;
        }
        if (data.getMusicStarter() != null || data.getOriginAuthor() != null || !TextUtils.equals(this.LJLJLLL, "challenge") || data.getIsTop() != 1) {
            return;
        }
        if (data.getTextTopLabels() != null && data.getTextTopLabels().size() > 0) {
            this.LJLLILLLL.setVisibility(0);
            this.LJLLI.setVisibility(8);
            C220538l7.h0(this.LJLLILLLL, (AwemeTextLabelModel) ListProtector.get(data.getTextTopLabels(), 0));
        } else {
            this.LJLLILLLL.setVisibility(8);
            this.LJLLI.setVisibility(0);
            C78765Uvh.LJI(this.LJLLI, data.getLabelTop(), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), (int) KL2.LIZJ(this.LJLJLJ, 6.0f), null);
        }
    }
}
