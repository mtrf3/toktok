package com.ss.android.ugc.aweme.cell;

import X.C04270Et;
import X.C06490Nh;
import X.C07950Sx;
import X.C16880lQ;
import X.C198517qh;
import X.C214298b3;
import X.C220858ld;
import X.C227768wm;
import X.C63044Ooi;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72101SRl;
import X.C72102SRm;
import X.C72103SRn;
import X.C72104SRo;
import X.C72105SRp;
import X.C72106SRq;
import X.C78996UzQ;
import X.C7FA;
import X.C86V;
import X.C8HX;
import X.C9BD;
import X.C9BE;
import X.C9QW;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.YE1;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.viewmodel.MentionPostedAndLikeVideoVM;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PostedAndLikeVideoCell extends BaseVideoCell<C9QW> {
    public final C214298b3 LJLLI;
    public final String LJLLILLLL;
    public final C07950Sx LJLLJ;
    public TuxIconView LJLLL;
    public TuxTextView LJLLLL;
    public TuxIconView LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public TextView LJZI;

    public final MentionPostedAndLikeVideoVM V() {
        return (MentionPostedAndLikeVideoVM) this.LJLLI.getValue();
    }

    public PostedAndLikeVideoCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MentionPostedAndLikeVideoVM.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 132);
        C72104SRo c72104SRo = C72104SRo.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72102SRm.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 133), new AqS162S0100000_12((InterfaceC93923mO) this, 134), C72106SRq.INSTANCE, c72104SRo, new AqS162S0100000_12((InterfaceC93923mO) this, 135), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72103SRn.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 136), new AqS162S0100000_12((InterfaceC93923mO) this, 127), C72105SRp.INSTANCE, c72104SRo, new AqS162S0100000_12((InterfaceC93923mO) this, 128), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72101SRl.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 129), new AqS162S0100000_12((InterfaceC93923mO) this, 130), new AqS162S0100000_12((InterfaceC93923mO) this, 131), c72104SRo, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLLI = c214298b3;
        this.LJLLILLLL = "PostedAndLikeVideoCell";
        this.LJLLJ = new C07950Sx(1);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C16880lQ.LJJIJLIJ(N(), new ACListenerS32S0100000_12(this, 34));
        C16880lQ.LJJJJ(L(), new ACListenerS32S0100000_12(this, 35));
    }

    public final void U(Aweme aweme) {
        Video video = aweme.getVideo();
        if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) ListProtector.get(video.getCover().getUrlList(), 0))) {
            N().setImageResource(R.color.ao);
            return;
        }
        UrlModel animatedCover = video.getAnimatedCover();
        if (animatedCover == null) {
            animatedCover = video.getCover();
        }
        T(animatedCover, this.LJLLILLLL, aweme);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C9QW c9qw) {
        C9QW t = c9qw;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        Aweme aweme = t.LJLIL;
        TuxTextView tuxTextView = this.LJLLLL;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
            ViewGroup viewGroup = this.LJLJJI;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                View view = this.LJLZ;
                if (view != null) {
                    if (view.getVisibility() == 0) {
                        View view2 = this.LJLZ;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        } else {
                            o.LJIJI("mMask");
                            throw null;
                        }
                    }
                    if (aweme.isProhibited() && C227768wm.LJJIIJZLJL(aweme)) {
                        TuxTextView tuxTextView2 = this.LJLLLL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setVisibility(0);
                            ViewGroup viewGroup2 = this.LJLJJI;
                            if (viewGroup2 != null) {
                                viewGroup2.setVisibility(8);
                                View view3 = this.LJLZ;
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    TuxTextView tuxTextView3 = this.LJLLLL;
                                    if (tuxTextView3 != null) {
                                        tuxTextView3.setTuxFont(73);
                                        if (!TextUtils.isEmpty(aweme.getCoverNotice())) {
                                            TuxTextView tuxTextView4 = this.LJLLLL;
                                            if (tuxTextView4 != null) {
                                                tuxTextView4.setText(aweme.getCoverNotice());
                                            } else {
                                                o.LJIJI("mProhibitedInfo");
                                                throw null;
                                            }
                                        } else {
                                            C198517qh c198517qh = new C198517qh();
                                            c198517qh.LIZ.put("type", "cover_notice");
                                            c198517qh.LIZ.put("log_id", aweme.getRequestId());
                                            c198517qh.LIZ.put("item_id", aweme.getAid());
                                            C8HX.LIZIZ("notice_content_empty", "", c198517qh.LJ());
                                        }
                                    } else {
                                        o.LJIJI("mProhibitedInfo");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mMask");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mVideoInfoContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mProhibitedInfo");
                            throw null;
                        }
                    }
                    if (aweme.getIsTop() == 1 && V().LJLIL == 6) {
                        TextView textView = this.LJZI;
                        if (textView != null) {
                            textView.setVisibility(0);
                        } else {
                            o.LJIJI("mTvTop");
                            throw null;
                        }
                    } else {
                        TextView textView2 = this.LJZI;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        } else {
                            o.LJIJI("mTvTop");
                            throw null;
                        }
                    }
                    Boolean isPrivate = SharePrefCache.inst().getIsPrivateAvailable().LIZ();
                    if (aweme.isScheduleVideo()) {
                        P().setVisibility(0);
                        Context M = M();
                        o.LJI(M);
                        P().setCompoundDrawablesRelativeWithIntrinsicBounds(C04270Et.LIZIZ(M, R.drawable.aih), (Drawable) null, (Drawable) null, (Drawable) null);
                        P().setText(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(aweme.getScheduleTime() * 1000)));
                        P().setTuxFont(72);
                    } else {
                        Q(t);
                    }
                    o.LJIIIIZZ(isPrivate, "isPrivate");
                    boolean booleanValue = isPrivate.booleanValue();
                    if (aweme.isSubOnlyVideo()) {
                        TuxIconView tuxIconView = this.LJLLL;
                        if (tuxIconView != null) {
                            tuxIconView.setVisibility(0);
                            TuxIconView tuxIconView2 = this.LJLLL;
                            if (tuxIconView2 != null) {
                                tuxIconView2.setIconRes(R.raw.icon_star_ring);
                            } else {
                                o.LJIJI("mIvVideoPrivate");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mIvVideoPrivate");
                            throw null;
                        }
                    } else if (booleanValue && C78996UzQ.LJJIIZI(aweme) && aweme.getStatus().getPrivateStatus() != 0) {
                        TuxIconView tuxIconView3 = this.LJLLL;
                        if (tuxIconView3 != null) {
                            tuxIconView3.setVisibility(0);
                            TuxIconView tuxIconView4 = this.LJLLL;
                            if (tuxIconView4 != null) {
                                tuxIconView4.setTintColor(C86V.LJ().getColor(R.color.bc));
                                if (aweme.getStatus().getPrivateStatus() == 1) {
                                    TuxIconView tuxIconView5 = this.LJLLL;
                                    if (tuxIconView5 != null) {
                                        tuxIconView5.setIconRes(R.raw.icon_lock_small);
                                    } else {
                                        o.LJIJI("mIvVideoPrivate");
                                        throw null;
                                    }
                                } else if (aweme.getStatus().getPrivateStatus() == 2) {
                                    TuxIconView tuxIconView6 = this.LJLLL;
                                    if (tuxIconView6 != null) {
                                        tuxIconView6.setIconRes(R.raw.icon_two_person);
                                    } else {
                                        o.LJIJI("mIvVideoPrivate");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("mIvVideoPrivate");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mIvVideoPrivate");
                            throw null;
                        }
                    } else {
                        TuxIconView tuxIconView7 = this.LJLLL;
                        if (tuxIconView7 != null) {
                            tuxIconView7.setVisibility(8);
                        } else {
                            o.LJIJI("mIvVideoPrivate");
                            throw null;
                        }
                    }
                    View view4 = this.LJLZ;
                    if (view4 != null) {
                        if (view4.getVisibility() == 0) {
                            TuxIconView tuxIconView8 = this.LJLLLLLL;
                            if (tuxIconView8 != null) {
                                tuxIconView8.setVisibility(8);
                            } else {
                                o.LJIJI("mAudioViolation");
                                throw null;
                            }
                        } else {
                            TuxIconView tuxIconView9 = this.LJLLL;
                            if (tuxIconView9 != null) {
                                if (tuxIconView9.getVisibility() == 0) {
                                    TuxIconView tuxIconView10 = this.LJLLLLLL;
                                    if (tuxIconView10 != null) {
                                        tuxIconView10.setVisibility(8);
                                    } else {
                                        o.LJIJI("mAudioViolation");
                                        throw null;
                                    }
                                } else if (C220858ld.LJII(aweme)) {
                                    TuxIconView tuxIconView11 = this.LJLLLLLL;
                                    if (tuxIconView11 != null) {
                                        tuxIconView11.setVisibility(0);
                                    } else {
                                        o.LJIJI("mAudioViolation");
                                        throw null;
                                    }
                                } else {
                                    TuxIconView tuxIconView12 = this.LJLLLLLL;
                                    if (tuxIconView12 != null) {
                                        tuxIconView12.setVisibility(8);
                                    } else {
                                        o.LJIJI("mAudioViolation");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("mIvVideoPrivate");
                                throw null;
                            }
                        }
                        if (aweme.getVideo() != null && aweme.getVideo().isCallback()) {
                            U(aweme);
                        } else {
                            UrlModel LIZIZ = this.LJLLJ.LIZIZ(aweme.getAid());
                            if (LIZIZ == null || LIZIZ.getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) ListProtector.get(LIZIZ.getUrlList(), 0))) {
                                U(aweme);
                            } else {
                                T(LIZIZ, this.LJLLILLLL, aweme);
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            N().setForeground(this.itemView.getContext().getDrawable(R.drawable.bx6));
                        } else {
                            C7FA.LIZIZ(N());
                        }
                        if (C220858ld.LJIIIIZZ(aweme)) {
                            View view5 = this.LJLJJLL;
                            if (view5 != null) {
                                view5.setVisibility(0);
                                return;
                            } else {
                                o.LJIJI("mVideoMask");
                                throw null;
                            }
                        }
                        View view6 = this.LJLJJLL;
                        if (view6 != null) {
                            view6.setVisibility(8);
                            return;
                        } else {
                            o.LJIJI("mVideoMask");
                            throw null;
                        }
                    }
                    o.LJIJI("mMask");
                    throw null;
                }
                o.LJIJI("mMask");
                throw null;
            }
            o.LJIJI("mVideoInfoContainer");
            throw null;
        }
        o.LJIJI("mProhibitedInfo");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bsq, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.n6q);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.video_locked)");
        this.LJLLL = (TuxIconView) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.me4);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_play_count)");
        this.LJLJI = (TuxTextView) findViewById2;
        View findViewById3 = LIZIZ.findViewById(R.id.ib_);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.prohibited_info)");
        this.LJLLLL = (TuxTextView) findViewById3;
        View findViewById4 = LIZIZ.findViewById(R.id.n4d);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.video_audio_violation)");
        this.LJLLLLLL = (TuxIconView) findViewById4;
        View findViewById5 = LIZIZ.findViewById(R.id.n66);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.video_info_container)");
        this.LJLJJI = (ViewGroup) findViewById5;
        View findViewById6 = LIZIZ.findViewById(R.id.geh);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.mask)");
        this.LJLZ = findViewById6;
        View findViewById7 = LIZIZ.findViewById(R.id.kbx);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.star_atlas_status_ll)");
        this.LJZ = findViewById7;
        o.LJIIIIZZ(LIZIZ.findViewById(R.id.kbv), "findViewById(R.id.star_atlas_check_tv)");
        View findViewById8 = LIZIZ.findViewById(R.id.n54);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.video_cover_mask)");
        this.LJLJJLL = findViewById8;
        View findViewById9 = LIZIZ.findViewById(R.id.cover);
        o.LJIIIIZZ(findViewById9, "findViewById(R.id.cover)");
        this.LJLIL = (SmartImageView) findViewById9;
        View findViewById10 = LIZIZ.findViewById(R.id.b_o);
        o.LJIIIIZZ(findViewById10, "findViewById(R.id.checkbox)");
        this.LJLJJL = (C63044Ooi) findViewById10;
        View findViewById11 = LIZIZ.findViewById(R.id.moj);
        o.LJIIIIZZ(findViewById11, "findViewById(R.id.tv_top)");
        this.LJZI = (TextView) findViewById11;
        return LIZIZ;
    }
}
