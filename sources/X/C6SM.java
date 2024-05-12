package X;

import Y.ACListenerS22S0100000_2;
import Y.ACListenerS28S0300000_2;
import Y.ALAdapterS1S0100000_2;
import Y.ARunnableS2S1300000_2;
import Y.ARunnableS38S0100000_2;
import Y.IDObjectS175S0100000_2;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerCreateComponent$initAddYoursStickerEditLayout$1;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursSuggestTopic;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6SM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SM extends C6PN<AddYoursStickerModel> {
    public final InterfaceC159886Pg LJII;
    public final C6QI LJIIIIZZ;
    public C6SQ LJIIIZ;
    public long LJIIJ;

    @Override // X.C6PN
    public final EnumC157656Gr LIZLLL() {
        return EnumC157656Gr.ADD_YOURS;
    }

    @Override // X.C6PN
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        float f;
        o.LJIIIZ(stickerModel, "stickerModel");
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) stickerModel;
        BaseStickerModel baseStickerModel = addYoursStickerModel.getBaseStickerModel();
        C6SL LJIIJ = this.LJII.LJIIJ();
        if (LJIIJ != null && LJIIJ.LIZLLL()) {
            f = 0.5f;
        } else {
            f = 0.9f;
        }
        return AddYoursStickerModel.copy$default(addYoursStickerModel, BaseStickerModel.copy$default(baseStickerModel, i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, f, 2147483646, null), null, null, null, null, null, false, false, false, null, null, null, 4030, null);
    }

    @Override // X.C6PN
    public final C6OX LIZ(StickerModel stickerModel, C159636Oh c159636Oh, LifecycleOwner lifecycleOwner) {
        return new C6SK(this.LIZ, AddYoursStickerModel.copy$default((AddYoursStickerModel) stickerModel, null, null, null, null, null, null, true, false, false, null, null, null, 4031, null), this.LIZIZ, this.LJII, c159636Oh, lifecycleOwner, this.LJFF);
    }

    @Override // X.C6PN
    public final void LJ(final C6QO c6qo, final C6PX c6px, String createEditEnterMethod, final InterfaceC88472Yns editDone) {
        StickerModel addYoursStickerModel;
        Long l;
        UrlModel urlModel;
        OSZ<Long, UrlModel> LIZ;
        OSZ<Long, UrlModel> LIZ2;
        int i;
        Throwable th;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int i3;
        long j;
        AddYoursStickerTopicRepo LJ;
        o.LJIIIZ(createEditEnterMethod, "createEditEnterMethod");
        o.LJIIIZ(editDone, "editDone");
        if (c6qo == null || (addYoursStickerModel = c6qo.LIZ()) == null) {
            BaseStickerModel baseStickerModel = new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZIZ.getWidth(), this.LIZIZ.getHeight(), 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -7681, null);
            C6SL LJIIJ = this.LJII.LJIIJ();
            if (LJIIJ != null && (LIZ2 = LJIIJ.LIZ()) != null) {
                l = LIZ2.getFirst();
            } else {
                l = null;
            }
            C6SL LJIIJ2 = this.LJII.LJIIJ();
            if (LJIIJ2 != null && (LIZ = LJIIJ2.LIZ()) != null) {
                urlModel = LIZ.getSecond();
            } else {
                urlModel = null;
            }
            addYoursStickerModel = new AddYoursStickerModel(baseStickerModel, C47261Igj.LJJIJ(new AddYoursAvatar(l, urlModel, null, 4, null)), null, null, null, null, false, false, false, null, createEditEnterMethod, null, 3068, null);
        }
        AddYoursStickerModel addYoursStickerModel2 = (AddYoursStickerModel) addYoursStickerModel;
        C6SQ c6sq = this.LJIIIZ;
        if (c6sq == null) {
            this.LJIIIZ = new C6SQ(this.LIZ, this.LJII);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            FrameLayout frameLayout = this.LIZJ;
            C6SQ c6sq2 = this.LJIIIZ;
            if (c6sq2 != null) {
                frameLayout.addView(c6sq2, layoutParams);
                Point point = new Point((this.LIZIZ.getRight() + this.LIZIZ.getLeft()) / 2, (this.LIZIZ.getBottom() + this.LIZIZ.getTop()) / 2);
                final C6SQ c6sq3 = this.LJIIIZ;
                if (c6sq3 != null) {
                    LifecycleOwner owner = this.LIZLLL;
                    o.LJIIIZ(owner, "owner");
                    i = 0;
                    c6sq3.LJLJJL = AddYoursStickerModel.copy$default(addYoursStickerModel2, BaseStickerModel.copy$default(addYoursStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null), null, null, null, null, null, false, false, false, null, null, null, 4094, null);
                    c6sq3.LJLJL = new C1NS<>(AddYoursStickerModel.copy$default(addYoursStickerModel2, BaseStickerModel.copy$default(addYoursStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, Integer.MAX_VALUE, null), null, null, null, null, null, false, true, true, null, null, null, 3646, null));
                    th = null;
                    c6sq3.LJLJLJ = new C1NS<>(AddYoursStickerModel.copy$default(addYoursStickerModel2, BaseStickerModel.copy$default(addYoursStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, Integer.MAX_VALUE, null), null, null, null, null, null, false, false, false, null, null, null, 3646, null));
                    c6sq3.LJLZ = point;
                    c6sq3.LJLJLLL = owner;
                    o.LJII(C16880lQ.LLLZIIL(R.layout.gc, C16880lQ.LLZIL(c6sq3.getContext()), c6sq3), "null cannot be cast to non-null type android.view.ViewGroup");
                    View findViewById = c6sq3.findViewById(R.id.wl);
                    o.LJIIIIZZ(findViewById, "findViewById(R.id.add_yours_sticker_edit_root)");
                    c6sq3.LJLJJLL = (ViewGroup) findViewById;
                    View findViewById2 = c6sq3.findViewById(R.id.la4);
                    ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams = null;
                    }
                    if (marginLayoutParams != null) {
                        Context context = findViewById2.getContext();
                        o.LJIIIIZZ(context, "context");
                        marginLayoutParams.topMargin = C63081OpJ.LJJJJLI(context);
                    }
                    c6sq3.LJLLI = findViewById2;
                    View findViewById3 = c6sq3.findViewById(R.id.mm5);
                    C16880lQ.LJJJJI((TuxTextView) findViewById3, new ACListenerS22S0100000_2(c6sq3, 155));
                    o.LJIIIIZZ(findViewById3, "findViewById<TuxTextView…)\n            }\n        }");
                    c6sq3.LJLLILLLL = (TuxTextView) findViewById3;
                    View findViewById4 = c6sq3.findViewById(R.id.kgr);
                    o.LJIIIIZZ(findViewById4, "findViewById(R.id.sticker_container_layout)");
                    c6sq3.LJLL = (FrameLayout) findViewById4;
                    View findViewById5 = c6sq3.findViewById(R.id.c_m);
                    o.LJIIIIZZ(findViewById5, "findViewById(R.id.dice_container)");
                    C29701Eo c29701Eo = (C29701Eo) findViewById5;
                    c6sq3.LJLLLL = c29701Eo;
                    c29701Eo.setAnimation("effect_dice_lottie.json");
                    View findViewById6 = c6sq3.findViewById(R.id.wm);
                    o.LJIIIIZZ(findViewById6, "findViewById(R.id.add_yours_topic_list)");
                    final C6SO c6so = (C6SO) findViewById6;
                    c6sq3.LJLLLLLL = c6so;
                    Context context2 = c6so.getContext();
                    o.LJIIIIZZ(context2, "context");
                    if (C26338AVi.LIZJ(context2)) {
                        float LJIIZILJ = C32151Nz.LJIIZILJ(10);
                        c6so.LLLF = 0.0f;
                        c6so.LLLFFI = 0.0f;
                        c6so.LLLFF = LJIIZILJ;
                        c6so.LLLFZ = 0.0f;
                    } else {
                        c6so.LLLF = C32151Nz.LJIIZILJ(10);
                        c6so.LLLFFI = 0.0f;
                        c6so.LLLFF = 0.0f;
                        c6so.LLLFZ = 0.0f;
                    }
                    c6so.getContext();
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                    linearLayoutManager.LLJJIII(0);
                    c6so.setLayoutManager(linearLayoutManager);
                    c6so.setAdapter(new AbstractC029409q<C135895Uz>() { // from class: X.5Uy
                        @Override // X.AbstractC029409q
                        public final int getItemCount() {
                            List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic> list = c6sq3.LLF.get(EnumC160626Sc.HOT);
                            if (list != null) {
                                return list.size();
                            }
                            return 0;
                        }

                        @Override // X.AbstractC029409q
                        public final void onBindViewHolder(C135895Uz c135895Uz, int i4) {
                            AddYoursStickerTopicRepoApi$AddYoursSuggestTopic addYoursStickerTopicRepoApi$AddYoursSuggestTopic;
                            C135895Uz holder = c135895Uz;
                            o.LJIIIZ(holder, "holder");
                            List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic> list = c6sq3.LLF.get(EnumC160626Sc.HOT);
                            String str = null;
                            if (list != null) {
                                addYoursStickerTopicRepoApi$AddYoursSuggestTopic = (AddYoursStickerTopicRepoApi$AddYoursSuggestTopic) ListProtector.get(list, i4);
                                if (addYoursStickerTopicRepoApi$AddYoursSuggestTopic != null) {
                                    str = addYoursStickerTopicRepoApi$AddYoursSuggestTopic.getText();
                                }
                            } else {
                                addYoursStickerTopicRepoApi$AddYoursSuggestTopic = null;
                            }
                            if (C78685UuP.LJJJZ(str) && addYoursStickerTopicRepoApi$AddYoursSuggestTopic != null) {
                                holder.itemView.setVisibility(0);
                                TuxTextView tuxTextView = holder.LJLIL;
                                if (tuxTextView == null) {
                                    return;
                                }
                                tuxTextView.setText(addYoursStickerTopicRepoApi$AddYoursSuggestTopic.getText());
                            }
                        }

                        @Override // X.AbstractC029409q
                        /* renamed from: onCreateViewHolder */
                        public final C135895Uz com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i4) {
                            o.LJIIIZ(parent, "parent");
                            FrameLayout frameLayout2 = new FrameLayout(C6SO.this.getContext());
                            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1);
                            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
                            frameLayout2.setPadding(LJJIIZ, LJJIIZ, LJJIIZ, LJJIIZ);
                            layoutParams3.gravity = 17;
                            frameLayout2.setLayoutParams(layoutParams3);
                            frameLayout2.setVisibility(8);
                            C110614Vt c110614Vt = new C110614Vt();
                            c110614Vt.LIZIZ = Integer.valueOf(R.attr.dg);
                            c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(8));
                            Context context3 = frameLayout2.getContext();
                            o.LJIIIIZZ(context3, "context");
                            frameLayout2.setBackground(c110614Vt.LIZ(context3));
                            Context context4 = C6SO.this.getContext();
                            o.LJIIIIZZ(context4, "context");
                            TuxTextView tuxTextView = new TuxTextView(context4, null, 6, 0);
                            tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                            tuxTextView.setTuxFont(62);
                            tuxTextView.setTextColorRes(R.attr.dj);
                            tuxTextView.setGravity(17);
                            frameLayout2.addView(tuxTextView);
                            C16880lQ.LJIILJJIL(frameLayout2, new ACListenerS28S0300000_2(c6sq3, C6SO.this, tuxTextView, 1));
                            C135895Uz c135895Uz = new C135895Uz(frameLayout2);
                            c135895Uz.LJLIL = tuxTextView;
                            C0AX.LIZ(parent, c135895Uz.itemView, R.id.lj7);
                            View view = c135895Uz.itemView;
                            if (view != null) {
                                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
                            }
                            try {
                                if (c135895Uz.itemView.getParent() != null) {
                                    boolean z = true;
                                    try {
                                        SettingsManager.LIZLLL().getClass();
                                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                                    } catch (Exception unused) {
                                    }
                                    if (z) {
                                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                        stringBuffer.append(C135895Uz.class.getName());
                                        stringBuffer.append(" parent ");
                                        stringBuffer.append(parent.getClass().getName());
                                        stringBuffer.append(" viewType ");
                                        stringBuffer.append(i4);
                                        C78983UzD.LJIILL(stringBuffer.toString());
                                        ViewGroup viewGroup = (ViewGroup) c135895Uz.itemView.getParent();
                                        if (viewGroup != null) {
                                            C16880lQ.LJLLL(c135895Uz.itemView, viewGroup);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                C78946Uyc.LIZIZ(e);
                                C36922EeM.LIZ(e);
                            }
                            C29127Bbv.LIZ = C135895Uz.class.getName();
                            return c135895Uz;
                        }
                    });
                    c6so.LJII(new AbstractC030309z() { // from class: X.4cr
                        @Override // X.AbstractC030309z
                        public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
                            int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
                            Context context3 = C6SO.this.getContext();
                            o.LJIIIIZZ(context3, "context");
                            if (C26338AVi.LIZJ(context3)) {
                                if (LIZJ == 0) {
                                    rect.right = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
                                }
                                rect.left = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
                            } else {
                                if (LIZJ == 0) {
                                    rect.left = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
                                }
                                rect.right = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
                            }
                        }
                    }, -1);
                    AddYoursStickerModel addYoursStickerModel3 = c6sq3.LJLJJL;
                    if (addYoursStickerModel3 != null) {
                        List<AddYoursAvatar> avatars = addYoursStickerModel3.getAvatars();
                        C6SL LJIIJ3 = c6sq3.LJLJJI.LJIIJ();
                        if (LJIIJ3 != null) {
                            i2 = LJIIJ3.LJI();
                        } else {
                            i2 = R.string.bcp;
                        }
                        C6SL LJIIJ4 = c6sq3.LJLJJI.LJIIJ();
                        if (LJIIJ4 != null && LJIIJ4.LIZLLL()) {
                            i3 = R.raw.icon_two_person_large_fill;
                        } else {
                            i3 = R.raw.icon_camera_fill;
                        }
                        AddYoursStickerModel addYoursStickerModel4 = c6sq3.LJLJJL;
                        if (addYoursStickerModel4 != null) {
                            Long followCount = addYoursStickerModel4.getFollowCount();
                            if (followCount != null) {
                                j = followCount.longValue();
                            } else {
                                j = 0;
                            }
                            C161366Uy c161366Uy = new C161366Uy(i3, i2, null, avatars, j, null, 0.0f, false, false, 1045359);
                            Context context3 = c6sq3.getContext();
                            o.LJIIIIZZ(context3, "context");
                            C161096Tx c161096Tx = new C161096Tx(context3, c6sq3.LL, c161366Uy);
                            C1NS<AddYoursStickerModel> c1ns = c6sq3.LJLJL;
                            if (c1ns != null) {
                                LifecycleOwner lifecycleOwner = c6sq3.LJLJLLL;
                                if (lifecycleOwner != null) {
                                    c161096Tx.LIZ(c1ns, lifecycleOwner);
                                    c6sq3.setAddYoursStickerView(c161096Tx);
                                    FrameLayout frameLayout2 = c6sq3.LJLL;
                                    if (frameLayout2 != null) {
                                        frameLayout2.addView(c6sq3.getAddYoursStickerView());
                                        Context context4 = c6sq3.getContext();
                                        o.LJIIIIZZ(context4, "context");
                                        C161096Tx c161096Tx2 = new C161096Tx(context4, c6sq3.LL, c161366Uy);
                                        C1NS<AddYoursStickerModel> c1ns2 = c6sq3.LJLJLJ;
                                        if (c1ns2 != null) {
                                            LifecycleOwner lifecycleOwner2 = c6sq3.LJLJLLL;
                                            if (lifecycleOwner2 != null) {
                                                c161096Tx2.LIZ(c1ns2, lifecycleOwner2);
                                                c6sq3.LJLLL = c161096Tx2;
                                                c6sq3.addView(c161096Tx2);
                                                C6SL LJIIJ5 = c6sq3.LJLJJI.LJIIJ();
                                                if (LJIIJ5 != null && (LJ = LJIIJ5.LJ()) != null) {
                                                    LJ.LIZIZ(new AqS168S0100000_2(c6sq3, 611));
                                                }
                                                c6sq3.getAddYoursStickerView().getContentEditText().LJLJJLL.add(new AqS184S0100000_2(c6sq3, 73));
                                                C6SN contentEditText = c6sq3.getAddYoursStickerView().getContentEditText();
                                                AqS184S0100000_2 aqS184S0100000_2 = new AqS184S0100000_2(c6sq3, 74);
                                                contentEditText.getClass();
                                                contentEditText.LJLJL.add(aqS184S0100000_2);
                                                ViewGroup viewGroup = c6sq3.LJLJJLL;
                                                if (viewGroup != null) {
                                                    C16880lQ.LJIIL(viewGroup, new ACListenerS22S0100000_2(c6sq3, 153));
                                                    C29701Eo c29701Eo2 = c6sq3.LJLLLL;
                                                    if (c29701Eo2 != null) {
                                                        c29701Eo2.setSpeed(1.5f);
                                                        c29701Eo2.addAnimatorListener(new ALAdapterS1S0100000_2(c6sq3, 45));
                                                        c29701Eo2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(c29701Eo2, 154)));
                                                        c6sq3.getAddYoursStickerView().getContentEditText().addTextChangedListener(new IDObjectS175S0100000_2(c6sq3, 15));
                                                        C1NS<AddYoursStickerModel> c1ns3 = c6sq3.LJLJL;
                                                        if (c1ns3 != null) {
                                                            LiveState<V> LIZ3 = c1ns3.LIZ(new TBT() { // from class: X.6Sj
                                                                @Override // X.TBT, X.TBZ, X.TBW
                                                                public final Object get(Object obj) {
                                                                    return ((AddYoursStickerModel) obj).getTopicText();
                                                                }
                                                            });
                                                            LifecycleOwner lifecycleOwner3 = c6sq3.LJLJLLL;
                                                            if (lifecycleOwner3 != null) {
                                                                LIZ3.LJIIIIZZ(lifecycleOwner3, Lifecycle.State.STARTED, new AqS168S0100000_2(c6sq3, 607));
                                                                this.LIZLLL.getLifecycle().addObserver(new AddYoursStickerCreateComponent$initAddYoursStickerEditLayout$1(this));
                                                            } else {
                                                                o.LJIJI("lifecycleOwner");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("stateContainer");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("diceButton");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("editRootLayout");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("lifecycleOwner");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("animStateContainer");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("addYoursStickerContainer");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("lifecycleOwner");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("stateContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("savedAddYoursStickerModel");
                            throw null;
                        }
                    } else {
                        o.LJIJI("savedAddYoursStickerModel");
                        throw null;
                    }
                } else {
                    o.LJIJI("addYoursStickerEditView");
                    throw null;
                }
            } else {
                o.LJIJI("addYoursStickerEditView");
                throw null;
            }
        } else {
            i = 0;
            th = null;
            c6sq.LJLJJL = AddYoursStickerModel.copy$default(addYoursStickerModel2, BaseStickerModel.copy$default(addYoursStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null), null, null, null, null, null, false, false, false, null, null, null, 4094, null);
            C1NS<AddYoursStickerModel> c1ns4 = c6sq.LJLJL;
            if (c1ns4 != null) {
                c1ns4.LJ(new AqS168S0100000_2(addYoursStickerModel2, 601));
                C1NS<AddYoursStickerModel> c1ns5 = c6sq.LJLJLJ;
                if (c1ns5 != null) {
                    c1ns5.LJ(new AqS168S0100000_2(addYoursStickerModel2, 603));
                } else {
                    o.LJIJI("animStateContainer");
                    throw null;
                }
            } else {
                o.LJIJI("stateContainer");
                throw null;
            }
        }
        C6SQ c6sq4 = this.LJIIIZ;
        if (c6sq4 != null) {
            c6sq4.setStickerEditListener(new C6Q4() { // from class: X.6RY
                @Override // X.C6Q4
                public final void LIZLLL() {
                    C6QO c6qo2 = c6qo;
                    if (c6qo2 != null) {
                        c6qo2.setVisible(false);
                    }
                }

                @Override // X.C6Q4
                public final void LJ() {
                    this.LJIIIIZZ.LIZJ().LJJIFFI();
                }

                @Override // X.C6Q4
                public final void LJFF() {
                    this.LJIIIIZZ.LIZJ().LJJIFFI();
                }

                @Override // X.C6Q4
                public final void LIZIZ(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                }

                @Override // X.C6Q4
                public final void LIZJ(StickerModel stickerModel) {
                    o.LJIIIZ(stickerModel, "stickerModel");
                    long currentTimeMillis = System.currentTimeMillis();
                    C6SM c6sm = this;
                    if (currentTimeMillis - c6sm.LJIIJ > 3000) {
                        c6sm.LJIIJ = System.currentTimeMillis();
                        C6QK LIZJ = this.LJIIIIZZ.LIZJ();
                        String string = this.LIZ.getString(R.string.bcq);
                        o.LJIIIIZZ(string, "context.getString(R.stri…LimitReachedSection_body)");
                        C6SQ c6sq5 = this.LJIIIZ;
                        if (c6sq5 != null) {
                            C161096Tx view = c6sq5.getAddYoursStickerView();
                            EnumC159956Pn pos = EnumC159956Pn.BOTTOM;
                            LIZJ.getClass();
                            o.LJIIIZ(view, "view");
                            o.LJIIIZ(pos, "pos");
                            view.post(new ARunnableS2S1300000_2(pos, view, LIZJ, string, 3));
                            return;
                        }
                        o.LJIJI("addYoursStickerEditView");
                        throw null;
                    }
                }

                @Override // X.C6Q4
                public final void LIZ(StickerModel stickerModel, boolean z) {
                    AddYoursStickerModel addYoursStickerModel5;
                    int i4;
                    o.LJIIIZ(stickerModel, "stickerModel");
                    C6Q4 c6q4 = c6px;
                    if (c6q4 != null) {
                        c6q4.LIZ(stickerModel, false);
                    }
                    if ((stickerModel instanceof AddYoursStickerModel) && (addYoursStickerModel5 = (AddYoursStickerModel) stickerModel) != null) {
                        InterfaceC88472Yns<StickerModel, C76800UCe> interfaceC88472Yns = editDone;
                        C6SM c6sm = this;
                        interfaceC88472Yns.invoke(addYoursStickerModel5);
                        C6SL LJIIJ6 = c6sm.LJII.LJIIJ();
                        if (LJIIJ6 != null) {
                            String topicText = addYoursStickerModel5.getTopicText();
                            String str = "";
                            if (topicText == null) {
                                topicText = "";
                            }
                            C6SQ c6sq5 = c6sm.LJIIIZ;
                            if (c6sq5 != null) {
                                String value = c6sq5.getInputMode().getValue();
                                boolean z2 = C6SQ.LLIFFJFJJ;
                                String addYoursEnterMethod = addYoursStickerModel5.getAddYoursEnterMethod();
                                if (addYoursEnterMethod != null) {
                                    str = addYoursEnterMethod;
                                }
                                Integer isOperationSet = addYoursStickerModel5.isOperationSet();
                                if (isOperationSet != null) {
                                    i4 = isOperationSet.intValue();
                                } else {
                                    i4 = 0;
                                }
                                LJIIJ6.LIZJ(i4, topicText, z2, value, str);
                                return;
                            }
                            o.LJIJI("addYoursStickerEditView");
                            throw null;
                        }
                    }
                }
            });
            C6SQ c6sq5 = this.LJIIIZ;
            if (c6sq5 != null) {
                C6SL LJIIJ6 = c6sq5.LJLJJI.LJIIJ();
                if (LJIIJ6 != null) {
                    boolean z = C6SQ.LLIFFJFJJ;
                    C1NS<AddYoursStickerModel> c1ns6 = c6sq5.LJLJL;
                    if (c1ns6 != null) {
                        String topicText = c1ns6.LJ.getTopicText();
                        String str = "";
                        if (topicText == null) {
                            topicText = "";
                        }
                        C1NS<AddYoursStickerModel> c1ns7 = c6sq5.LJLJL;
                        if (c1ns7 != null) {
                            String addYoursEnterMethod = c1ns7.LJ.getAddYoursEnterMethod();
                            if (addYoursEnterMethod != null) {
                                str = addYoursEnterMethod;
                            }
                            LJIIJ6.LIZIZ(topicText, str, z);
                        } else {
                            o.LJIJI("stateContainer");
                            throw th;
                        }
                    } else {
                        o.LJIJI("stateContainer");
                        throw th;
                    }
                }
                c6sq5.LLD = -1;
                c6sq5.setVisibility(i);
                AddYoursStickerModel addYoursStickerModel5 = c6sq5.LJLJJL;
                if (addYoursStickerModel5 != null) {
                    String topicText2 = addYoursStickerModel5.getTopicText();
                    if (topicText2 == null || topicText2.length() == 0) {
                        C1NS<AddYoursStickerModel> c1ns8 = c6sq5.LJLJL;
                        if (c1ns8 != null) {
                            c1ns8.LJ(C160656Sf.LJLIL);
                            C1NS<AddYoursStickerModel> c1ns9 = c6sq5.LJLJLJ;
                            if (c1ns9 != null) {
                                c1ns9.LJ(C160666Sg.LJLIL);
                            } else {
                                o.LJIJI("animStateContainer");
                                throw th;
                            }
                        } else {
                            o.LJIJI("stateContainer");
                            throw th;
                        }
                    }
                    c6sq5.postDelayed(new ARunnableS38S0100000_2(c6sq5, 179), 300L);
                    return;
                }
                o.LJIJI("savedAddYoursStickerModel");
                throw th;
            }
            o.LJIJI("addYoursStickerEditView");
            throw th;
        }
        o.LJIJI("addYoursStickerEditView");
        throw th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6SM(Context context, FrameLayout stickerContainer, FrameLayout stickerHigherContainer, LifecycleOwner lifecycleOwner, C159816Oz stickerConfig, InterfaceC159886Pg editProvideStickerService, C6QI stickerAssistManager, C160056Px stickerObjectContainer) {
        super(context, stickerContainer, stickerHigherContainer, lifecycleOwner, stickerConfig, stickerObjectContainer);
        C6SL LJIIJ;
        AddYoursStickerTopicRepo LJ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerContainer, "stickerContainer");
        o.LJIIIZ(stickerHigherContainer, "stickerHigherContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerConfig, "stickerConfig");
        o.LJIIIZ(editProvideStickerService, "editProvideStickerService");
        o.LJIIIZ(stickerAssistManager, "stickerAssistManager");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        this.LJII = editProvideStickerService;
        this.LJIIIIZZ = stickerAssistManager;
        if (C6SQ.LLIFFJFJJ && (LJIIJ = editProvideStickerService.LJIIJ()) != null && (LJ = LJIIJ.LJ()) != null) {
            LJ.LIZIZ(C6SP.LJLIL);
        }
    }
}
