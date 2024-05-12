package com.ss.android.ugc.aweme.paidcontent.ui;

import X.A3U;
import X.C16880lQ;
import X.C184077Kh;
import X.C211568Sa;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C25618A3q;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78926UyI;
import X.MHO;
import X.ORZ;
import X.RunnableC25614A3m;
import X.W5F;
import X.W5U;
import Y.ACListenerS39S0200000_4;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentDetailViewItemCell extends PowerCell<A3U> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 616));
    public final C214378bB LJLILLLLZI;
    public SmartImageView LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public TuxIconView LJLJJLL;
    public TuxIconView LJLJL;
    public TuxTextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public TuxTextView LJLL;
    public TuxIconView LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;

    public PaidContentDetailViewItemCell() {
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 617);
        this.LJLILLLLZI = new C214378bB(C65352Pkq.LIZ(PaidContentDetailVideoListViewModel.class), aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C25618A3q.INSTANCE, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.n67);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.video_item_cover)");
        this.LJLJI = (SmartImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.bqp);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.completed_overlay)");
        this.LJLJJLL = (TuxIconView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.n6_);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.…video_item_reported_icon)");
        this.LJLJL = (TuxIconView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.ev_);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.item_title)");
        this.LJLJLJ = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.etw);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.item_duration)");
        this.LJLJLLL = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.eve);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.item_unavailable_desc)");
        this.LJLL = (TuxTextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.eug);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.item_lock_icon)");
        this.LJLLI = (TuxIconView) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.i1w);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.preview_ava)");
        this.LJLLILLLL = findViewById8;
        View findViewById9 = this.itemView.findViewById(R.id.evd);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.item_trailer_pre)");
        this.LJLLJ = findViewById9;
        View findViewById10 = this.itemView.findViewById(R.id.evc);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.item_trailer_post)");
        this.LJLLL = findViewById10;
        View findViewById11 = this.itemView.findViewById(R.id.n68);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.id.video_item_progress)");
        this.LJLJJI = findViewById11;
        View findViewById12 = this.itemView.findViewById(R.id.n69);
        o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.…item_progress_background)");
        this.LJLJJL = findViewById12;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(A3U t) {
        Video video;
        UrlModel cover;
        List<String> urlList;
        String str;
        String str2;
        boolean z;
        PaidContentInfo paidContentInfo;
        float f;
        PaidContentInfo paidContentInfo2;
        Video video2;
        UrlModel cover2;
        List<String> urlList2;
        String str3;
        o.LJIIIZ(t, "t");
        String str4 = "";
        if (t.LJLIL.isReported()) {
            Aweme aweme = t.LJLIL.getAweme();
            if (aweme != null && (video2 = aweme.getVideo()) != null && (cover2 = video2.getCover()) != null && (urlList2 = cover2.getUrlList()) != null && (str3 = (String) ORZ.LJLLLL(urlList2)) != null) {
                str4 = str3;
            }
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str4);
            LJIIIIZZ.LJIJI = Bitmap.Config.ARGB_8888;
            LJIIIIZZ.LJIL = new MHO(15, 0);
            SmartImageView smartImageView = this.LJLJI;
            if (smartImageView != null) {
                LJIIIIZZ.LJJIIJ = smartImageView;
                C16880lQ.LLJJJ(LJIIIIZZ);
                TuxIconView tuxIconView = this.LJLJL;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(0);
                    TuxTextView tuxTextView = this.LJLL;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(0);
                    } else {
                        o.LJIJI("videoUnavailableDesc");
                        throw null;
                    }
                } else {
                    o.LJIJI("videoItemReportedIcon");
                    throw null;
                }
            } else {
                o.LJIJI("videoItemImage");
                throw null;
            }
        } else {
            Aweme aweme2 = t.LJLIL.getAweme();
            if (aweme2 != null && (video = aweme2.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && (str = (String) ORZ.LJLLLL(urlList)) != null) {
                str4 = str;
            }
            W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str4);
            SmartImageView smartImageView2 = this.LJLJI;
            if (smartImageView2 != null) {
                LJIIIIZZ2.LJJIIJ = smartImageView2;
                C16880lQ.LLJJJ(LJIIIIZZ2);
                TuxIconView tuxIconView2 = this.LJLJL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(8);
                    TuxTextView tuxTextView2 = this.LJLL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setVisibility(8);
                    } else {
                        o.LJIJI("videoUnavailableDesc");
                        throw null;
                    }
                } else {
                    o.LJIJI("videoItemReportedIcon");
                    throw null;
                }
            } else {
                o.LJIJI("videoItemImage");
                throw null;
            }
        }
        Aweme aweme3 = t.LJLIL.getAweme();
        if (aweme3 != null) {
            str2 = aweme3.getDesc();
        } else {
            str2 = null;
        }
        TuxTextView tuxTextView3 = this.LJLJLJ;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(str2);
            long j = 1000;
            long videoDuration = t.LJLIL.getVideoDuration() / j;
            TuxTextView tuxTextView4 = this.LJLJLLL;
            if (tuxTextView4 != null) {
                Resources resources = this.itemView.getResources();
                o.LJIIIIZZ(resources, "itemView.resources");
                StringBuilder sb = new StringBuilder();
                if (videoDuration < 60) {
                    sb.append(resources.getString(R.string.qn_, String.valueOf(videoDuration)));
                } else {
                    long j2 = 60;
                    sb.append(resources.getString(R.string.qn9, String.valueOf(videoDuration / j2), String.valueOf(videoDuration % j2)));
                }
                String sb2 = sb.toString();
                o.LJIIIIZZ(sb2, "durationStringBuilder.toString()");
                tuxTextView4.setText(sb2);
                Aweme aweme4 = t.LJLIL.getAweme();
                if (aweme4 != null && (paidContentInfo2 = aweme4.mPaidContentInfo) != null && paidContentInfo2.getShouldShowPreview()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && C211568Sa.LIZ()) {
                    View view = this.LJLLILLLL;
                    if (view != null) {
                        view.setVisibility(0);
                    } else {
                        o.LJIJI("videoPreviewAvaTag");
                        throw null;
                    }
                } else {
                    View view2 = this.LJLLILLLL;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    } else {
                        o.LJIJI("videoPreviewAvaTag");
                        throw null;
                    }
                }
                if (t.LJLILLLLZI) {
                    TuxIconView tuxIconView3 = this.LJLLI;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setVisibility(8);
                        if (t.LJLIL.isIntro()) {
                            View view3 = this.LJLLL;
                            if (view3 != null) {
                                view3.setVisibility(8);
                                View view4 = this.LJLLJ;
                                if (view4 != null) {
                                    view4.setVisibility(0);
                                } else {
                                    o.LJIJI("videoTrailerPreTag");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("videoTrailerPostTag");
                                throw null;
                            }
                        } else {
                            View view5 = this.LJLLL;
                            if (view5 != null) {
                                view5.setVisibility(8);
                                View view6 = this.LJLLJ;
                                if (view6 != null) {
                                    view6.setVisibility(8);
                                } else {
                                    o.LJIJI("videoTrailerPreTag");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("videoTrailerPostTag");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("videoLockIcon");
                        throw null;
                    }
                } else if (t.LJLJI) {
                    TuxIconView tuxIconView4 = this.LJLLI;
                    if (tuxIconView4 != null) {
                        tuxIconView4.setVisibility(8);
                        if (t.LJLIL.isIntro()) {
                            View view7 = this.LJLLJ;
                            if (view7 != null) {
                                view7.setVisibility(8);
                                View view8 = this.LJLLL;
                                if (view8 != null) {
                                    view8.setVisibility(0);
                                } else {
                                    o.LJIJI("videoTrailerPostTag");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("videoTrailerPreTag");
                                throw null;
                            }
                        } else {
                            View view9 = this.LJLLJ;
                            if (view9 != null) {
                                view9.setVisibility(8);
                                View view10 = this.LJLLL;
                                if (view10 != null) {
                                    view10.setVisibility(8);
                                } else {
                                    o.LJIJI("videoTrailerPostTag");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("videoTrailerPreTag");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("videoLockIcon");
                        throw null;
                    }
                } else if (t.LJLIL.isIntro()) {
                    View view11 = this.LJLLJ;
                    if (view11 != null) {
                        view11.setVisibility(0);
                        View view12 = this.LJLLL;
                        if (view12 != null) {
                            view12.setVisibility(8);
                            TuxIconView tuxIconView5 = this.LJLLI;
                            if (tuxIconView5 != null) {
                                tuxIconView5.setVisibility(8);
                            } else {
                                o.LJIJI("videoLockIcon");
                                throw null;
                            }
                        } else {
                            o.LJIJI("videoTrailerPostTag");
                            throw null;
                        }
                    } else {
                        o.LJIJI("videoTrailerPreTag");
                        throw null;
                    }
                } else {
                    Aweme aweme5 = t.LJLIL.getAweme();
                    if (aweme5 != null && (paidContentInfo = aweme5.mPaidContentInfo) != null && paidContentInfo.getShouldShowPreview() && C211568Sa.LIZ()) {
                        TuxIconView tuxIconView6 = this.LJLLI;
                        if (tuxIconView6 != null) {
                            tuxIconView6.setVisibility(8);
                        } else {
                            o.LJIJI("videoLockIcon");
                            throw null;
                        }
                    } else {
                        View view13 = this.LJLLJ;
                        if (view13 != null) {
                            view13.setVisibility(8);
                            View view14 = this.LJLLL;
                            if (view14 != null) {
                                view14.setVisibility(8);
                                TuxIconView tuxIconView7 = this.LJLLI;
                                if (tuxIconView7 != null) {
                                    tuxIconView7.setVisibility(0);
                                } else {
                                    o.LJIJI("videoLockIcon");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("videoTrailerPostTag");
                                throw null;
                            }
                        } else {
                            o.LJIJI("videoTrailerPreTag");
                            throw null;
                        }
                    }
                }
                if (t.LJLIL.isReported()) {
                    TuxIconView tuxIconView8 = this.LJLLI;
                    if (tuxIconView8 != null) {
                        tuxIconView8.setVisibility(8);
                        View view15 = this.LJLLJ;
                        if (view15 != null) {
                            view15.setVisibility(8);
                            View view16 = this.LJLLL;
                            if (view16 != null) {
                                view16.setVisibility(8);
                                View view17 = this.LJLLILLLL;
                                if (view17 != null) {
                                    view17.setVisibility(8);
                                    TuxIconView tuxIconView9 = this.LJLJJLL;
                                    if (tuxIconView9 != null) {
                                        tuxIconView9.setVisibility(8);
                                    } else {
                                        o.LJIJI("videoCompletedOverlay");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("videoPreviewAvaTag");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("videoTrailerPostTag");
                                throw null;
                            }
                        } else {
                            o.LJIJI("videoTrailerPreTag");
                            throw null;
                        }
                    } else {
                        o.LJIJI("videoLockIcon");
                        throw null;
                    }
                } else {
                    View view18 = this.LJLJJI;
                    if (view18 != null) {
                        view18.setVisibility(8);
                        View view19 = this.LJLJJL;
                        if (view19 != null) {
                            view19.setVisibility(8);
                            TuxIconView tuxIconView10 = this.LJLJJLL;
                            if (tuxIconView10 != null) {
                                tuxIconView10.setVisibility(8);
                                if (t.LJLJI || t.LJLILLLLZI) {
                                    TuxIconView tuxIconView11 = this.LJLLI;
                                    if (tuxIconView11 != null) {
                                        tuxIconView11.setVisibility(8);
                                        Aweme aweme6 = t.LJLIL.getAweme();
                                        if (aweme6 != null) {
                                            if (aweme6.mPaidContentInfo.getPaidContentResumeTimestamp() <= 0 && !t.LJLIL.isComplete()) {
                                                View view20 = this.LJLJJI;
                                                if (view20 != null) {
                                                    view20.setVisibility(8);
                                                    View view21 = this.LJLJJL;
                                                    if (view21 != null) {
                                                        view21.setVisibility(8);
                                                    } else {
                                                        o.LJIJI("progressBarBackground");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("progressBar");
                                                    throw null;
                                                }
                                            } else {
                                                PaidContentDetailVideoListViewModel paidContentDetailVideoListViewModel = (PaidContentDetailVideoListViewModel) this.LJLILLLLZI.getValue();
                                                PaidVideoItem model = t.LJLIL;
                                                o.LJIIIZ(model, "model");
                                                Aweme aweme7 = model.getAweme();
                                                if (aweme7 != null) {
                                                    f = ((float) aweme7.mPaidContentInfo.getPaidContentResumeTimestamp()) / ((float) (model.getVideoDuration() / j));
                                                } else {
                                                    f = 0.0f;
                                                }
                                                if (f >= paidContentDetailVideoListViewModel.hv0().LJ() || f >= 1.0f || t.LJLIL.isComplete()) {
                                                    View view22 = this.LJLJJI;
                                                    if (view22 != null) {
                                                        view22.setVisibility(8);
                                                        View view23 = this.LJLJJL;
                                                        if (view23 != null) {
                                                            view23.setVisibility(8);
                                                            TuxIconView tuxIconView12 = this.LJLJJLL;
                                                            if (tuxIconView12 != null) {
                                                                tuxIconView12.setVisibility(0);
                                                            } else {
                                                                o.LJIJI("videoCompletedOverlay");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("progressBarBackground");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("progressBar");
                                                        throw null;
                                                    }
                                                } else {
                                                    View view24 = this.LJLJJI;
                                                    if (view24 != null) {
                                                        view24.setVisibility(0);
                                                        View view25 = this.LJLJJL;
                                                        if (view25 != null) {
                                                            view25.setVisibility(0);
                                                            View view26 = this.LJLJJL;
                                                            if (view26 != null) {
                                                                view26.post(new RunnableC25614A3m(this, f));
                                                            } else {
                                                                o.LJIJI("progressBarBackground");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("progressBarBackground");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("progressBar");
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        o.LJIJI("videoLockIcon");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("videoCompletedOverlay");
                                throw null;
                            }
                        } else {
                            o.LJIJI("progressBarBackground");
                            throw null;
                        }
                    } else {
                        o.LJIJI("progressBar");
                        throw null;
                    }
                }
                C16880lQ.LJIIJ(new ACListenerS39S0200000_4(this, t, 26), this.itemView);
                return;
            }
            o.LJIJI("videoItemDuration");
            throw null;
        }
        o.LJIJI("videoItemTitle");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.ait, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return LLLLIILL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(A3U a3u, List payloads) {
        A3U t = a3u;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        onBindItemView(t);
    }
}
