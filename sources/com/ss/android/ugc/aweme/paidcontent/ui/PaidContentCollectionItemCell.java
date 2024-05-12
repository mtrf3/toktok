package com.ss.android.ugc.aweme.paidcontent.ui;

import X.C04270Et;
import X.C16880lQ;
import X.C184077Kh;
import X.C19N;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C249149qA;
import X.C254149yE;
import X.C254559yt;
import X.C254569yu;
import X.C254589yw;
import X.C62822Ol8;
import X.C63044Ooi;
import X.C65352Pkq;
import X.C78685UuP;
import X.C78926UyI;
import X.C81062Vre;
import X.HG3;
import X.ORZ;
import X.RBX;
import X.W5F;
import X.W5U;
import Y.ACListenerS39S0200000_4;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.paidcontent.ui.PaidContentCollectionItemCell;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentCollectionListAssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentCollectionItemCell extends PowerCell<C254559yt> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 614));
    public final C214378bB LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public C81062Vre LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public TuxTextView LJLL;
    public C63044Ooi LJLLI;

    public final PaidContentCollectionListAssemViewModel L() {
        return (PaidContentCollectionListAssemViewModel) this.LJLILLLLZI.getValue();
    }

    public PaidContentCollectionItemCell() {
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 615);
        this.LJLILLLLZI = new C214378bB(C65352Pkq.LIZ(PaidContentCollectionListAssemViewModel.class), aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C254589yw.INSTANCE, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.bhy);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.collection_item_title)");
        this.LJLJI = (TuxTextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.bhq);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…ion_item_purchase_status)");
        this.LJLJJI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.bho);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.collection_item_length)");
        this.LJLJJL = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.bhr);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.…llection_item_rating_bar)");
        this.LJLJJLL = (C81062Vre) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.bht);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…lection_item_rating_nums)");
        this.LJLJL = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.bhk);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…llection_item_coupon_tag)");
        this.LJLJLJ = (TuxTextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.bhl);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.…tag_overflow_alternative)");
        this.LJLJLLL = (TuxTextView) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.bhp);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.…tion_item_original_price)");
        this.LJLL = (TuxTextView) findViewById8;
        View findViewById9 = this.itemView.findViewById(R.id.bh6);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.…_anchor_selection_button)");
        this.LJLLI = (C63044Ooi) findViewById9;
    }

    public final void M(C254559yt c254559yt) {
        int i;
        int i2 = 0;
        if (c254559yt.LJLIL.getHasPurchasedCollection()) {
            TuxTextView tuxTextView = this.LJLJJI;
            if (tuxTextView != null) {
                tuxTextView.setText(this.itemView.getResources().getString(R.string.qni));
                Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.e9);
                if (LIZIZ != null) {
                    i2 = LIZIZ.intValue();
                }
                tuxTextView.setTextColor(i2);
                tuxTextView.setBackground(C04270Et.LIZIZ(this.itemView.getContext(), R.drawable.al8));
                tuxTextView.setTuxFont(62);
                return;
            }
            o.LJIJI("collectionItemPurchaseStatus");
            throw null;
        }
        if (C19N.LJ("paid_content_seller_voucher_enabled", false)) {
            TuxTextView tuxTextView2 = this.LJLJJI;
            if (tuxTextView2 != null) {
                String str = c254559yt.LJLJI;
                if (str.length() == 0) {
                    str = c254559yt.LJLILLLLZI;
                }
                tuxTextView2.setText(str);
                Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.go);
                if (LIZIZ2 != null) {
                    i = LIZIZ2.intValue();
                } else {
                    i = 0;
                }
                tuxTextView2.setTextColor(i);
                tuxTextView2.setBackgroundResource(0);
                tuxTextView2.setTuxFont(41);
                return;
            }
            o.LJIJI("collectionItemPurchaseStatus");
            throw null;
        }
        TuxTextView tuxTextView3 = this.LJLJJI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(c254559yt.LJLILLLLZI);
            Integer LIZIZ3 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.eb);
            if (LIZIZ3 != null) {
                i2 = LIZIZ3.intValue();
            }
            tuxTextView3.setTextColor(i2);
            tuxTextView3.setBackgroundResource(R.drawable.al_);
            tuxTextView3.setTuxFont(62);
            return;
        }
        o.LJIJI("collectionItemPurchaseStatus");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C254559yt c254559yt) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        List<String> urlList;
        C254559yt t = c254559yt;
        o.LJIIIZ(t, "t");
        CollectionDetailModel collectionDetailModel = t.LJLIL;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        User collectionCreator = collectionDetailModel.getCollectionCreator();
        if (collectionCreator != null) {
            str = collectionCreator.getUid();
        } else {
            str = null;
        }
        boolean equals = curUserId.equals(str);
        View findViewById = this.itemView.findViewById(R.id.bhn);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.collection_item_image)");
        SmartImageView smartImageView = (SmartImageView) findViewById;
        UrlModel collectionCover = collectionDetailModel.getCollectionCover();
        if (collectionCover == null || (urlList = collectionCover.getUrlList()) == null || (str2 = (String) ORZ.LJLLLLLL(0, urlList)) == null) {
            str2 = "";
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
        LJIIIIZZ.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LJIIIIZZ);
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(collectionDetailModel.getCollectionName());
            if (equals && !L().gv0().LJLJJLL) {
                TuxTextView tuxTextView2 = this.LJLJJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                    TuxTextView tuxTextView3 = this.LJLJLJ;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(8);
                        TuxTextView tuxTextView4 = this.LJLL;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setVisibility(8);
                        } else {
                            o.LJIJI("collectionItemOriginalPrice");
                            throw null;
                        }
                    } else {
                        o.LJIJI("collectionItemCouponTag");
                        throw null;
                    }
                } else {
                    o.LJIJI("collectionItemPurchaseStatus");
                    throw null;
                }
            } else {
                M(t);
                TuxTextView tuxTextView5 = this.LJLJJI;
                if (tuxTextView5 != null) {
                    N(t, tuxTextView5);
                } else {
                    o.LJIJI("collectionItemPurchaseStatus");
                    throw null;
                }
            }
            TuxTextView tuxTextView6 = this.LJLJJL;
            if (tuxTextView6 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gx);
                if (LIZIZ != null) {
                    i = LIZIZ.intValue();
                } else {
                    i = 0;
                }
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) this.itemView.getResources().getQuantityString(R.plurals.t2, collectionDetailModel.getCollectionVideoNum(), Integer.valueOf(collectionDetailModel.getCollectionVideoNum())));
                spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.dz);
                if (LIZIZ2 != null) {
                    i2 = LIZIZ2.intValue();
                } else {
                    i2 = 0;
                }
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i2);
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) " | ");
                spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
                Integer LIZIZ3 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gx);
                if (LIZIZ3 != null) {
                    i3 = LIZIZ3.intValue();
                } else {
                    i3 = 0;
                }
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(i3);
                int length3 = spannableStringBuilder.length();
                long collectionTotalDuration = collectionDetailModel.getCollectionTotalDuration();
                Resources resources = this.itemView.getResources();
                o.LJIIIIZZ(resources, "itemView.resources");
                spannableStringBuilder.append((CharSequence) C249149qA.LIZ(collectionTotalDuration, resources));
                spannableStringBuilder.setSpan(foregroundColorSpan3, length3, spannableStringBuilder.length(), 17);
                tuxTextView6.setText(spannableStringBuilder);
                C81062Vre c81062Vre = this.LJLJJLL;
                if (c81062Vre != null) {
                    c81062Vre.setStar(collectionDetailModel.getCollectionRating());
                    C81062Vre c81062Vre2 = this.LJLJJLL;
                    if (c81062Vre2 != null) {
                        c81062Vre2.setClickable(false);
                        TuxTextView tuxTextView7 = this.LJLJL;
                        if (tuxTextView7 != null) {
                            tuxTextView7.setText(String.valueOf(collectionDetailModel.getCollectionRatingNum()));
                            C16880lQ.LJIIJ(new ACListenerS39S0200000_4(this, t, 41), this.itemView);
                            return;
                        } else {
                            o.LJIJI("collectionRatingNumbers");
                            throw null;
                        }
                    }
                    o.LJIJI("collectionRatingBar");
                    throw null;
                }
                o.LJIJI("collectionRatingBar");
                throw null;
            }
            o.LJIJI("collectionItemDurationStatus");
            throw null;
        }
        o.LJIJI("collectionItemTitle");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.air, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return LLLLIILL;
    }

    public final void N(C254559yt c254559yt, final TuxTextView tuxTextView) {
        final CollectionDetailModel collectionDetailModel = c254559yt.LJLIL;
        TuxTextView tuxTextView2 = this.LJLJJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setVisibility(0);
            if (collectionDetailModel.getHasPurchasedCollection() || !C19N.LJ("paid_content_seller_voucher_enabled", false) || c254559yt.LJLJJL) {
                TuxTextView tuxTextView3 = this.LJLJLJ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setVisibility(8);
                    TuxTextView tuxTextView4 = this.LJLL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setVisibility(8);
                        TuxTextView tuxTextView5 = this.LJLJLLL;
                        if (tuxTextView5 != null) {
                            tuxTextView5.setVisibility(8);
                            return;
                        } else {
                            o.LJIJI("collectionItemCouponTagOverflowAlternative");
                            throw null;
                        }
                    }
                    o.LJIJI("collectionItemOriginalPrice");
                    throw null;
                }
                o.LJIJI("collectionItemCouponTag");
                throw null;
            }
            if (C78685UuP.LJJJZ(collectionDetailModel.getVoucherTag())) {
                TuxTextView tuxTextView6 = this.LJLJLJ;
                if (tuxTextView6 != null) {
                    tuxTextView6.setVisibility(4);
                    tuxTextView6.setText(collectionDetailModel.getVoucherTag());
                    if (this.itemView.getViewTreeObserver().isAlive()) {
                        this.itemView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.9yx
                            @Override // android.view.ViewTreeObserver.OnPreDrawListener
                            public final boolean onPreDraw() {
                                PaidContentCollectionItemCell.this.itemView.getViewTreeObserver().removeOnPreDrawListener(this);
                                int width = tuxTextView.getWidth();
                                TuxTextView tuxTextView7 = PaidContentCollectionItemCell.this.LJLJLJ;
                                if (tuxTextView7 != null) {
                                    if (tuxTextView7.getWidth() + width > PaidContentCollectionItemCell.this.itemView.getWidth()) {
                                        TuxTextView tuxTextView8 = PaidContentCollectionItemCell.this.LJLJLJ;
                                        if (tuxTextView8 != null) {
                                            tuxTextView8.setVisibility(8);
                                            TuxTextView tuxTextView9 = PaidContentCollectionItemCell.this.LJLJLLL;
                                            if (tuxTextView9 != null) {
                                                tuxTextView9.setText(collectionDetailModel.getVoucherTag());
                                                tuxTextView9.setVisibility(0);
                                                return true;
                                            }
                                            o.LJIJI("collectionItemCouponTagOverflowAlternative");
                                            throw null;
                                        }
                                        o.LJIJI("collectionItemCouponTag");
                                        throw null;
                                    }
                                    TuxTextView tuxTextView10 = PaidContentCollectionItemCell.this.LJLJLJ;
                                    if (tuxTextView10 != null) {
                                        tuxTextView10.setVisibility(0);
                                        TuxTextView tuxTextView11 = PaidContentCollectionItemCell.this.LJLJLLL;
                                        if (tuxTextView11 != null) {
                                            tuxTextView11.setVisibility(8);
                                            return true;
                                        }
                                        o.LJIJI("collectionItemCouponTagOverflowAlternative");
                                        throw null;
                                    }
                                    o.LJIJI("collectionItemCouponTag");
                                    throw null;
                                }
                                o.LJIJI("collectionItemCouponTag");
                                throw null;
                            }
                        });
                    }
                } else {
                    o.LJIJI("collectionItemCouponTag");
                    throw null;
                }
            } else {
                TuxTextView tuxTextView7 = this.LJLJLJ;
                if (tuxTextView7 != null) {
                    tuxTextView7.setVisibility(8);
                    TuxTextView tuxTextView8 = this.LJLJLLL;
                    if (tuxTextView8 != null) {
                        tuxTextView8.setVisibility(8);
                    } else {
                        o.LJIJI("collectionItemCouponTagOverflowAlternative");
                        throw null;
                    }
                } else {
                    o.LJIJI("collectionItemCouponTag");
                    throw null;
                }
            }
            if (c254559yt.LJLJI.length() > 0) {
                TuxTextView tuxTextView9 = this.LJLL;
                if (tuxTextView9 != null) {
                    tuxTextView9.setVisibility(0);
                    tuxTextView9.setPaintFlags(tuxTextView9.getPaintFlags() | 16);
                    tuxTextView9.setText(c254559yt.LJLILLLLZI);
                    return;
                }
                o.LJIJI("collectionItemOriginalPrice");
                throw null;
            }
            TuxTextView tuxTextView10 = this.LJLL;
            if (tuxTextView10 != null) {
                tuxTextView10.setVisibility(8);
                return;
            } else {
                o.LJIJI("collectionItemOriginalPrice");
                throw null;
            }
        }
        o.LJIJI("collectionItemPurchaseStatus");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C254559yt c254559yt, List payloads) {
        String str;
        List<C254559yt> list;
        C254559yt t = c254559yt;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        if ((!payloads.isEmpty()) && (ListProtector.get(payloads, 0) instanceof C254569yu)) {
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            User collectionCreator = t.LJLIL.getCollectionCreator();
            if (collectionCreator != null) {
                str = collectionCreator.getUid();
            } else {
                str = null;
            }
            if (curUserId.equals(str) && !L().gv0().LJLJJLL) {
                TuxTextView tuxTextView = this.LJLJJI;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                    TuxTextView tuxTextView2 = this.LJLJLJ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setVisibility(8);
                        TuxTextView tuxTextView3 = this.LJLL;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setVisibility(8);
                            return;
                        } else {
                            o.LJIJI("collectionItemOriginalPrice");
                            throw null;
                        }
                    }
                    o.LJIJI("collectionItemCouponTag");
                    throw null;
                }
                o.LJIJI("collectionItemPurchaseStatus");
                throw null;
            }
            M(t);
            TuxTextView tuxTextView4 = this.LJLJJI;
            if (tuxTextView4 != null) {
                N(t, tuxTextView4);
                if (!L().gv0().LJLJJLL) {
                    return;
                }
                C63044Ooi c63044Ooi = this.LJLLI;
                if (c63044Ooi != null) {
                    c63044Ooi.setVisibility(0);
                    C63044Ooi c63044Ooi2 = this.LJLLI;
                    if (c63044Ooi2 != null) {
                        c63044Ooi2.setChecked(t.LJLJJLL);
                        if (!C19N.LJ("creator_m10n_android_paid_content_anchor_awareness_enabled", false) || (list = ((C254149yE) L().getState()).LJLILLLLZI.LJLJJI) == null || list.size() != 1) {
                            return;
                        }
                        C63044Ooi c63044Ooi3 = this.LJLLI;
                        if (c63044Ooi3 != null) {
                            c63044Ooi3.setChecked(true);
                            L().hv0(t, getPosition());
                            return;
                        } else {
                            o.LJIJI("collectionSelectionIcon");
                            throw null;
                        }
                    }
                    o.LJIJI("collectionSelectionIcon");
                    throw null;
                }
                o.LJIJI("collectionSelectionIcon");
                throw null;
            }
            o.LJIJI("collectionItemPurchaseStatus");
            throw null;
        }
        super.onBindItemView(t, payloads);
    }
}
