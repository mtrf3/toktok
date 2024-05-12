package X;

import Y.ACallableS81S0200000_3;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220378kr extends AbstractC225718tT {
    public static final C220398kt Companion = new Object() { // from class: X.8kt
    };
    public final transient C5H3 LJLIL;
    public transient C219568jY LJLILLLLZI;
    public transient C220388ks LJLJI;
    public final transient C5H3 LJLJJI;
    public final int entranceCategory;
    public final String viewedUserId;

    @Override // X.AbstractC225718tT, X.MGV
    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
        C220408ku.LIZ(this, str);
    }

    @Override // X.AbstractC225718tT, X.MGV
    public boolean sendCustomRequest(C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b, int i) {
        return false;
    }

    public final C220368kq getPresenter$addyours_release() {
        return (C220368kq) this.LJLJJI.getValue();
    }

    public final C219778jt getVm() {
        return (C219778jt) this.LJLIL.getValue();
    }

    public final void updateTopic(AddYoursTopic topic) {
        o.LJIIIZ(topic, "topic");
        C219778jt vm = getVm();
        vm.getClass();
        vm.LJLJLLL = topic;
        C219568jY c219568jY = this.LJLILLLLZI;
        if (c219568jY != null) {
            c219568jY.c0(topic);
        } else {
            o.LJIJI("headerHolder");
            throw null;
        }
    }

    @Override // X.AbstractC225718tT
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        String str;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str, "aid_fake_topic_header")) {
            return 1000;
        }
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        if (o.LJ(str2, "aid_fake_legal_hint_footer")) {
            return 1001;
        }
        if (aweme != null && aweme.getNewLiveRoomData() != null) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public MGX getJumpToVideoParam(MGX param, Aweme aweme) {
        o.LJIIIZ(param, "param");
        param.LIZ = "qa_detail";
        param.LIZIZ = "question_id";
        return param;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public C220368kq getPresenter(int i, ActivityC45651qj activityC45651qj) {
        return getPresenter$addyours_release();
    }

    public C220378kr(AddYoursTopic topic, Aweme aweme, int i, String str) {
        o.LJIIIZ(topic, "topic");
        this.entranceCategory = i;
        this.viewedUserId = str;
        this.LJLIL = C221118m3.LIZ(new AqS150S0200000_3(topic, this, 105));
        this.LJLJJI = C221118m3.LIZ(new AqS153S0100000_3(this, 1766));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.8ks, X.8Gx] */
    @Override // X.AbstractC225718tT
    public AbstractC208678Gx onCreateDetailAwemeViewHolder(ViewGroup parent, int i, final String str, final MH9 mh9) {
        o.LJIIIZ(parent, "parent");
        if (i != 1000) {
            if (i != 1001) {
                final View LIZ = C28289B8j.LIZ(parent, R.layout.ako, parent, false);
                return new C220538l7(LIZ, str, mh9) { // from class: X.8kv
                    @Override // X.C220538l7
                    public final void a0(Aweme data, int i2, boolean z, Bundle arguments) {
                        o.LJIIIZ(data, "data");
                        o.LJIIIZ(arguments, "arguments");
                        super.a0(data, i2, z, arguments);
                        if (data.getFollowStatus() == 2) {
                            C17N.LJJLIIIJJI(this.LJLLJ);
                            this.LJLLJ.setText(this.itemView.getContext().getResources().getText(R.string.gnr));
                            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.do);
                            if (LIZIZ != null) {
                                TextView ivSponser = this.LJLLJ;
                                o.LJIIIIZZ(ivSponser, "ivSponser");
                                ivSponser.setTextColor(LIZIZ.intValue());
                            }
                            this.LJLLJ.setBackgroundResource(R.drawable.amq);
                        }
                        C55480Lq0.LIZIZ.LIZ(249372161, true);
                        C10K.LIZJ(new ACallableS81S0200000_3(arguments, data, 8));
                    }
                };
            }
            C220388ks c220388ks = this.LJLJI;
            if (c220388ks != null) {
                return c220388ks;
            }
            final View LIZIZ = C1FL.LIZIZ(parent, R.layout.gd, parent, false, "from(parent.context).inf…ent, false,\n            )");
            ?? r2 = new AbstractC208678Gx(LIZIZ) { // from class: X.8ks
                @Override // X.MFR
                public final void LLZLLLL() {
                }

                @Override // X.AbstractC208678Gx
                public final void X(Aweme aweme, int i2, boolean z, Bundle bundle) {
                }

                @Override // X.AbstractC208678Gx
                public final void Y() {
                }
            };
            this.LJLJI = r2;
            return r2;
        }
        C219568jY c219568jY = this.LJLILLLLZI;
        if (c219568jY != null) {
            return c219568jY;
        }
        C219568jY c219568jY2 = new C219568jY(C1FL.LIZIZ(parent, R.layout.ge, parent, false, "from(parent.context).inf…ent, false,\n            )"), getVm().LJLJLLL, mh9);
        this.LJLILLLLZI = c219568jY2;
        return c219568jY2;
    }
}
