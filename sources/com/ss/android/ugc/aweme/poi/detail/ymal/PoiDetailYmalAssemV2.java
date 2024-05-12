package com.ss.android.ugc.aweme.poi.detail.ymal;

import X.C16880lQ;
import X.C187127Wa;
import X.C189127bY;
import X.C190027d0;
import X.C190037d1;
import X.C190117d9;
import X.C190127dA;
import X.C190137dB;
import X.C190147dC;
import X.C190157dD;
import X.C190167dE;
import X.C190397db;
import X.C193037hr;
import X.C19N;
import X.C1DI;
import X.C2068389v;
import X.C214298b3;
import X.C32151Nz;
import X.C34K;
import X.C42625Go9;
import X.C43001GuD;
import X.C55096Ljo;
import X.C57434MgQ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C78939UyV;
import X.C7MY;
import X.C8CH;
import X.C8VC;
import X.C8YN;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.FMX;
import X.InterfaceC189047bQ;
import X.InterfaceC189137bZ;
import X.InterfaceC190107d8;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.O6R;
import X.QD3;
import X.SY9;
import X.SYL;
import X.TBT;
import X.W5F;
import X.W5U;
import X.X1D;
import X.YE1;
import Y.ACListenerS23S0100000_3;
import Y.ALAdapterS0S0000000_3;
import Y.AUListenerS67S0101000_3;
import Y.AfS23S0110000_3;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBasicInfo;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.v2.PoiDetailYmalViewModel;
import com.ss.android.ugc.aweme.poi.detail.ymal.PoiDetailYmalAssemV2;
import com.ss.android.ugc.aweme.poi.experiment.PoiServerConfigSettings;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS11S1400000_3;
import kotlin.jvm.internal.AqS122S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class PoiDetailYmalAssemV2 extends PoiDetailBaseAssem {
    public final C214298b3 LJLLI;
    public final C214298b3 LJLLILLLL;
    public SYL LJLLJ;

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean L3() {
        return true;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0q;
    }

    /* loaded from: classes4.dex */
    public static final class YmalPoiListItemCell extends PowerCell<PoiListApi.PoiYMALModel> {
        public static final int LJLJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(64));
        public static final int LJLJLJ = C7MY.LIZIZ(20);
        public static Drawable LJLJLLL;
        public SmartImageView LJLIL;
        public TuxTextView LJLILLLLZI;
        public TuxTextView LJLJI;
        public TuxIconView LJLJJI;
        public final C214298b3 LJLJJL;
        public boolean LJLJJLL;

        public YmalPoiListItemCell() {
            C214298b3 c214298b3;
            C9BE c9be = C9BE.LIZ;
            C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailYmalViewModel.class);
            AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 759);
            C190147dC c190147dC = C190147dC.INSTANCE;
            if (o.LJ(c9be, C9BD.LIZ)) {
                c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C190127dA.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 760), new AqS153S0100000_3((InterfaceC93923mO) this, 761), C190167dE.INSTANCE, c190147dC, new AqS153S0100000_3((InterfaceC93923mO) this, 762), 256);
            } else if (o.LJ(c9be, c9be)) {
                c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C190137dB.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 763), new AqS153S0100000_3((InterfaceC93923mO) this, 754), C190157dD.INSTANCE, c190147dC, new AqS153S0100000_3((InterfaceC93923mO) this, 755), 256);
            } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
                c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C190117d9.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 756), new AqS153S0100000_3((InterfaceC93923mO) this, 757), new AqS153S0100000_3((InterfaceC93923mO) this, 758), c190147dC, (InterfaceC65784Pro) null, 384);
            } else {
                throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
            }
            this.LJLJJL = c214298b3;
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onItemViewCreated() {
            super.onItemViewCreated();
            this.LJLIL = (SmartImageView) this.itemView.findViewById(R.id.cover);
            this.LJLILLLLZI = (TuxTextView) this.itemView.findViewById(R.id.mec);
            this.LJLJI = (TuxTextView) this.itemView.findViewById(R.id.mlp);
            this.LJLJJI = (TuxIconView) this.itemView.findViewById(R.id.htk);
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [X.7d7] */
        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onBindItemView(PoiListApi.PoiYMALModel poiYMALModel) {
            String str;
            String sb;
            String str2;
            Boolean bool;
            final String str3;
            UrlModel urlModel;
            PoiListApi.PoiYMALModel t = poiYMALModel;
            o.LJIIIZ(t, "t");
            if (!this.LJLJJLL) {
                this.LJLJJLL = true;
                C189127bY.LIZJ((InterfaceC189137bZ) C8CH.LIZIZ(this, C65352Pkq.LIZ(InterfaceC189137bZ.class)), t.trackInfo, "ymal_item_click", t, 4);
            }
            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cv);
            String str4 = null;
            if (LIZIZ != null) {
                int intValue = LIZIZ.intValue();
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                if (LJLJLLL == null) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_map_pin_fill;
                    c2068389v.LJ = Integer.valueOf(R.attr.gp);
                    int i = LJLJLJ;
                    c2068389v.LIZIZ = i;
                    c2068389v.LIZJ = i;
                    SY9 LIZ = c2068389v.LIZ(context);
                    int i2 = LIZ.LJI;
                    int i3 = LIZ.LJII;
                    int i4 = LJLJL;
                    Bitmap bitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    int i5 = (i4 - i) / 2;
                    LIZ.setBounds(i5, i5, i2 + i5, i3 + i5);
                    LIZ.draw(canvas);
                    o.LJIIIIZZ(bitmap, "bitmap");
                    LJLJLLL = new BitmapDrawable(context.getResources(), bitmap);
                }
                Drawable drawable = LJLJLLL;
                PoiBasicInfo poiBasicInfo = t.basicInfo;
                if (poiBasicInfo != null) {
                    urlModel = poiBasicInfo.cover;
                } else {
                    urlModel = null;
                }
                W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                LJII.LJIILIIL = drawable;
                LJII.LJIILLIIL = drawable;
                LJII.LJIIZILJ = new ColorDrawable(intValue);
                LJII.LJJIIJ = this.LJLIL;
                C16880lQ.LLJJJ(LJII);
            }
            TuxTextView tuxTextView = this.LJLILLLLZI;
            String str5 = "";
            if (tuxTextView != null) {
                PoiBasicInfo poiBasicInfo2 = t.basicInfo;
                if (poiBasicInfo2 == null || (str = poiBasicInfo2.name) == null) {
                    str = "";
                }
                tuxTextView.setText(str);
            }
            TuxTextView tuxTextView2 = this.LJLJI;
            boolean z = false;
            if (tuxTextView2 != null) {
                List<String> list = t.subTags;
                if (list != null && !list.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z2 = true;
                    for (String str6 : list) {
                        if (str6 != null) {
                            if (!z2) {
                                sb2.append(" · ");
                            } else {
                                z2 = false;
                            }
                            sb2.append(str6);
                        }
                    }
                    if (sb2.length() > 0 && (sb = sb2.toString()) != null) {
                        str5 = sb;
                    }
                }
                tuxTextView2.setText(str5);
            }
            final TuxIconView tuxIconView = this.LJLJJI;
            if (tuxIconView != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onBindItemView set ");
                PoiBasicInfo poiBasicInfo3 = t.basicInfo;
                if (poiBasicInfo3 != null) {
                    bool = poiBasicInfo3.isCollected;
                } else {
                    bool = null;
                }
                LIZ2.append(bool);
                LIZ2.append(' ');
                X1D.LIZIZ(LIZ2);
                Context context2 = this.itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                PoiBasicInfo poiBasicInfo4 = t.basicInfo;
                if (poiBasicInfo4 != null) {
                    z = o.LJ(poiBasicInfo4.isCollected, Boolean.TRUE);
                }
                C193037hr.LIZIZ(context2, tuxIconView, z);
                Context context3 = this.itemView.getContext();
                o.LJIIIIZZ(context3, "itemView.context");
                final LifecycleOwner LIZIZ2 = C57434MgQ.LIZIZ(context3);
                if (LIZIZ2 != null) {
                    PoiBasicInfo poiBasicInfo5 = t.basicInfo;
                    if (poiBasicInfo5 != null) {
                        str3 = poiBasicInfo5.id;
                    } else {
                        str3 = null;
                    }
                    final ?? r5 = new InterfaceC190107d8() { // from class: X.7d7
                        @Override // X.InterfaceC190107d8
                        public final Boolean LIZ(String str7) {
                            List<PoiListApi.PoiYMALModel> list2;
                            String str8;
                            PoiBasicInfo poiBasicInfo6;
                            PoiDetailYmalViewModel poiDetailYmalViewModel = (PoiDetailYmalViewModel) PoiDetailYmalAssemV2.YmalPoiListItemCell.this.LJLJJL.getValue();
                            PoiBasicInfo poiBasicInfo7 = null;
                            if (str7 == null || (list2 = poiDetailYmalViewModel.LJLIL) == null) {
                                return null;
                            }
                            Iterator it = ((ArrayList) list2).iterator();
                            while (it.hasNext()) {
                                PoiListApi.PoiYMALModel poiYMALModel2 = (PoiListApi.PoiYMALModel) it.next();
                                if (poiYMALModel2 != null && (poiBasicInfo6 = poiYMALModel2.basicInfo) != null) {
                                    str8 = poiBasicInfo6.id;
                                } else {
                                    str8 = null;
                                }
                                if (o.LJ(str8, str7)) {
                                    if (poiYMALModel2 != null) {
                                        poiBasicInfo7 = poiYMALModel2.basicInfo;
                                    }
                                    return Boolean.valueOf(o.LJ(poiBasicInfo7.isCollected, Boolean.TRUE));
                                }
                            }
                            return null;
                        }
                    };
                    final AqS122S0300000_3 aqS122S0300000_3 = new AqS122S0300000_3(t, this, tuxIconView, 2);
                    C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.7dX
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (!RBW.LJLLI.LJI()) {
                                Fragment LIZLLL = C212428Vi.LIZLLL(LifecycleOwner.this);
                                final String str7 = str3;
                                J9P.LIZJ(LIZLLL, "poi_detail", "", null, new JJ4(str7) { // from class: X.7da
                                    @Override // X.JJ4
                                    public final void LIZ() {
                                    }

                                    @Override // X.JJ4
                                    public final void LIZIZ() {
                                    }
                                });
                                return;
                            }
                            C34K c34k = new C34K();
                            C34K c34k2 = new C34K();
                            C34K c34k3 = new C34K();
                            c34k3.element = o.LJ(r5.LIZ(str3), Boolean.TRUE);
                            final String str8 = str3;
                            TuxIconView tuxIconView2 = tuxIconView;
                            final AqS11S1400000_3 aqS11S1400000_3 = new AqS11S1400000_3(str8, aqS122S0300000_3, c34k, c34k2, c34k3, 0);
                            final AqS11S1400000_3 aqS11S1400000_32 = new AqS11S1400000_3(str3, aqS122S0300000_3, c34k, c34k2, c34k3, 1);
                            tuxIconView2.clearAnimation();
                            Animator animator = C193037hr.LIZIZ;
                            if (animator != null) {
                                animator.end();
                            }
                            C193037hr.LIZIZ = null;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxIconView2, "scaleX", 1.0f, 1.08f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tuxIconView2, "scaleY", 1.0f, 1.08f);
                            ofFloat.setDuration(100L);
                            ofFloat2.setDuration(100L);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tuxIconView2, "scaleX", 1.08f, 0.0f);
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tuxIconView2, "scaleY", 1.08f, 0.0f);
                            ofFloat3.setDuration(100L);
                            ofFloat4.setDuration(100L);
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(tuxIconView2, "alpha", 0.0f, 1.0f);
                            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(tuxIconView2, "alpha", 1.0f, 0.0f);
                            ofFloat6.setDuration(100L);
                            ofFloat5.setDuration(100L);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(ofFloat).with(ofFloat2);
                            animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat6).after(ofFloat);
                            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(tuxIconView2, "scaleX", 0.0f, 1.08f);
                            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(tuxIconView2, "scaleY", 0.0f, 1.08f);
                            ofFloat7.setDuration(100L);
                            ofFloat8.setDuration(100L);
                            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(tuxIconView2, "scaleX", 1.08f, 1.0f);
                            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(tuxIconView2, "scaleY", 1.08f, 1.0f);
                            ofFloat9.setDuration(100L);
                            ofFloat9.setDuration(100L);
                            final AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat5);
                            animatorSet2.play(ofFloat9).with(ofFloat10).after(ofFloat7);
                            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.7dY
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animation) {
                                    o.LJIIIZ(animation, "animation");
                                    super.onAnimationCancel(animation);
                                    InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = aqS11S1400000_32;
                                    if (interfaceC88472Yns != null) {
                                        interfaceC88472Yns.invoke(str8);
                                    }
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animation) {
                                    o.LJIIIZ(animation, "animation");
                                    C193037hr.LIZIZ = null;
                                    animatorSet2.start();
                                    InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = aqS11S1400000_3;
                                    if (interfaceC88472Yns != null) {
                                        interfaceC88472Yns.invoke(str8);
                                    }
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animation) {
                                    o.LJIIIZ(animation, "animation");
                                    C193037hr.LIZIZ = animation;
                                }
                            });
                            animatorSet2.addListener(new ALAdapterS0S0000000_3(0));
                            animatorSet.start();
                            String str9 = str3;
                            if (str9 == null) {
                                return;
                            }
                            C190377dZ c190377dZ = new C190377dZ(str9, aqS122S0300000_3, c34k2, c34k3, c34k);
                            boolean z3 = c34k3.element;
                            PoiListApi.LIZ.getClass();
                            C189927cq.LIZ().collectPoi(str9, !z3 ? 1 : 0).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS23S0110000_3(c190377dZ, z3, 5), new AfS23S0110000_3(c190377dZ, z3, 6));
                        }
                    }, tuxIconView);
                }
            }
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(t, 123), this.itemView);
            PoiBasicInfo poiBasicInfo6 = t.basicInfo;
            if (poiBasicInfo6 != null) {
                str2 = poiBasicInfo6.id;
                str4 = poiBasicInfo6.collectInfo;
            } else {
                str2 = null;
            }
            String str7 = t.trackInfo;
            if (str2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("poi_id", str2);
                linkedHashMap.put("enter_from", "poi_detail");
                C43001GuD.LIZJ(str4, linkedHashMap);
                C190397db.LIZ(str7, linkedHashMap);
                FMX.LJIIL("ymal_item_show", linkedHashMap);
            }
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup viewGroup) {
            return C1DI.LIZ(viewGroup, "parent", R.layout.c0v, viewGroup, false, "from(parent.context)\n   …_poi_list, parent, false)");
        }
    }

    public PoiDetailYmalAssemV2() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailYmalViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 764), C190037d1.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(PoiCollectStatusViewModel.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS153S0100000_3(LIZ2, 765), C190027d0.INSTANCE, null);
    }

    public final PoiDetailYmalViewModel O3() {
        return (PoiDetailYmalViewModel) this.LJLLI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        String c1 = ((InterfaceC189047bQ) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC189047bQ.class), null)).c1();
        if (c1 != null) {
            O3().gv0(c1);
        }
    }

    public final boolean N3() {
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        PoiListApi.PoiDetailResponse EO;
        Integer num;
        InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        if (LJIIZILJ != null && (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(LJIIZILJ, IPoiDetailInfoVAbility.class, null)) != null && (EO = iPoiDetailInfoVAbility.EO()) != null && o.LJ(EO.haveRegionDiscovery, Boolean.TRUE) && (num = PoiServerConfigSettings.LIZ().regionPoiDiscovery) != null && num.intValue() > 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
        YmalPoiListItemCell.LJLJLLL = null;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C187127Wa event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLILLLLZI;
        if (str != null && (!event.LJLJJLL)) {
            O3().hv0(str, event.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL syl = (SYL) view.findViewById(R.id.nkm);
        syl.setLifecycleOwner(this);
        syl.LLLF.LJZL(YmalPoiListItemCell.class);
        syl.getContext();
        syl.setLayoutManager(new LinearLayoutManager());
        syl.setItemAnimator(null);
        this.LJLLJ = syl;
        M3(false);
        C8YN.LJII(this, O3(), new TBT() { // from class: X.7d3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35Z) obj).LJLIL;
            }
        }, null, new AqS166S0200000_3(this, view, 11), 6);
        C34K c34k = new C34K();
        c34k.element = true;
        C8YN.LJII(this, this.LJLLILLLL.getValue(), new TBT() { // from class: X.7d2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C190187dG) obj).LJLIL);
            }
        }, null, new AqS122S0300000_3(this, c34k, view, 1), 6);
        String c1 = ((InterfaceC189047bQ) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC189047bQ.class), null)).c1();
        if (c1 != null) {
            O3().gv0(c1);
        }
    }

    public final void P3(final View view, boolean z) {
        String str;
        int i;
        PoiListApi.PoiDetailResponse EO;
        String str2 = null;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IPoiDetailInfoVAbility.class, null);
        if (iPoiDetailInfoVAbility != null) {
            str = iPoiDetailInfoVAbility.G20();
        } else {
            str = null;
        }
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility2 = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IPoiDetailInfoVAbility.class, null);
        if (iPoiDetailInfoVAbility2 != null && (EO = iPoiDetailInfoVAbility2.EO()) != null) {
            str2 = EO.collectInfo;
        }
        if (str != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("poi_id", str);
            linkedHashMap.put("enter_from", "poi_detail");
            C43001GuD.LIZJ(str2, linkedHashMap);
            FMX.LJIIL("show_ymal", linkedHashMap);
        }
        List<PoiListApi.PoiYMALModel> list = O3().LJLIL;
        if (list != null) {
            i = ((ArrayList) list).size();
        } else {
            i = 0;
        }
        final int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(((i - 1) * 16) + (i * 64) + 16 + 42)));
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setDuration(400L);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(new AUListenerS67S0101000_3(LJJIIZ, view, 2));
            valueAnimator.addListener(new Animator.AnimatorListener() { // from class: X.7cz
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                    view.getLayoutParams().height = LJJIIZ;
                    view.setAlpha(1.0f);
                    view.requestLayout();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                    PoiDetailYmalAssemV2.this.M3(true);
                    view.getLayoutParams().height = 0;
                    view.setAlpha(0.0f);
                    view.requestLayout();
                }
            });
            valueAnimator.start();
            return;
        }
        M3(true);
    }
}
