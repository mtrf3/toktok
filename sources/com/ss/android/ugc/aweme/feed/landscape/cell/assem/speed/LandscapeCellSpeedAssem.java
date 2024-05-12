package com.ss.android.ugc.aweme.feed.landscape.cell.assem.speed;

import X.C125314vv;
import X.C16880lQ;
import X.C188727au;
import X.C188927bE;
import X.C188947bG;
import X.C18950ol;
import X.C208088Eq;
import X.C214348b8;
import X.C2K0;
import X.C32151Nz;
import X.C47261Igj;
import X.C51029K0z;
import X.C55096Ljo;
import X.C5H3;
import X.C65352Pkq;
import X.C79004UzY;
import X.C8D3;
import X.C8L3;
import X.C8L7;
import X.C8L8;
import X.C90193gN;
import X.FFL;
import X.FMX;
import X.InterfaceC55102Lju;
import X.O6R;
import Y.ACListenerS23S0100000_3;
import Y.ALAdapterS2S0100000_3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiments.LandscapeOptExperiment;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.ICellSpeedActionAbility;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.seekbar.LandscapeCellSeekBarVM;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.top.TopAreaContainerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeCellSpeedAssem extends FeedBaseContentAssem implements ICellSpeedActionAbility, InterfaceC55102Lju {
    public static final List<Float> LLIIII = C47261Igj.LJJIJIL(Float.valueOf(2.0f), Float.valueOf(1.5f), Float.valueOf(1.25f), Float.valueOf(1.0f), Float.valueOf(0.75f));
    public static final float LLIIIILZ;
    public View LJZL;
    public RecyclerView LL;
    public C188927bE LLD;
    public AnimatorSet LLF;
    public AnimatorSet LLFF;
    public ArrayList<C188947bG> LLFFF;
    public final float LLFII;
    public final C5H3 LLFZ;
    public final C5H3 LLI;
    public final boolean LLIFFJFJJ;
    public VideoItemParams LLII;

    static {
        int i;
        if (C208088Eq.LIZ() && C8D3.LIZIZ()) {
            i = 10;
        } else {
            i = 54;
        }
        LLIIIILZ = C32151Nz.LJIIZILJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 280727298) {
            return null;
        }
        return this;
    }

    public LandscapeCellSpeedAssem() {
        boolean z;
        new LinkedHashMap();
        this.LLFII = 1.0f;
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(TopAreaContainerVM.class), C8L3.INSTANCE);
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(LandscapeCellSeekBarVM.class), C8L8.INSTANCE);
        FFL LJIIIZ = FFL.LJIIIZ();
        LandscapeOptExperiment.LandscapeOptFeature landscapeOptFeature = LandscapeOptExperiment.LIZ;
        LJIIIZ.getClass();
        LandscapeOptExperiment.LandscapeOptFeature landscapeOptFeature2 = (LandscapeOptExperiment.LandscapeOptFeature) FFL.LJIJ(true, "landscape_feed_optimization", 31744, LandscapeOptExperiment.LandscapeOptFeature.class, landscapeOptFeature);
        if (landscapeOptFeature2 != null) {
            z = landscapeOptFeature2.lazyLoadSpeedSelector;
        } else {
            z = false;
        }
        this.LLIFFJFJJ = z;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.ICellSpeedActionAbility
    public final void Q40() {
        String str;
        VideoItemParams videoItemParams;
        if (this.LLIFFJFJJ && (videoItemParams = this.LLII) != null) {
            F0(videoItemParams);
        }
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        String str2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType;
        Context context = getContext();
        if (aweme != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str2);
            c188727au.LJIIIZ("group_id", aweme.getAid());
            c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
            c188727au.LIZLLL(C79004UzY.LJJJIL(context, aweme), "is_landscape_screen");
            c188727au.LJIIIZ("enter_method", "click_landscape_screen_button");
            if (aweme.isPaidContent) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("is_collection_item", str);
            FMX.LJIIL("click_video_speed", c188727au.LIZ);
        }
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.setTranslationX(0.0f);
            AnimatorSet animatorSet = this.LLF;
            if (animatorSet != null) {
                animatorSet.start();
                View view = this.LJZL;
                if (view != null) {
                    view.setVisibility(0);
                    View view2 = this.LJZL;
                    if (view2 != null) {
                        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 83), view2);
                        return;
                    } else {
                        o.LJIJI("rootView");
                        throw null;
                    }
                }
                o.LJIJI("rootView");
                throw null;
            }
            o.LJIJI("showAnimSet");
            throw null;
        }
        o.LJIJI("speedActionView");
        throw null;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    /* renamed from: Z3, reason: merged with bridge method [inline-methods] */
    public final void F0(VideoItemParams item) {
        ArrayList<C188947bG> arrayList;
        o.LJIIIZ(item, "item");
        if (this.LLIFFJFJJ && this.LLII == null) {
            this.LLII = item;
            return;
        }
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.feed.landscape.cell.assem.speed.LandscapeCellSpeedAssem$onBind$linearLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final boolean LJIL() {
                return false;
            }
        };
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LiveCoverMinSizeSetting.DEFAULT)));
            RecyclerView recyclerView2 = this.LL;
            if (recyclerView2 != null) {
                recyclerView2.getLayoutParams().height = LJJIIZ;
                Context context = getContext();
                if (context != null && (arrayList = this.LLFFF) != null) {
                    this.LLD = new C188927bE(context, arrayList);
                    Object LLILL = C16880lQ.LLILL(context, "vibrator");
                    o.LJII(LLILL, "null cannot be cast to non-null type android.os.Vibrator");
                    Vibrator vibrator = (Vibrator) LLILL;
                    C188927bE c188927bE = this.LLD;
                    if (c188927bE != null) {
                        c188927bE.LJLJJI = new C8L7(this, item, context, vibrator);
                        c188927bE.LJLJI = LJJIIZ;
                    }
                    RecyclerView recyclerView3 = this.LL;
                    if (recyclerView3 != null) {
                        recyclerView3.setAdapter(c188927bE);
                        return;
                    } else {
                        o.LJIJI("speedActionView");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("speedActionView");
            throw null;
        }
        o.LJIJI("speedActionView");
        throw null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        float f;
        float f2;
        o.LJIIIZ(view, "view");
        this.LJZL = view;
        View findViewById = view.findViewById(R.id.k_7);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.speed_action_rv)");
        this.LL = (RecyclerView) findViewById;
        ArrayList<C188947bG> arrayList = new ArrayList<>();
        int size = LLIIII.size();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= size) {
                break;
            }
            List<Float> list = LLIIII;
            String LIZ = C125314vv.LIZ(((Number) ListProtector.get(list, i)).floatValue());
            if (((Number) ListProtector.get(list, i)).floatValue() != this.LLFII) {
                z = false;
            }
            arrayList.add(new C188947bG(LIZ, z));
            i++;
        }
        this.LLFFF = arrayList;
        boolean LIZIZ = C90193gN.LIZIZ(getContext());
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(recyclerView, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(80L);
            ofFloat.setInterpolator(C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
            RecyclerView recyclerView2 = this.LL;
            if (recyclerView2 != null) {
                float[] fArr = new float[1];
                if (LIZIZ) {
                    f = LLIIIILZ;
                } else {
                    f = -LLIIIILZ;
                }
                fArr[0] = f;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(recyclerView2, "translationX", fArr);
                ofFloat2.setDuration(100L);
                ofFloat2.setInterpolator(C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat2, ofFloat);
                this.LLF = animatorSet;
                RecyclerView recyclerView3 = this.LL;
                if (recyclerView3 != null) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(recyclerView3, "alpha", 1.0f, 0.0f);
                    ofFloat3.setDuration(80L);
                    ofFloat3.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
                    RecyclerView recyclerView4 = this.LL;
                    if (recyclerView4 != null) {
                        float[] fArr2 = new float[1];
                        if (LIZIZ) {
                            f2 = -LLIIIILZ;
                        } else {
                            f2 = LLIIIILZ;
                        }
                        fArr2[0] = f2;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(recyclerView4, "translationX", fArr2);
                        ofFloat4.setDuration(100L);
                        ofFloat4.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.setStartDelay(100L);
                        animatorSet2.playTogether(ofFloat4, ofFloat3);
                        animatorSet2.addListener(new ALAdapterS2S0100000_3(this, 4));
                        this.LLFF = animatorSet2;
                        return;
                    }
                    o.LJIJI("speedActionView");
                    throw null;
                }
                o.LJIJI("speedActionView");
                throw null;
            }
            o.LJIJI("speedActionView");
            throw null;
        }
        o.LJIJI("speedActionView");
        throw null;
    }
}
