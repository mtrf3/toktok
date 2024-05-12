package com.ss.android.ugc.aweme.inbox.adapter;

import X.AGB;
import X.C15490jB;
import X.C15510jD;
import X.C221108m2;
import X.C2309594p;
import X.C32151Nz;
import X.C51588KMm;
import X.C53341Kwb;
import X.C53873LCj;
import X.C53882LCs;
import X.C53884LCu;
import X.C53887LCx;
import X.C54710Lda;
import X.C54712Ldc;
import X.C54714Lde;
import X.C56331M8x;
import X.C62822Ol8;
import X.C78765Uvh;
import X.C78897Uxp;
import X.EnumC53720L6m;
import Y.ARunnableS45S0100000_9;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxLiveRVCell extends InboxLiveBaseCell<C54712Ldc> {
    public C51588KMm LJLILLLLZI;
    public TextView LJLJI;
    public TextView LJLJJI;
    public C53873LCj LJLJJL;
    public C53887LCx LJLJJLL;
    public C53884LCu LJLJL;
    public C53873LCj LJLJLLL;
    public C53873LCj LJLL;
    public C53873LCj LJLLI;
    public final boolean LJLLJ;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C2309594p.LJLIL);
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(AGB.LJLIL);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r4.isFresh() == true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e5, code lost:
    
        if (r4 != null) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.adapter.InboxLiveRVCell.P():void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell
    public final void M() {
        if (this.LJLLJ) {
            if (V()) {
                C53884LCu c53884LCu = this.LJLJL;
                if (c53884LCu != null) {
                    c53884LCu.LJII();
                    return;
                }
                return;
            }
            C53887LCx c53887LCx = this.LJLJJLL;
            if (c53887LCx == null) {
                return;
            }
            c53887LCx.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell
    public final void U() {
        if (this.LJLLJ) {
            if (V()) {
                C53884LCu c53884LCu = this.LJLJL;
                if (c53884LCu != null) {
                    c53884LCu.LIZ();
                    return;
                }
                return;
            }
            C53887LCx c53887LCx = this.LJLJJLL;
            if (c53887LCx == null) {
                return;
            }
            c53887LCx.LIZ();
        }
    }

    public final boolean V() {
        return ((Boolean) this.LJLJLJ.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return ((Number) C54714Lde.LIZLLL.getValue()).intValue();
    }

    public InboxLiveRVCell() {
        boolean z;
        if (C54714Lde.LIZ() != 2 || !C54714Lde.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLJ = z;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.eko);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.inbox_iv_cover)");
        this.LJLILLLLZI = (C51588KMm) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.eks);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.inbox_tv_name)");
        this.LJLJI = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.ekp);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.inbox_iv_live_circle)");
        this.LJLJJL = (C53873LCj) findViewById3;
        if (this.LJLLJ) {
            this.LJLJJI = (TextView) this.itemView.findViewById(R.id.ekm);
            if (V()) {
                C53882LCs syncController = C54710Lda.LIZIZ.getSyncController();
                if (syncController != null) {
                    C51588KMm c51588KMm = this.LJLILLLLZI;
                    if (c51588KMm != null) {
                        C53873LCj c53873LCj = this.LJLJJL;
                        if (c53873LCj != null) {
                            this.LJLJL = new C53884LCu(syncController, c51588KMm, c51588KMm, c53873LCj);
                        } else {
                            o.LJIJI("mLiveCircleView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mCover");
                        throw null;
                    }
                }
            } else {
                EnumC53720L6m enumC53720L6m = EnumC53720L6m.INBOX;
                C51588KMm c51588KMm2 = this.LJLILLLLZI;
                if (c51588KMm2 != null) {
                    C53873LCj c53873LCj2 = this.LJLJJL;
                    if (c53873LCj2 != null) {
                        this.LJLJJLL = new C53887LCx(enumC53720L6m, c51588KMm2, c51588KMm2, c53873LCj2);
                    } else {
                        o.LJIJI("mLiveCircleView");
                        throw null;
                    }
                } else {
                    o.LJIJI("mCover");
                    throw null;
                }
            }
        } else {
            this.LJLJLLL = (C53873LCj) this.itemView.findViewById(R.id.fv2);
            this.LJLL = (C53873LCj) this.itemView.findViewById(R.id.fv4);
            this.LJLLI = (C53873LCj) this.itemView.findViewById(R.id.fv3);
            Integer num = (Integer) this.LJLLILLLL.getValue();
            if (num == null || num.intValue() != 1) {
                C53873LCj c53873LCj3 = this.LJLL;
                if (c53873LCj3 != null) {
                    c53873LCj3.setVisibility(8);
                }
                C53873LCj c53873LCj4 = this.LJLJLLL;
                if (c53873LCj4 != null) {
                    c53873LCj4.setVisibility(8);
                }
                C53873LCj c53873LCj5 = this.LJLLI;
                if (c53873LCj5 != null) {
                    c53873LCj5.setVisibility(0);
                }
                C53873LCj c53873LCj6 = this.LJLLI;
                if (c53873LCj6 != null) {
                    c53873LCj6.LIZ(-1, -1);
                }
                C53873LCj c53873LCj7 = this.LJLLI;
                if (c53873LCj7 != null) {
                    c53873LCj7.post(new ARunnableS45S0100000_9(this, 60));
                }
            } else {
                C53873LCj c53873LCj8 = this.LJLL;
                if (c53873LCj8 != null) {
                    c53873LCj8.setVisibility(0);
                }
                C53873LCj c53873LCj9 = this.LJLJLLL;
                if (c53873LCj9 != null) {
                    c53873LCj9.setVisibility(0);
                }
                C53873LCj c53873LCj10 = this.LJLLI;
                if (c53873LCj10 != null) {
                    c53873LCj10.setVisibility(8);
                }
                C53873LCj c53873LCj11 = this.LJLL;
                if (c53873LCj11 != null) {
                    c53873LCj11.LIZ(-1, -1);
                }
                C53873LCj c53873LCj12 = this.LJLJLLL;
                if (c53873LCj12 != null) {
                    c53873LCj12.post(new ARunnableS45S0100000_9(this, 59));
                }
            }
        }
        if (C53341Kwb.LIZ()) {
            C51588KMm c51588KMm3 = this.LJLILLLLZI;
            if (c51588KMm3 != null) {
                C78897Uxp.LJJJJL(c51588KMm3, C32151Nz.LJIIZILJ(32));
            } else {
                o.LJIJI("mCover");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C54712Ldc t) {
        User user;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        if (this.LJLLJ) {
            if (V()) {
                C53884LCu c53884LCu = this.LJLJL;
                if (c53884LCu != null) {
                    c53884LCu.LJFF = !t.LJLJI;
                }
            } else {
                C53887LCx c53887LCx = this.LJLJJLL;
                if (c53887LCx != null) {
                    c53887LCx.LJIIJ(!t.LJLJI);
                }
            }
        }
        InboxLiveNotice inboxLiveNotice = t.LJLILLLLZI;
        if (inboxLiveNotice != null && (user = inboxLiveNotice.getUser()) != null) {
            C51588KMm c51588KMm = this.LJLILLLLZI;
            if (c51588KMm != null) {
                C78765Uvh.LJFF(c51588KMm, user.getAvatarThumb());
                TextView textView = this.LJLJI;
                if (textView != null) {
                    textView.setText(C56331M8x.LIZIZ(user, false, true));
                } else {
                    o.LJIJI("mTvName");
                    throw null;
                }
            } else {
                o.LJIJI("mCover");
                throw null;
            }
        }
        TextView textView2 = this.LJLJJI;
        if (textView2 != null) {
            T(textView2);
        }
        if (t.LJLJI) {
            C53873LCj c53873LCj = this.LJLJJL;
            if (c53873LCj != null) {
                c53873LCj.setVisibility(0);
                if (this.LJLLJ) {
                    if (V()) {
                        C53884LCu c53884LCu2 = this.LJLJL;
                        if (c53884LCu2 != null) {
                            c53884LCu2.LIZIZ(null, InboxLiveRVCell.class, null, null);
                            return;
                        }
                        return;
                    }
                    C53887LCx c53887LCx2 = this.LJLJJLL;
                    if (c53887LCx2 == null) {
                        return;
                    }
                    c53887LCx2.LJIIIIZZ(null, InboxLiveRVCell.class);
                    return;
                }
                Integer num = (Integer) this.LJLLILLLL.getValue();
                if (num == null || num.intValue() != 1) {
                    C15490jB.LIZJ(this.LJLLI, C15510jD.LJIIIZ("tiktok_live_watch_resource_normal_1", "ttlive_item_rank_top_on_going_hd.webp"));
                    return;
                } else {
                    C15490jB.LIZJ(this.LJLJLLL, C15510jD.LJIIIZ("tiktok_live_watch_resource_normal_1", "live_skylight_icon_anim_small_size.webp"));
                    return;
                }
            }
            o.LJIJI("mLiveCircleView");
            throw null;
        }
    }
}
