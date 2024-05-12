package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.ui.widget.AwemeListFragmentHelper$Companion$captureMobEvent$1", f = "AwemeListFragmentHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8aT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213938aT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ RecyclerView LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;
    public final /* synthetic */ C56473MEj LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ User LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C213938aT(RecyclerView recyclerView, Activity activity, Aweme aweme, C56473MEj c56473MEj, View view, int i, User user, InterfaceC67352kd<? super C213938aT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = activity;
        this.LJLJI = aweme;
        this.LJLJJI = c56473MEj;
        this.LJLJJL = view;
        this.LJLJJLL = i;
        this.LJLJL = user;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C213938aT(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ?? r4;
        ?? r13;
        float f;
        boolean z;
        int i;
        int i2;
        int i3;
        C141335gf.LIZJ(obj);
        RecyclerView recyclerView = this.LJLIL;
        Rect rect = new Rect();
        recyclerView.getGlobalVisibleRect(rect);
        int i4 = rect.top;
        int Pl = AwemeListFragmentImpl.Pl(this.LJLILLLLZI);
        int LJIIJJI = KL2.LJIIJJI(EF7.LIZIZ());
        int childCount = this.LJLIL.getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            RecyclerView recyclerView2 = this.LJLIL;
            RecyclerView.ViewHolder LJJJJJL = recyclerView2.LJJJJJL(recyclerView2.getChildAt(i5));
            if (LJJJJJL != null && (LJJJJJL instanceof MFV)) {
                MFV mfv = (MFV) LJJJJJL;
                Aweme aweme = mfv.LJLIL;
                o.LJIIIIZZ(aweme, "vh.aweme");
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                if (o.LJ(aid, this.LJLJI.getAid())) {
                    C56473MEj c56473MEj = this.LJLJJI;
                    RecyclerView recyclerView3 = this.LJLIL;
                    if (c56473MEj == null || recyclerView3 == null) {
                        r4 = C61878OQg.INSTANCE;
                    } else {
                        Rect rect2 = new Rect();
                        recyclerView3.getGlobalVisibleRect(rect2);
                        r4 = new ArrayList();
                        int childCount2 = recyclerView3.getChildCount();
                        int i6 = 0;
                        for (int i7 = 0; i7 < childCount2; i7++) {
                            RecyclerView.ViewHolder LJJJJJL2 = recyclerView3.LJJJJJL(recyclerView3.getChildAt(i7));
                            if (LJJJJJL2 != null) {
                                i6 = Math.max(LJJJJJL2.itemView.getHeight(), i6);
                            }
                        }
                        int childCount3 = recyclerView3.getChildCount();
                        for (int i8 = 0; i8 < childCount3; i8++) {
                            RecyclerView.ViewHolder LJJJJJL3 = recyclerView3.LJJJJJL(recyclerView3.getChildAt(i8));
                            if (LJJJJJL3 != null && (LJJJJJL3 instanceof MFV)) {
                                View view = LJJJJJL3.itemView;
                                o.LJIIIIZZ(view, "vh.itemView");
                                int i9 = rect2.top;
                                int i10 = rect2.bottom;
                                Rect LIZJ = C73098SmU.LIZJ(view);
                                if (LIZJ.top >= i9 && LIZJ.bottom <= i10 && LIZJ.height() >= i6 * 0.65f) {
                                    Aweme aweme2 = ((AbstractC208618Gr) LJJJJJL3).LJLIL;
                                    o.LJIIIIZZ(aweme2, "it.aweme");
                                    r4.add(aweme2);
                                }
                            }
                        }
                    }
                    C56473MEj c56473MEj2 = this.LJLJJI;
                    RecyclerView recyclerView4 = this.LJLIL;
                    if (c56473MEj2 == null || recyclerView4 == null) {
                        r13 = C61878OQg.INSTANCE;
                    } else {
                        Rect rect3 = new Rect();
                        recyclerView4.getGlobalVisibleRect(rect3);
                        r13 = new ArrayList();
                        int childCount4 = recyclerView4.getChildCount();
                        int i11 = 0;
                        for (int i12 = 0; i12 < childCount4; i12++) {
                            RecyclerView.ViewHolder LJJJJJL4 = recyclerView4.LJJJJJL(recyclerView4.getChildAt(i12));
                            if (LJJJJJL4 != null) {
                                i11 = Math.max(LJJJJJL4.itemView.getHeight(), i11);
                            }
                        }
                        int childCount5 = recyclerView4.getChildCount();
                        for (int i13 = 0; i13 < childCount5; i13++) {
                            RecyclerView.ViewHolder LJJJJJL5 = recyclerView4.LJJJJJL(recyclerView4.getChildAt(i13));
                            if (LJJJJJL5 != null && (LJJJJJL5 instanceof MFV)) {
                                View view2 = LJJJJJL5.itemView;
                                o.LJIIIIZZ(view2, "vh.itemView");
                                int i14 = rect3.top;
                                int i15 = rect3.bottom;
                                Rect LIZJ2 = C73098SmU.LIZJ(view2);
                                if (i15 - i14 >= i11 && LIZJ2.top >= i14 && LIZJ2.bottom <= i15 && LIZJ2.height() >= i11 * 0.65f && (LIZJ2.top == i14 || LIZJ2.height() >= i11 * 0.95d)) {
                                    Aweme aweme3 = ((AbstractC208618Gr) LJJJJJL5).LJLIL;
                                    o.LJIIIIZZ(aweme3, "it.aweme");
                                    r13.add(aweme3);
                                }
                            }
                        }
                    }
                    java.util.Set LJZI = ORZ.LJZI(r4, r13);
                    int layoutPosition = LJJJJJL.getLayoutPosition();
                    int height = this.LJLJJL.getHeight();
                    int i16 = C73098SmU.LIZJ(this.LJLJJL).top;
                    int i17 = C73098SmU.LIZJ(this.LJLJJL).bottom;
                    int i18 = C73098SmU.LIZJ(this.LJLJJL).right;
                    int i19 = C73098SmU.LIZJ(this.LJLJJL).left;
                    long playCount = aweme.getStatistics().getPlayCount();
                    long createTime = aweme.getCreateTime();
                    ArrayList arrayList = new ArrayList(C32I.LJJL(LJZI, 10));
                    Iterator it = LJZI.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((Aweme) it.next()).getStatistics().getPlayCount()));
                    }
                    int size = r4.size();
                    C56473MEj c56473MEj3 = this.LJLJJI;
                    RecyclerView recyclerView5 = this.LJLIL;
                    View view3 = this.LJLJJL;
                    if (c56473MEj3 == null || recyclerView5 == null) {
                        f = -2.0f;
                    } else {
                        Rect rect4 = new Rect();
                        Rect rect5 = new Rect();
                        view3.getGlobalVisibleRect(rect4);
                        recyclerView5.getGlobalVisibleRect(rect5);
                        int childCount6 = recyclerView5.getChildCount();
                        int i20 = 0;
                        for (int i21 = 0; i21 < childCount6; i21++) {
                            RecyclerView.ViewHolder LJJJJJL6 = recyclerView5.LJJJJJL(recyclerView5.getChildAt(i21));
                            if (LJJJJJL6 != null) {
                                i20 = Math.max(LJJJJJL6.itemView.getHeight(), i20);
                            }
                        }
                        f = 1 - (rect4.height() / i20);
                        if (rect4.bottom == rect5.bottom) {
                            f = -f;
                        }
                    }
                    boolean z2 = true;
                    if (aweme.getIsTop() == 1 && this.LJLJJLL == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    View view4 = mfv.LLFZ;
                    if (view4 == null || view4.getVisibility() != 0) {
                        z2 = false;
                    }
                    User user = this.LJLJL;
                    if (user != null) {
                        i = user.getFansCount();
                    } else {
                        i = 0;
                    }
                    User user2 = this.LJLJL;
                    if (user2 != null) {
                        i2 = user2.getFollowerCount();
                    } else {
                        i2 = 0;
                    }
                    User user3 = this.LJLJL;
                    if (user3 != null) {
                        i3 = user3.getVerificationBadgeType();
                    } else {
                        i3 = 0;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("video_height", height);
                        jSONObject.put("video_top_border", i16);
                        jSONObject.put("video_bottom_border", i17);
                        jSONObject.put("video_right_border", i18);
                        jSONObject.put("video_left_border", i19);
                        jSONObject.put("list_top_border", i4);
                        jSONObject.put("list_bottom_border", Pl);
                        jSONObject.put("screen_height", Pl);
                        jSONObject.put("screen_width", LJIIJJI);
                        jSONObject.put("author_fan_count", i);
                        jSONObject.put("author_follower_count", i2);
                        jSONObject.put("verification_badge_type", i3);
                        jSONObject.put("is_pinned", z);
                        jSONObject.put("adapter_position", layoutPosition);
                        jSONObject.put("play_count", playCount);
                        jSONObject.put("play_counts", arrayList);
                        jSONObject.put("creation_time", createTime);
                        jSONObject.put("number_of_visible_video_thumbnails", size);
                        jSONObject.put("occlusion", Float.valueOf(f));
                        jSONObject.put("just_watched", z2);
                    } catch (Exception unused) {
                    }
                    FMX.LJIILLIIL("profile_click_behavior_event", jSONObject);
                }
            }
            i5++;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
