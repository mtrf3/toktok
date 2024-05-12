package com.ss.android.ugc.aweme.poi.reviews;

import X.C06460Ne;
import X.C06530Nl;
import X.C110614Vt;
import X.C16880lQ;
import X.C186817Uv;
import X.C1DI;
import X.C207718Df;
import X.C208288Fk;
import X.C245319jz;
import X.C252669vq;
import X.C26227ARb;
import X.C2K0;
import X.C32151Nz;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55230Lly;
import X.C71799SFv;
import X.C76800UCe;
import X.C77119UOl;
import X.C78897Uxp;
import X.C79234V7u;
import X.C7MY;
import X.C8W0;
import X.HG3;
import X.InterfaceC199107re;
import X.InterfaceC88472Yns;
import X.O6R;
import X.RBX;
import X.UC0;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS23S0100000_3;
import Y.IDCListenerS296S0100000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiReviewListItemCell extends PowerCell<PoiReviewsApi.PoiReviewModel> {
    public InterfaceC199107re LJLIL;
    public C186817Uv LJLILLLLZI;
    public C71799SFv LJLJI;
    public TuxTextView LJLJJI;
    public C207718Df LJLJJL;
    public C208288Fk LJLJJLL;
    public ViewGroup LJLJL;
    public SmartImageView LJLJLJ;
    public SmartImageView LJLJLLL;
    public SmartImageView LJLL;
    public View LJLLI;
    public TuxTextView LJLLILLLL;
    public TuxTextView LJLLJ;
    public View LJLLL;
    public TuxTextView LJLLLL;
    public TuxIconView LJLLLLLL;
    public TuxIconView LJLZ;
    public int LJZ;
    public final ACListenerS23S0100000_3 LJZI = new ACListenerS23S0100000_3(this, 124);

    /* loaded from: classes4.dex */
    public interface PoiReviewCellVAbility extends C2K0 {
        InterfaceC199107re Um();

        C186817Uv di0();
    }

    public final int L() {
        InterfaceC199107re interfaceC199107re = this.LJLIL;
        boolean z = false;
        if (interfaceC199107re != null && interfaceC199107re.ly()) {
            z = true;
        }
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (z) {
            return bindingAdapterPosition;
        }
        return bindingAdapterPosition + 1;
    }

    public final ArrayList<PoiGalleryAnchorData> N() {
        ArrayList<PoiGalleryAnchorData> arrayList = new ArrayList<>();
        int[] iArr = new int[2];
        SmartImageView smartImageView = this.LJLJLJ;
        if (smartImageView != null) {
            if (smartImageView.getVisibility() == 0) {
                SmartImageView smartImageView2 = this.LJLJLJ;
                if (smartImageView2 != null) {
                    smartImageView2.getLocationOnScreen(iArr);
                    SmartImageView smartImageView3 = this.LJLJLJ;
                    if (smartImageView3 != null) {
                        int width = smartImageView3.getWidth();
                        SmartImageView smartImageView4 = this.LJLJLJ;
                        if (smartImageView4 != null) {
                            arrayList.add(new PoiGalleryAnchorData(width, smartImageView4.getHeight(), iArr[0], iArr[1]));
                        } else {
                            o.LJIJI("siv0");
                            throw null;
                        }
                    } else {
                        o.LJIJI("siv0");
                        throw null;
                    }
                } else {
                    o.LJIJI("siv0");
                    throw null;
                }
            }
            SmartImageView smartImageView5 = this.LJLJLLL;
            if (smartImageView5 != null) {
                if (smartImageView5.getVisibility() == 0) {
                    SmartImageView smartImageView6 = this.LJLJLLL;
                    if (smartImageView6 != null) {
                        smartImageView6.getLocationOnScreen(iArr);
                        SmartImageView smartImageView7 = this.LJLJLLL;
                        if (smartImageView7 != null) {
                            int width2 = smartImageView7.getWidth();
                            SmartImageView smartImageView8 = this.LJLJLLL;
                            if (smartImageView8 != null) {
                                arrayList.add(new PoiGalleryAnchorData(width2, smartImageView8.getHeight(), iArr[0], iArr[1]));
                            } else {
                                o.LJIJI("siv1");
                                throw null;
                            }
                        } else {
                            o.LJIJI("siv1");
                            throw null;
                        }
                    } else {
                        o.LJIJI("siv1");
                        throw null;
                    }
                }
                SmartImageView smartImageView9 = this.LJLL;
                if (smartImageView9 != null) {
                    if (smartImageView9.getVisibility() == 0) {
                        SmartImageView smartImageView10 = this.LJLL;
                        if (smartImageView10 != null) {
                            smartImageView10.getLocationOnScreen(iArr);
                            SmartImageView smartImageView11 = this.LJLL;
                            if (smartImageView11 != null) {
                                int width3 = smartImageView11.getWidth();
                                SmartImageView smartImageView12 = this.LJLL;
                                if (smartImageView12 != null) {
                                    arrayList.add(new PoiGalleryAnchorData(width3, smartImageView12.getHeight(), iArr[0], iArr[1]));
                                } else {
                                    o.LJIJI("siv2");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("siv2");
                                throw null;
                            }
                        } else {
                            o.LJIJI("siv2");
                            throw null;
                        }
                    }
                    return arrayList;
                }
                o.LJIJI("siv2");
                throw null;
            }
            o.LJIJI("siv1");
            throw null;
        }
        o.LJIJI("siv0");
        throw null;
    }

    public final void Q() {
        FragmentManager fragmentManager;
        PoiReviewsApi.PoiReviewModel item;
        String str;
        C252669vq LIZIZ;
        C252669vq LIZIZ2;
        Fragment LJIIIZ = C79234V7u.LJIIIZ(this.itemView);
        if (LJIIIZ == null || (fragmentManager = LJIIIZ.getFragmentManager()) == null || (item = getItem()) == null) {
            return;
        }
        C245319jz c245319jz = new C245319jz();
        PoiReviewsApi.PoiReviewUserModel poiReviewUserModel = item.author;
        if (poiReviewUserModel != null) {
            str = poiReviewUserModel.userId;
        } else {
            str = null;
        }
        if (o.LJ(str, ((RBX) HG3.LJIILL()).getCurUserId())) {
            C252669vq[] c252669vqArr = new C252669vq[2];
            if (!item.LJLILLLLZI) {
                LIZIZ2 = C06530Nl.LIZIZ(R.string.sjo);
                LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS134S0200000_3(this, item, 132), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            } else {
                LIZIZ2 = C06530Nl.LIZIZ(R.string.qfr);
                LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS134S0200000_3(this, item, 133), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            }
            c252669vqArr[0] = LIZIZ2;
            C252669vq LIZIZ3 = C06530Nl.LIZIZ(R.string.dw4);
            LIZIZ3.LJ = new ACListenerS21S0100000_1(new AqS134S0200000_3(this, item, 134), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            c252669vqArr[1] = LIZIZ3;
            List LJJIJIL = C47261Igj.LJJIJIL(c252669vqArr);
            C186817Uv c186817Uv = this.LJLILLLLZI;
            if (c186817Uv != null && c186817Uv.LIZ) {
                C252669vq LIZIZ4 = C06530Nl.LIZIZ(R.string.efd);
                LIZIZ4.LIZJ = 1;
                LIZIZ4.LJ = new ACListenerS21S0100000_1(new AqS169S0100000_3(this, 395), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                LJJIJIL.add(LIZIZ4);
            }
            c245319jz.LJFF(LJJIJIL);
        } else {
            C252669vq[] c252669vqArr2 = new C252669vq[2];
            if (!item.LJLILLLLZI) {
                LIZIZ = C06530Nl.LIZIZ(R.string.sjo);
                LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS134S0200000_3(this, item, 129), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            } else {
                LIZIZ = C06530Nl.LIZIZ(R.string.qfr);
                LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS134S0200000_3(this, item, 130), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            }
            c252669vqArr2[0] = LIZIZ;
            C252669vq LIZIZ5 = C06530Nl.LIZIZ(R.string.ho5);
            LIZIZ5.LJ = new ACListenerS21S0100000_1(new AqS134S0200000_3(this, item, 131), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            c252669vqArr2[1] = LIZIZ5;
            c245319jz.LIZIZ(c252669vqArr2);
        }
        c245319jz.LIZLLL(R.string.cg_);
        c245319jz.LIZJ().show(fragmentManager, "PoiReviewMenuPanel");
    }

    public final void T() {
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LIZIZ(this.itemView.getContext().getResources().getString(R.string.p3o));
        UC0.LIZJ(c26227ARb, new AqS169S0100000_3(this, 396));
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        PoiReviewCellVAbility poiReviewCellVAbility;
        super.onItemViewCreated();
        Fragment M = M(getParent());
        if (M != null && (poiReviewCellVAbility = (PoiReviewCellVAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(M, null), PoiReviewCellVAbility.class, null)) != null) {
            this.LJLIL = poiReviewCellVAbility.Um();
            this.LJLILLLLZI = poiReviewCellVAbility.di0();
        }
        View findViewById = this.itemView.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.avatar)");
        this.LJLJI = (C71799SFv) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.name)");
        this.LJLJJI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.in_);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById<Tu…ingBar?>(R.id.rating_bar)");
        this.LJLJJL = (C207718Df) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.text);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.text)");
        this.LJLJJLL = (C208288Fk) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.egy);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.image_container)");
        this.LJLJL = (ViewGroup) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.c3l);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.date)");
        this.LJLLJ = (TuxTextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.avs);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.btn_delete)");
        this.LJLLL = findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.fr4);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.like_count)");
        this.LJLLLL = (TuxTextView) findViewById8;
        View findViewById9 = this.itemView.findViewById(R.id.fr9);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.like_icon)");
        this.LJLLLLLL = (TuxIconView) findViewById9;
        View findViewById10 = this.itemView.findViewById(R.id.cbo);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.dislike_icon)");
        this.LJLZ = (TuxIconView) findViewById10;
        View view = this.LJLLL;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 128), view);
            View view2 = this.LJLLL;
            if (view2 != null) {
                C78897Uxp.LJJJJLI(view2, null);
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C78897Uxp.LJJJJJL(itemView, 0.0f);
                C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 129), this.itemView.findViewById(R.id.fr2));
                C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 130), this.itemView.findViewById(R.id.cbp));
                this.LJZ = O6R.LJJIIZ(((C77119UOl.LJIILJJIL(getContext()) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) * 2)) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)) * 2)) / 3.0f);
                ViewGroup viewGroup = this.LJLJL;
                if (viewGroup != null) {
                    View findViewById11 = viewGroup.findViewById(R.id.j0v);
                    int i = this.LJZ;
                    findViewById11.setLayoutParams(new LinearLayout.LayoutParams(i, i));
                    o.LJIIIIZZ(findViewById11, "vpImageContainer.findVie…ize, imageSize)\n        }");
                    this.LJLJLJ = (SmartImageView) findViewById11;
                    ViewGroup viewGroup2 = this.LJLJL;
                    if (viewGroup2 != null) {
                        View findViewById12 = viewGroup2.findViewById(R.id.j0w);
                        int i2 = this.LJZ;
                        findViewById12.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
                        o.LJIIIIZZ(findViewById12, "vpImageContainer.findVie…ize, imageSize)\n        }");
                        this.LJLJLLL = (SmartImageView) findViewById12;
                        ViewGroup viewGroup3 = this.LJLJL;
                        if (viewGroup3 != null) {
                            View findViewById13 = viewGroup3.findViewById(R.id.j0x);
                            int i3 = this.LJZ;
                            findViewById13.setLayoutParams(new LinearLayout.LayoutParams(i3, i3));
                            o.LJIIIIZZ(findViewById13, "vpImageContainer.findVie…ize, imageSize)\n        }");
                            this.LJLL = (SmartImageView) findViewById13;
                            SmartImageView smartImageView = this.LJLJLJ;
                            if (smartImageView != null) {
                                C16880lQ.LJJIJLIJ(smartImageView, this.LJZI);
                                SmartImageView smartImageView2 = this.LJLJLLL;
                                if (smartImageView2 != null) {
                                    C16880lQ.LJJIJLIJ(smartImageView2, this.LJZI);
                                    SmartImageView smartImageView3 = this.LJLL;
                                    if (smartImageView3 != null) {
                                        C16880lQ.LJJIJLIJ(smartImageView3, this.LJZI);
                                        SmartImageView smartImageView4 = this.LJLJLJ;
                                        if (smartImageView4 != null) {
                                            smartImageView4.setOnLongClickListener(new IDCListenerS296S0100000_3(this, 3));
                                            SmartImageView smartImageView5 = this.LJLJLLL;
                                            if (smartImageView5 != null) {
                                                smartImageView5.setOnLongClickListener(new IDCListenerS296S0100000_3(this, 4));
                                                SmartImageView smartImageView6 = this.LJLL;
                                                if (smartImageView6 != null) {
                                                    smartImageView6.setOnLongClickListener(new IDCListenerS296S0100000_3(this, 2));
                                                    View findViewById14 = this.itemView.findViewById(R.id.gmy);
                                                    o.LJIIIIZZ(findViewById14, "itemView.findViewById(R.…_picture_count_container)");
                                                    this.LJLLI = findViewById14;
                                                    View findViewById15 = this.itemView.findViewById(R.id.gmx);
                                                    o.LJIIIIZZ(findViewById15, "itemView.findViewById(R.id.more_picture_count)");
                                                    this.LJLLILLLL = (TuxTextView) findViewById15;
                                                    C110614Vt c110614Vt = new C110614Vt();
                                                    c110614Vt.LIZIZ = Integer.valueOf(R.attr.d6);
                                                    c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(2));
                                                    Drawable LIZ = C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt);
                                                    View view3 = this.LJLLI;
                                                    if (view3 != null) {
                                                        view3.setBackground(LIZ);
                                                        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 125), view3);
                                                        C71799SFv c71799SFv = this.LJLJI;
                                                        if (c71799SFv != null) {
                                                            C78897Uxp.LJJJJJL(c71799SFv, C7MY.LIZIZ(40));
                                                            C71799SFv c71799SFv2 = this.LJLJI;
                                                            if (c71799SFv2 != null) {
                                                                C16880lQ.LJJIL(c71799SFv2, new ACListenerS23S0100000_3(this, 126));
                                                                TuxTextView tuxTextView = this.LJLJJI;
                                                                if (tuxTextView != null) {
                                                                    C78897Uxp.LJJJJLI(tuxTextView, null);
                                                                    TuxTextView tuxTextView2 = this.LJLJJI;
                                                                    if (tuxTextView2 != null) {
                                                                        C16880lQ.LJJJJI(tuxTextView2, new ACListenerS23S0100000_3(this, 127));
                                                                        return;
                                                                    } else {
                                                                        o.LJIJI("tvName");
                                                                        throw null;
                                                                    }
                                                                }
                                                                o.LJIJI("tvName");
                                                                throw null;
                                                            }
                                                            o.LJIJI("avatarView");
                                                            throw null;
                                                        }
                                                        o.LJIJI("avatarView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("vMorePictureContainer");
                                                    throw null;
                                                }
                                                o.LJIJI("siv2");
                                                throw null;
                                            }
                                            o.LJIJI("siv1");
                                            throw null;
                                        }
                                        o.LJIJI("siv0");
                                        throw null;
                                    }
                                    o.LJIJI("siv2");
                                    throw null;
                                }
                                o.LJIJI("siv1");
                                throw null;
                            }
                            o.LJIJI("siv0");
                            throw null;
                        }
                        o.LJIJI("vpImageContainer");
                        throw null;
                    }
                    o.LJIJI("vpImageContainer");
                    throw null;
                }
                o.LJIJI("vpImageContainer");
                throw null;
            }
            o.LJIJI("vDelete");
            throw null;
        }
        o.LJIJI("vDelete");
        throw null;
    }

    public static Fragment M(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof BaseFragment) {
            return (Fragment) lifecycleOwner;
        }
        if (lifecycleOwner instanceof UIAssem) {
            return M(((C8W0) lifecycleOwner).getParent());
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.c09, viewGroup, false, "from(parent.context).inf…view_cell, parent, false)");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0429  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi.PoiReviewModel r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell.onBindItemView(X.Mm4, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        if (r3 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        if (r3 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            r6 = this;
            if (r9 == 0) goto L8
            int r0 = r9.length()
            if (r0 != 0) goto L9
        L8:
            return
        L9:
            java.lang.String r1 = "aweme://user/profile"
            java.lang.String r0 = "uid"
            X.C59895Nf1.LIZLLL(r7, r1, r0, r9)
            X.7re r0 = r6.LJLIL
            r5 = 0
            if (r0 == 0) goto L72
            java.lang.String r1 = r0.LJJLIIIJJI()
        L19:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            if (r1 == 0) goto L25
            java.lang.String r0 = "enter_from"
            r4.put(r0, r1)
        L25:
            java.lang.String r0 = "enter_method"
            r4.put(r0, r8)
            if (r9 == 0) goto L31
            java.lang.String r0 = "to_user_id"
            r4.put(r0, r9)
        L31:
            if (r10 == 0) goto L38
            java.lang.String r0 = "review_id"
            r4.put(r0, r10)
        L38:
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L44
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L47
        L44:
            r1 = r2
            if (r3 == 0) goto L4f
        L47:
            boolean r0 = r3.isConnected()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L4f:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r4.put(r1, r0)
            if (r3 == 0) goto L5e
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L61
        L5e:
            r1 = r2
            if (r3 == 0) goto L67
        L61:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto L70
        L67:
            r4.put(r1, r2)
            java.lang.String r0 = "enter_personal_detail"
            X.FMX.LJIIL(r0, r4)
            return
        L70:
            r2 = r0
            goto L67
        L72:
            r1 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell.P(android.content.Context, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
