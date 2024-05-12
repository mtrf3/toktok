package com.bytedance.android.live.rank.impl.list.fragment.page;

import X.AbstractC78035Ujv;
import X.ActivityC45651qj;
import X.C018905p;
import X.C03880Dg;
import X.C06C;
import X.C06F;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15650jR;
import X.C16880lQ;
import X.C1K5;
import X.C259910h;
import X.C29306Beo;
import X.C29S;
import X.C31415CUp;
import X.C31512CYi;
import X.C31522CYs;
import X.C31526CYw;
import X.C31560Ca4;
import X.C3C5;
import X.C41081jM;
import X.C41541k6;
import X.C47121t6;
import X.C51029K0z;
import X.C61845OOz;
import X.C65300Pk0;
import X.C76800UCe;
import X.C77872UhI;
import X.C77945UiT;
import X.C77948UiW;
import X.C77949UiX;
import X.C77953Uib;
import X.C77964Uim;
import X.C77979Uj1;
import X.C77987Uj9;
import X.C77994UjG;
import X.C78003UjP;
import X.C78020Ujg;
import X.C78021Ujh;
import X.C78046Uk6;
import X.C78720Uuy;
import X.C78934UyQ;
import X.C80217Ve1;
import X.C80218Ve2;
import X.C80221Ve5;
import X.C80955Vpv;
import X.C90903hW;
import X.EnumC31514CYk;
import X.InterfaceC65784Pro;
import X.InterfaceC77939UiN;
import X.InterfaceC77978Uj0;
import X.LB6;
import X.OA0;
import X.X1D;
import Y.IDCSpanS5S0200000_13;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.fragment.behavior.RankBottomBehavior;
import com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RankPageFragment extends BaseFragment implements InterfaceC77978Uj0 {
    public static final /* synthetic */ int LLFF = 0;
    public RankPageController LJLILLLLZI;
    public RankRootController LJLJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJI;
    public C77872UhI LJLJJL;
    public C80217Ve1 LJLJJLL;
    public C80221Ve5 LJLJL;
    public OA0 LJLJLJ;
    public C80955Vpv LJLJLLL;
    public ConstraintLayout LJLL;
    public LB6 LJLLI;
    public boolean LJLLILLLL;
    public long LJLLL;
    public IDCSpanS5S0200000_13 LJLLLL;
    public boolean LJLLLLLL;
    public C78046Uk6 LJLZ;
    public boolean LJZ;
    public C31415CUp LL;
    public boolean LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();
    public RankTypeV2 LJLIL = RankTypeV2.LJIILL;
    public boolean LJLLJ = true;
    public final C77964Uim LJZI = new C77964Uim(this);
    public final C77948UiW LJZL = new C77948UiW(this);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLF;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void Dl() {
        ViewGroup.LayoutParams layoutParams;
        ConstraintLayout constraintLayout = this.LJLL;
        if (constraintLayout != null) {
            layoutParams = constraintLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = -2;
        C41541k6 tv_countdown_text = (C41541k6) _$_findCachedViewById(R.id.m3o);
        o.LJIIIIZZ(tv_countdown_text, "tv_countdown_text");
        ViewGroup.LayoutParams layoutParams2 = tv_countdown_text.getLayoutParams();
        if (layoutParams2 != null) {
            C018905p c018905p = (C018905p) layoutParams2;
            c018905p.bottomToBottom = -1;
            c018905p.bottomToTop = _$_findCachedViewById(R.id.m3d).getId();
            tv_countdown_text.setLayoutParams(c018905p);
            C41541k6 tv_countdown = (C41541k6) _$_findCachedViewById(R.id.m3d);
            o.LJIIIIZZ(tv_countdown, "tv_countdown");
            ViewGroup.LayoutParams layoutParams3 = tv_countdown.getLayoutParams();
            if (layoutParams3 != null) {
                C018905p c018905p2 = (C018905p) layoutParams3;
                c018905p2.startToStart = 0;
                c018905p2.topToTop = -1;
                c018905p2.topToBottom = _$_findCachedViewById(R.id.m3o).getId();
                c018905p2.setMarginStart(C15380j0.LIZ(16.0f));
                tv_countdown.setLayoutParams(c018905p2);
                C1K5 rank_help = (C1K5) _$_findCachedViewById(R.id.imo);
                o.LJIIIIZZ(rank_help, "rank_help");
                ViewGroup.LayoutParams layoutParams4 = rank_help.getLayoutParams();
                if (layoutParams4 != null) {
                    C018905p c018905p3 = (C018905p) layoutParams4;
                    c018905p3.topToTop = -1;
                    c018905p3.topToBottom = _$_findCachedViewById(R.id.m3o).getId();
                    rank_help.setLayoutParams(c018905p3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    @Override // X.InterfaceC77978Uj0
    public final void F9() {
        RankPageController rankPageController = this.LJLILLLLZI;
        C77987Uj9 c77987Uj9 = null;
        if (rankPageController != null) {
            RankPageViewModel LJIIJ = rankPageController.LJIIJ();
            RankPageController rankPageController2 = this.LJLILLLLZI;
            if (rankPageController2 != null) {
                RankTypeV2 rankTypeV2 = rankPageController2.LJIIJ().LJLLL;
                RankPageController rankPageController3 = this.LJLILLLLZI;
                if (rankPageController3 != null) {
                    long j = rankPageController3.LJIIIZ().LIZIZ;
                    RankPageController rankPageController4 = this.LJLILLLLZI;
                    if (rankPageController4 != null) {
                        long j2 = rankPageController4.LJIIIZ().LIZ;
                        RankPageController rankPageController5 = this.LJLILLLLZI;
                        if (rankPageController5 != null) {
                            EnumC31514CYk enumC31514CYk = rankPageController5.LIZ().LJLJJI;
                            RankPageController rankPageController6 = this.LJLILLLLZI;
                            if (rankPageController6 != null) {
                                int i = rankPageController6.LIZ().LJLJJL.type;
                                RankPageController rankPageController7 = this.LJLILLLLZI;
                                if (rankPageController7 != null) {
                                    int i2 = rankPageController7.LIZ().LJLJJL.rankPhase;
                                    RankPageController rankPageController8 = this.LJLILLLLZI;
                                    if (rankPageController8 != null) {
                                        C77979Uj1 c77979Uj1 = new C77979Uj1(enumC31514CYk, i, i2, rankPageController8.LIZ().LJLIL);
                                        C77949UiX c77949UiX = new C77949UiX(this);
                                        RankRootController rankRootController = this.LJLJI;
                                        if (rankRootController != null) {
                                            InterfaceC77939UiN interfaceC77939UiN = rankRootController.LJLJJI;
                                            if (interfaceC77939UiN != null) {
                                                c77987Uj9 = interfaceC77939UiN.p6();
                                            }
                                            LJIIJ.jv0(rankTypeV2, this, j, j2, true, false, c77979Uj1, c77949UiX, c77987Uj9);
                                            return;
                                        }
                                        o.LJIJI("parentController");
                                        throw null;
                                    }
                                    o.LJIJI("controller");
                                    throw null;
                                }
                                o.LJIJI("controller");
                                throw null;
                            }
                            o.LJIJI("controller");
                            throw null;
                        }
                        o.LJIJI("controller");
                        throw null;
                    }
                    o.LJIJI("controller");
                    throw null;
                }
                o.LJIJI("controller");
                throw null;
            }
            o.LJIJI("controller");
            throw null;
        }
        o.LJIJI("controller");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cf, code lost:
    
        if (r4 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gl() {
        /*
            r14 = this;
            boolean r0 = r14.LJLLLLLL
            if (r0 == 0) goto L5
            return
        L5:
            Y.IDCSpanS5S0200000_13 r5 = r14.LJLLLL
            if (r5 == 0) goto Lce
            r0 = 1
            r14.LJLLLLLL = r0
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r3 = 2131378986(0x7f0a432a, float:1.837822E38)
            android.view.View r0 = r14._$_findCachedViewById(r3)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.CharSequence r0 = r0.getText()
            r2.<init>(r0)
            android.content.Context r0 = r14.getContext()
            r6 = 0
            if (r0 == 0) goto Ld2
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto Ld2
            r0 = 2131235566(0x7f0812ee, float:1.808733E38)
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
        L32:
            boolean r0 = X.C15380j0.LJIIZILJ()
            r8 = 0
            if (r0 == 0) goto Lcf
            com.bytedance.android.livesdk.livesetting.rank.RankListFlipImageSetting r0 = com.bytedance.android.livesdk.livesetting.rank.RankListFlipImageSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto Lcf
            if (r4 == 0) goto L96
            r0 = 7
            android.graphics.Bitmap r7 = X.C1DH.LJJJ(r4, r8, r8, r0)
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>()
            int r0 = r7.getWidth()
            float r6 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r1
            int r0 = r7.getHeight()
            float r4 = (float) r0
            float r4 = r4 / r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.postScale(r1, r0, r6, r4)
            int r10 = r7.getWidth()
            int r11 = r7.getHeight()
            r13 = 1
            r9 = r8
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = "createBitmap(this,  0, 0…th, height, matrix, true)"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            android.content.res.Resources r1 = r14.getResources()
            java.lang.String r0 = "resources"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            r4.<init>(r1, r6)
        L83:
            r0 = 1097513042(0x416ab852, float:14.67)
            int r1 = X.C15380j0.LIZ(r0)
            int r0 = X.C15380j0.LIZ(r0)
            r4.setBounds(r8, r8, r1, r0)
            X.CkV r6 = new X.CkV
            r6.<init>(r4)
        L96:
            android.text.SpannableString r4 = new android.text.SpannableString
            java.lang.String r0 = "{0:icon}"
            r4.<init>(r0)
            r1 = 8
            r0 = 18
            r4.setSpan(r6, r8, r1, r0)
            r4.setSpan(r5, r8, r1, r0)
            java.lang.String r0 = " "
            r2.append(r0)
            r2.append(r4)
            android.view.View r1 = r14._$_findCachedViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
            android.view.View r0 = r14._$_findCachedViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setHighlightColor(r8)
            android.view.View r0 = r14._$_findCachedViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
        Lce:
            return
        Lcf:
            if (r4 == 0) goto L96
            goto L83
        Ld2:
            r4 = r6
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment.Gl():void");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C78046Uk6 c78046Uk6 = this.LJLZ;
        if (c78046Uk6 != null) {
            c78046Uk6.LJLLJ = false;
        }
        OA0 oa0 = this.LJLJLJ;
        if (oa0 != null) {
            oa0.LIZIZ();
        }
        super.onDestroyView();
        ((LinkedHashMap) this.LLF).clear();
    }

    public final void vl() {
        if (this.LJZ) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.imo);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.getGlobalVisibleRect(rect);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.ffr);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.getGlobalVisibleRect(rect2);
        }
        View last_icon = _$_findCachedViewById(R.id.ffr);
        o.LJIIIIZZ(last_icon, "last_icon");
        if (last_icon.getVisibility() == 0) {
            View tv_countdown_text = _$_findCachedViewById(R.id.m3o);
            o.LJIIIIZZ(tv_countdown_text, "tv_countdown_text");
            if (tv_countdown_text.getVisibility() == 0) {
                if (C15380j0.LJIIZILJ()) {
                    if (rect.left < rect2.right) {
                        Dl();
                        this.LJZ = true;
                    }
                } else if (rect2.left < rect.right) {
                    Dl();
                    this.LJZ = true;
                }
                C80955Vpv c80955Vpv = this.LJLJLLL;
                if (c80955Vpv != null) {
                    c80955Vpv.setEnableSizeChange(true);
                }
                C80955Vpv c80955Vpv2 = this.LJLJLLL;
                if (c80955Vpv2 != null) {
                    c80955Vpv2.setEnableFixedSize(C31512CYi.LIZIZ);
                }
            }
        }
    }

    public final void wl() {
        ViewGroup.LayoutParams layoutParams;
        C80218Ve2 c80218Ve2;
        ViewGroup.LayoutParams layoutParams2;
        RankBottomBehavior rankBottomBehavior;
        C06F c06f;
        C80221Ve5 c80221Ve5 = this.LJLJL;
        C06C c06c = null;
        if (c80221Ve5 != null) {
            layoutParams = c80221Ve5.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C80218Ve2) {
            c80218Ve2 = (C80218Ve2) layoutParams;
        } else {
            c80218Ve2 = null;
        }
        if (c80218Ve2 != null) {
            c80218Ve2.LIZ = 0;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.nb6);
        if (_$_findCachedViewById != null) {
            layoutParams2 = _$_findCachedViewById.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if ((layoutParams2 instanceof C06F) && (c06f = (C06F) layoutParams2) != null) {
            c06c = c06f.LIZ;
        }
        if ((c06c instanceof RankBottomBehavior) && (rankBottomBehavior = (RankBottomBehavior) c06c) != null) {
            C80217Ve1 c80217Ve1 = this.LJLJJLL;
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.nb6);
            rankBottomBehavior.LJFF = false;
            if (c80217Ve1 != null && _$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setPadding(_$_findCachedViewById2.getPaddingLeft(), _$_findCachedViewById2.getPaddingTop(), _$_findCachedViewById2.getPaddingRight(), 0);
            }
        }
    }

    @Override // X.InterfaceC77978Uj0
    public final void Uc() {
        _$_findCachedViewById(R.id.m3d).setVisibility(8);
        _$_findCachedViewById(R.id.m3o).setVisibility(0);
        RankPageController rankPageController = this.LJLILLLLZI;
        ViewGroup.LayoutParams layoutParams = null;
        if (rankPageController != null) {
            int i = C31560Ca4.LIZ[rankPageController.LJIIJ().LJLIL.ordinal()];
            int i2 = R.string.m7t;
            if (i != 1) {
                if (i != 2) {
                    RankTypeV2 rankTypeV2 = this.LJLIL;
                    if (o.LJ(rankTypeV2, RankTypeV2.LIZIZ)) {
                        i2 = R.string.m7v;
                    } else if (o.LJ(rankTypeV2, RankTypeV2.LJI)) {
                        i2 = R.string.l6d;
                    }
                } else if (o.LJ(this.LJLIL, RankTypeV2.LIZLLL)) {
                    i2 = R.string.m7v;
                }
            } else if (o.LJ(this.LJLIL, RankTypeV2.LJFF)) {
                i2 = R.string.lik;
            }
            ((TextView) _$_findCachedViewById(R.id.m3o)).setText(i2);
            if (o.LJ(this.LJLIL, RankTypeV2.LJIIJ)) {
                ((TextView) _$_findCachedViewById(R.id.m3o)).setText(C15380j0.LJIILL(R.string.opb, 10));
            }
            ConstraintLayout constraintLayout = this.LJLL;
            if (constraintLayout != null) {
                layoutParams = constraintLayout.getLayoutParams();
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = -2;
            ConstraintLayout constraintLayout2 = this.LJLL;
            if (constraintLayout2 != null) {
                constraintLayout2.setLayoutParams(layoutParams);
            }
            C41541k6 tv_countdown_text = (C41541k6) _$_findCachedViewById(R.id.m3o);
            o.LJIIIIZZ(tv_countdown_text, "tv_countdown_text");
            ViewGroup.LayoutParams layoutParams2 = tv_countdown_text.getLayoutParams();
            if (layoutParams2 != null) {
                C018905p c018905p = (C018905p) layoutParams2;
                c018905p.startToStart = 0;
                c018905p.endToEnd = 0;
                ((ViewGroup.MarginLayoutParams) c018905p).width = 0;
                ((ViewGroup.MarginLayoutParams) c018905p).topMargin = C15380j0.LIZ(12.0f);
                ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = C15380j0.LIZ(12.0f);
                c018905p.setMarginStart(C15380j0.LIZ(16.0f));
                c018905p.setMarginEnd(C15380j0.LIZ(16.0f));
                tv_countdown_text.setLayoutParams(c018905p);
                ((TextView) _$_findCachedViewById(R.id.m3o)).setSingleLine(false);
                Gl();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        o.LJIJI("controller");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment
    public final void onVisible() {
        super.onVisible();
        if (!this.LLD) {
            this.LLD = true;
            F9();
        }
    }

    public final void Al(boolean z) {
        ViewStub viewStub;
        if (this.LJLLILLLL == z) {
            return;
        }
        if (this.LJLLI == null) {
            View view = getView();
            View view2 = null;
            if (view != null) {
                viewStub = (ViewStub) view.findViewById(R.id.c36);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                view2 = viewStub.inflate();
            }
            this.LJLLI = new LB6(view2, new C77953Uib(this));
        }
        if (z) {
            LB6 lb6 = this.LJLLI;
            if (lb6 != null) {
                lb6.LIZIZ.start();
            }
        } else {
            LB6 lb62 = this.LJLLI;
            if (lb62 != null) {
                lb62.LIZ.start();
            }
        }
        this.LJLLILLLL = z;
    }

    @Override // X.InterfaceC77978Uj0
    public final void Cj(C78021Ujh rankHistoryItem) {
        o.LJIIIZ(rankHistoryItem, "rankHistoryItem");
        RankPageController rankPageController = this.LJLILLLLZI;
        if (rankPageController != null) {
            if (!rankPageController.LJIIJ().LJLJI && rankHistoryItem.LIZIZ) {
                _$_findCachedViewById(R.id.ffu).setVisibility(0);
                ((ImageView) _$_findCachedViewById(R.id.ffr)).setVisibility(0);
                RankPageController rankPageController2 = this.LJLILLLLZI;
                if (rankPageController2 != null) {
                    int i = C31560Ca4.LIZ[rankPageController2.LJIIJ().LJLIL.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (o.LJ(this.LJLIL, RankTypeV2.LIZIZ)) {
                                ((TextView) _$_findCachedViewById(R.id.ffu)).setText(R.string.m7u);
                                ((C41081jM) _$_findCachedViewById(R.id.ffr)).setImageResource(R.drawable.d3j);
                            } else {
                                ((TextView) _$_findCachedViewById(R.id.ffu)).setText(R.string.kq8);
                                ((C41081jM) _$_findCachedViewById(R.id.ffr)).setImageResource(R.drawable.d3j);
                            }
                        } else if (o.LJ(this.LJLIL, RankTypeV2.LIZLLL)) {
                            ((TextView) _$_findCachedViewById(R.id.ffu)).setText(R.string.m7u);
                            ((C41081jM) _$_findCachedViewById(R.id.ffr)).setImageResource(R.drawable.d2o);
                        } else {
                            ((TextView) _$_findCachedViewById(R.id.ffu)).setText(R.string.kq8);
                            ((C41081jM) _$_findCachedViewById(R.id.ffr)).setImageResource(R.drawable.d2o);
                        }
                    } else {
                        ((TextView) _$_findCachedViewById(R.id.ffu)).setText(R.string.m7u);
                        ((C41081jM) _$_findCachedViewById(R.id.ffr)).setImageResource(R.drawable.d2z);
                    }
                    if (C15380j0.LJIIZILJ()) {
                        _$_findCachedViewById(R.id.ffr).setTranslationX(C15380j0.LIZ(12.0f));
                    } else {
                        _$_findCachedViewById(R.id.ffr).setTranslationX(C15380j0.LIZ(-12.0f));
                    }
                    vl();
                    C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.ffu), new C77945UiT(this));
                    return;
                }
                o.LJIJI("controller");
                throw null;
            }
            _$_findCachedViewById(R.id.ffu).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ffr)).setVisibility(8);
            return;
        }
        o.LJIJI("controller");
        throw null;
    }

    @Override // X.InterfaceC77978Uj0
    public final void LLIILII(List<AbstractC78035Ujv> list) {
        boolean z;
        C31415CUp c31415CUp;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            _$_findCachedViewById(R.id.isn).setVisibility(0);
            if (list != null && (c31415CUp = this.LL) != null) {
                c31415CUp.LJLZ(list);
            }
            C31415CUp c31415CUp2 = this.LL;
            if (c31415CUp2 != null) {
                c31415CUp2.notifyDataSetChanged();
                return;
            }
            return;
        }
        _$_findCachedViewById(R.id.isn).setVisibility(8);
    }

    @Override // X.InterfaceC77978Uj0
    public final void Mb(List<RankListV2Response.Bulletin> bulletinModel) {
        ViewStub viewStub;
        o.LJIIIZ(bulletinModel, "bulletinModel");
        View view = getView();
        if (view != null && (viewStub = (ViewStub) view.findViewById(R.id.ime)) != null) {
            View inflate = viewStub.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type com.bytedance.android.live.rank.impl.list.bulletin.BulletinView");
            this.LJLZ = (C78046Uk6) inflate;
        }
        C78046Uk6 c78046Uk6 = this.LJLZ;
        if (c78046Uk6 == null || (!((ArrayList) c78046Uk6.LJLLI).isEmpty())) {
            return;
        }
        C29306Beo.LJJIJIIJI(C77994UjG.LJLIL, bulletinModel);
        if (bulletinModel.isEmpty()) {
            c78046Uk6.setVisibility(8);
            return;
        }
        c78046Uk6.LJLLJ = true;
        ((ArrayList) c78046Uk6.LJLLI).addAll(bulletinModel);
        c78046Uk6.LJLLILLLL = 0;
        C78720Uuy LIZ = C15650jR.LIZ().LIZ(((RankListV2Response.Bulletin) ListProtector.get(c78046Uk6.LJLLI, 0)).icon.getUrls());
        LIZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
        int width = c78046Uk6.LJLILLLLZI.getWidth();
        int height = c78046Uk6.LJLILLLLZI.getHeight();
        LIZ.LJ = width;
        LIZ.LJFF = height;
        LIZ.LJIIJJI(c78046Uk6.LJLILLLLZI);
        c78046Uk6.LIZJ((RankListV2Response.Bulletin) ListProtector.get(c78046Uk6.LJLLI, 0));
    }

    @Override // X.InterfaceC77978Uj0
    public final void N5(boolean z) {
        C80218Ve2 c80218Ve2;
        if (this.LJLLJ == z) {
            return;
        }
        if (z) {
            C80221Ve5 c80221Ve5 = this.LJLJL;
            ViewGroup.LayoutParams layoutParams = null;
            if (c80221Ve5 != null) {
                layoutParams = c80221Ve5.getLayoutParams();
            }
            if ((layoutParams instanceof C80218Ve2) && (c80218Ve2 = (C80218Ve2) layoutParams) != null) {
                Integer valueOf = Integer.valueOf(c80218Ve2.LIZ);
                if (valueOf.intValue() <= 0) {
                    valueOf.intValue();
                    c80218Ve2.LIZ = 3;
                }
            }
        } else {
            wl();
        }
        this.LJLLJ = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC77978Uj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ve(webcast.api.ranklist.LynxRankView r6) {
        /*
            r5 = this;
            java.lang.String r0 = "lynxRankView"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.Ve5 r2 = r5.LJLJL
            if (r2 == 0) goto L67
            java.lang.String r0 = r6.lynxSchema
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L22
            r2.removeAllViews()
            X.OA0 r0 = r5.LJLJLJ
            if (r0 == 0) goto L1b
            r0.LIZIZ()
        L1b:
            r0 = 0
            r5.LJLJLJ = r0
            r5.wl()
            return
        L22:
            android.content.Context r3 = r5.getContext()
            java.lang.String r1 = r6.lynxSchema
            if (r1 == 0) goto L31
            boolean r0 = ujb.o.LJJJJJL(r1)
            if (r0 == 0) goto L68
        L31:
            r4 = -2
        L32:
            X.OA0 r0 = r5.LJLJLJ
            if (r0 != 0) goto L53
            X.OA0 r3 = new X.OA0
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "it.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.<init>(r1)
            r5.LJLJLJ = r3
            X.Ve5 r2 = r5.LJLJL
            if (r2 == 0) goto L53
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r0 = -1
            r1.<init>(r0, r4)
            r2.addView(r3, r1)
        L53:
            X.OA0 r2 = r5.LJLJLJ
            if (r2 == 0) goto L67
            java.lang.String r1 = r6.lynxSchema
            java.lang.String r0 = "lynxRankView.lynxSchema"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r1 = X.C31512CYi.LIZ(r1)
            java.lang.String r0 = r6.LIZ
            r2.LIZ(r4, r1, r0)
        L67:
            return
        L68:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            java.lang.String r0 = "parse(lynxSchema)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "height"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7e
            goto L31
        L7e:
            int r0 = X.C1E4.LJJIFFI(r1)
            float r0 = (float) r0
            float r0 = X.B9K.LIZ(r3, r0)
            int r4 = (int) r0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment.Ve(webcast.api.ranklist.LynxRankView):void");
    }

    @Override // X.InterfaceC77978Uj0
    public final void gg(long j) {
        String LJIILL;
        StringBuilder LIZ;
        String LIZ2;
        ConstraintLayout constraintLayout = this.LJLL;
        if (constraintLayout != null && constraintLayout.getVisibility() == 0) {
            RankPageController rankPageController = this.LJLILLLLZI;
            if (rankPageController != null) {
                if (rankPageController.LJLJJL.LIZIZ().LJLJJI == EnumC31514CYk.GAME_RANK) {
                    C78934UyQ.LJJIIJZLJL((TextView) _$_findCachedViewById(R.id.m3o), C15380j0.LJIILJJIL(R.string.koa), C31512CYi.LIZIZ);
                } else {
                    C78934UyQ.LJJIIJZLJL((TextView) _$_findCachedViewById(R.id.m3o), C15380j0.LJIILJJIL(R.string.mdv), C31512CYi.LIZIZ);
                }
                _$_findCachedViewById(R.id.m3o).setVisibility(0);
                _$_findCachedViewById(R.id.m3d).setVisibility(0);
                TextView textView = (TextView) _$_findCachedViewById(R.id.m3d);
                RankTypeV2 rankTypeV2 = this.LJLIL;
                RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
                if (o.LJ(rankTypeV2, rankTypeV22)) {
                    long j2 = j % 3600;
                    long j3 = 60;
                    long j4 = j2 / j3;
                    long j5 = j2 % j3;
                    StringBuilder LIZ3 = X1D.LIZ();
                    if (j4 < 10) {
                        LIZ = X1D.LIZ();
                        LIZ.append('0');
                    } else {
                        LIZ = X1D.LIZ();
                        LIZ.append("");
                    }
                    LIZ.append(j4);
                    LIZ3.append(X1D.LIZIZ(LIZ));
                    LIZ3.append(':');
                    if (j5 < 10) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append('0');
                        LIZ4.append(j5);
                        LIZ2 = X1D.LIZIZ(LIZ4);
                    } else {
                        LIZ2 = C61845OOz.LIZ("", j5);
                    }
                    LIZ3.append(LIZ2);
                    LJIILL = X1D.LIZIZ(LIZ3);
                } else {
                    long j6 = 86400;
                    long j7 = j / j6;
                    long j8 = j % j6;
                    long j9 = 3600;
                    long j10 = j8 / j9;
                    long j11 = j8 % j9;
                    long j12 = 60;
                    long j13 = j11 / j12;
                    long j14 = j11 % j12;
                    if (j7 > 0) {
                        LJIILL = C15380j0.LJIILL(R.string.kob, Long.valueOf(j7), Long.valueOf(j10), Long.valueOf(j13));
                        o.LJIIIIZZ(LJIILL, "{\n                ResUti…s, minutes)\n            }");
                    } else {
                        LJIILL = C15380j0.LJIILL(R.string.koc, Long.valueOf(j10), Long.valueOf(j13), Long.valueOf(j14));
                        o.LJIIIIZZ(LJIILL, "{\n                ResUti…s, seconds)\n            }");
                    }
                }
                textView.setText(LJIILL);
                if (o.LJ(this.LJLIL, rankTypeV22) && j < 180) {
                    ((TextView) _$_findCachedViewById(R.id.m3d)).setTextColor(C259910h.LIZIZ(R.attr.bnd, _$_findCachedViewById(R.id.m3o).getContext()));
                }
                ((ImageView) _$_findCachedViewById(R.id.imo)).setVisibility(0);
                vl();
                return;
            }
            o.LJIJI("controller");
            throw null;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LJLILLLLZI == null) {
            RankTypeV2 rankTypeV2 = this.LJLIL;
            RankRootController rankRootController = this.LJLJI;
            if (rankRootController != null) {
                RankPageController rankPageController = new RankPageController(rankTypeV2, this, rankRootController);
                getLifecycle().addObserver(rankPageController);
                this.LJLILLLLZI = rankPageController;
                return;
            }
            o.LJIJI("parentController");
            throw null;
        }
    }

    @Override // X.InterfaceC77978Uj0
    public final void sb(C78020Ujg faqItem) {
        o.LJIIIZ(faqItem, "faqItem");
        if (TextUtils.isEmpty(faqItem.LIZIZ)) {
            return;
        }
        RankPageController rankPageController = this.LJLILLLLZI;
        if (rankPageController != null) {
            if (rankPageController.LJIIJ().LJLJI) {
                ((ImageView) _$_findCachedViewById(R.id.imo)).setVisibility(8);
                this.LJLLLL = new IDCSpanS5S0200000_13(this, faqItem, 0);
                Gl();
                return;
            } else {
                ((ImageView) _$_findCachedViewById(R.id.imo)).setVisibility(0);
                C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.imo), new C78003UjP(this, faqItem));
                return;
            }
        }
        o.LJIJI("controller");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        boolean z2;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "5548885630911067008");
        if (c03880Dg.LIZJ(10502, "com/bytedance/android/live/rank/impl/list/fragment/page/RankPageFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/bytedance/android/live/rank/impl/list/fragment/page/RankPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (isAdded()) {
            for (Fragment fragment : getChildFragmentManager().LJJJJLI()) {
                if (fragment instanceof VisibilityFragment) {
                    VisibilityFragment visibilityFragment = (VisibilityFragment) fragment;
                    if (z != visibilityFragment.LJLILLLLZI) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    visibilityFragment.LJLILLLLZI = z;
                    if (visibilityFragment.isResumed() && z2 && visibilityFragment.getUserVisibleHint()) {
                        visibilityFragment.wl(visibilityFragment.LJLILLLLZI);
                    }
                }
            }
        }
        c03880Dg.LIZIZ(10502, "com/bytedance/android/live/rank/impl/list/fragment/page/RankPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final void xl(C78020Ujg c78020Ujg) {
        RankRootController rankRootController = this.LJLJI;
        if (rankRootController != null) {
            rankRootController.LIZLLL(c78020Ujg);
            RankPageController rankPageController = this.LJLILLLLZI;
            if (rankPageController != null) {
                RankListViewModel LJII = rankPageController.LJII();
                if (LJII != null) {
                    if (!o.LJ(c78020Ujg.LIZ.LIZIZ, RankTypeV2.LIZJ)) {
                        RankPageController rankPageController2 = this.LJLILLLLZI;
                        if (rankPageController2 != null) {
                            RankListV2Response.RankView LJIIIIZZ = rankPageController2.LJIIIIZZ();
                            C31526CYw c31526CYw = LJII.LJLIL;
                            RankPageController rankPageController3 = this.LJLILLLLZI;
                            if (rankPageController3 != null) {
                                C31522CYs.LJ(LJIIIIZZ, c31526CYw, rankPageController3.LJIIJ().LJLLL.rankName, C51029K0z.LJIILIIL(this));
                                return;
                            } else {
                                o.LJIJI("controller");
                                throw null;
                            }
                        }
                        o.LJIJI("controller");
                        throw null;
                    }
                    RankPageController rankPageController4 = this.LJLILLLLZI;
                    if (rankPageController4 != null) {
                        C31522CYs.LJ(rankPageController4.LJIIIIZZ(), LJII.LJLIL, "rookie_star_rank_right_top", C51029K0z.LJIILIIL(this));
                        return;
                    } else {
                        o.LJIJI("controller");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("controller");
            throw null;
        }
        o.LJIJI("parentController");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0163 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0164  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC77978Uj0
    public final void xh(View view, boolean z) {
        if (!z) {
            View full_container = _$_findCachedViewById(R.id.dp7);
            o.LJIIIIZZ(full_container, "full_container");
            ViewGroup.LayoutParams layoutParams = full_container.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                full_container.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.dp7);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d53, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
