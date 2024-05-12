package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3lc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93443lc extends ViewOnTouchListenerC93253lJ {
    public List<Integer> LJZI;
    public List<String> LJZL;
    public View LL;
    public C114144du LLD;
    public TextView LLF;
    public LinearLayoutManager LLFF;
    public C114134dt LLFFF;
    public final float LLFII;

    @Override // X.ViewOnTouchListenerC93253lJ
    public final void LIZJ() {
        this.LJLLI = (C101043xs) this.LJLILLLLZI.findViewById(R.id.l_2);
        this.LJLJLLL = (C73305Spp) this.LJLILLLLZI.findViewById(R.id.kf_);
        this.LJLL = (RecyclerView) this.LJLILLLLZI.findViewById(R.id.isd);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.LLFF = linearLayoutManager;
        RecyclerView recyclerView = this.LJLL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.LJLL;
        if (recyclerView2 != null) {
            final Activity activity = this.LJLIL;
            recyclerView2.LJIIJJI(new C73379Sr1(activity) { // from class: X.3le
                @Override // X.C73379Sr1, X.C0A6
                public final void LJIILJJIL(int i, RecyclerView rv) {
                    int i2;
                    o.LJIIIZ(rv, "rv");
                    super.LJIILJJIL(i, rv);
                    LinearLayoutManager linearLayoutManager2 = C93443lc.this.LLFF;
                    if (linearLayoutManager2 != null) {
                        i2 = linearLayoutManager2.LLILL();
                    } else {
                        i2 = -1;
                    }
                    AbstractC93453ld abstractC93453ld = C93443lc.this.LJLLJ;
                    o.LJII(abstractC93453ld, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.ui.adapter.IndexerListAdapter");
                    int sectionForPosition = ((C93433lb) abstractC93453ld).getSectionForPosition(i2);
                    List<String> list = C93443lc.this.LJZL;
                    if (list == null || list.isEmpty() || sectionForPosition < 0 || sectionForPosition >= list.size()) {
                        return;
                    }
                    C114144du c114144du = C93443lc.this.LLD;
                    if (c114144du != null) {
                        c114144du.setCurrentIndex((String) ListProtector.get(list, sectionForPosition));
                    } else {
                        o.LJIJI("mIndexView");
                        throw null;
                    }
                }

                @Override // X.C73379Sr1, X.C0A6
                public final void LJIILL(RecyclerView rv, int i, int i2) {
                    o.LJIIIZ(rv, "rv");
                    super.LJIILL(rv, i, i2);
                    if (i2 > KL2.LIZJ(C93443lc.this.LJLIL, 10.0f)) {
                        C93443lc c93443lc = C93443lc.this;
                        AYA.LIZ(c93443lc.LJLIL, c93443lc.LJLJL);
                    }
                }
            });
        }
        RecyclerView recyclerView3 = this.LJLL;
        if (recyclerView3 != null) {
            recyclerView3.LJIIJ(new C0A5() { // from class: X.3li
                @Override // X.C0A5
                public final void LIZ(RecyclerView rv, MotionEvent motionEvent) {
                    o.LJIIIZ(rv, "rv");
                    o.LJIIIZ(motionEvent, "motionEvent");
                }

                @Override // X.C0A5
                public final void LIZIZ(boolean z) {
                }

                @Override // X.C0A5
                public final boolean LIZJ(RecyclerView rv, MotionEvent motionEvent) {
                    o.LJIIIZ(rv, "rv");
                    o.LJIIIZ(motionEvent, "motionEvent");
                    if (motionEvent.getY() < C93443lc.this.LLFII) {
                        return true;
                    }
                    return false;
                }
            });
        }
        View findViewById = this.LJLILLLLZI.findViewById(R.id.jgb);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.search_layout)");
        this.LL = findViewById;
        EditText editText = (EditText) findViewById.findViewById(R.id.jf9);
        this.LJLJL = editText;
        if (editText != null) {
            editText.setTag("relation_search_tag");
        }
        EditText editText2 = this.LJLJL;
        if (editText2 != null) {
            editText2.setHint(R.string.h1b);
        }
        View view = this.LL;
        if (view != null) {
            this.LJLJLJ = (ImageView) view.findViewById(R.id.avg);
            View findViewById2 = this.LJLILLLLZI.findViewById(R.id.el2);
            o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.index_view)");
            this.LLD = (C114144du) findViewById2;
            View findViewById3 = this.LJLILLLLZI.findViewById(R.id.eky);
            o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.index_letter_tv)");
            this.LLF = (TextView) findViewById3;
            C114144du c114144du = this.LLD;
            if (c114144du != null) {
                c114144du.setOnLetterTouchListener(new InterfaceC93543lm() { // from class: X.3lg
                    @Override // X.InterfaceC93543lm
                    public final void LIZ(int i) {
                        AbstractC93453ld abstractC93453ld = C93443lc.this.LJLLJ;
                        o.LJII(abstractC93453ld, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.ui.adapter.IndexerListAdapter");
                        int positionForSection = ((C93433lb) abstractC93453ld).getPositionForSection(i);
                        C93443lc c93443lc = C93443lc.this;
                        AbstractC93453ld abstractC93453ld2 = c93443lc.LJLLJ;
                        LinearLayoutManager linearLayoutManager2 = c93443lc.LLFF;
                        if (linearLayoutManager2 != null) {
                            linearLayoutManager2.LJFF(positionForSection, 0);
                        }
                        FMX.onEventV3("index_bar_click");
                    }
                });
                C114144du c114144du2 = this.LLD;
                if (c114144du2 != null) {
                    TextView textView = this.LLF;
                    if (textView != null) {
                        c114144du2.setIndexLetterTv(textView);
                        return;
                    } else {
                        o.LJIJI("mIndexLetterTv");
                        throw null;
                    }
                }
                o.LJIJI("mIndexView");
                throw null;
            }
            o.LJIJI("mIndexView");
            throw null;
        }
        o.LJIJI("mSearchBar");
        throw null;
    }

    @Override // X.ViewOnTouchListenerC93253lJ
    public final void LIZIZ() {
        super.LIZIZ();
        AbstractC93453ld abstractC93453ld = this.LJLLJ;
        if (abstractC93453ld != null) {
            abstractC93453ld.LJLJLLL = null;
        }
    }

    @Override // X.ViewOnTouchListenerC93253lJ
    public final void LJIIJJI() {
        super.LJIIJJI();
        if (this.LJLJJLL) {
            C114144du c114144du = this.LLD;
            if (c114144du != null) {
                c114144du.setVisibility(8);
                return;
            } else {
                o.LJIJI("mIndexView");
                throw null;
            }
        }
        C114144du c114144du2 = this.LLD;
        if (c114144du2 != null) {
            c114144du2.setIndexLetters(this.LJZL);
            C114144du c114144du3 = this.LLD;
            if (c114144du3 != null) {
                c114144du3.setVisibility(0);
                return;
            } else {
                o.LJIJI("mIndexView");
                throw null;
            }
        }
        o.LJIJI("mIndexView");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.4dt, X.09z] */
    @Override // X.ViewOnTouchListenerC93253lJ
    public final void LJFF(List<? extends IMContact> contactList) {
        RecyclerView recyclerView;
        o.LJIIIZ(contactList, "contactList");
        this.LJLJJLL = false;
        final List<String> list = this.LJZL;
        final List<Integer> list2 = this.LJZI;
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return;
        }
        final int[] iArr = new int[list2.size()];
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Number) ListProtector.get(list2, i)).intValue();
        }
        final String[] strArr = (String[]) list.toArray(new String[0]);
        SectionIndexer sectionIndexer = new SectionIndexer(iArr, strArr) { // from class: X.3lf
            public final String[] LJLIL;
            public final int[] LJLILLLLZI;
            public final int LJLJI;

            @Override // android.widget.SectionIndexer
            public final /* bridge */ /* synthetic */ Object[] getSections() {
                return this.LJLIL;
            }

            @Override // android.widget.SectionIndexer
            public final int getPositionForSection(int i2) {
                if (i2 < 0 || i2 >= this.LJLIL.length) {
                    return -1;
                }
                return this.LJLILLLLZI[i2];
            }

            @Override // android.widget.SectionIndexer
            public final int getSectionForPosition(int i2) {
                if (i2 < 0 || i2 >= this.LJLJI) {
                    return -1;
                }
                int binarySearch = Arrays.binarySearch(this.LJLILLLLZI, i2);
                if (binarySearch >= 0) {
                    return binarySearch;
                }
                return (-binarySearch) - 2;
            }

            {
                int i2;
                boolean z;
                o.LJIIIZ(strArr, "sections");
                int min = Math.min(strArr.length, iArr.length);
                this.LJLIL = strArr;
                this.LJLILLLLZI = new int[min];
                int i3 = 0;
                for (int i4 = 0; i4 < min; i4++) {
                    if (TextUtils.isEmpty(this.LJLIL[i4])) {
                        this.LJLIL[i4] = " ";
                    } else if (!o.LJ(this.LJLIL[i4], " ")) {
                        String[] strArr2 = this.LJLIL;
                        String str = strArr2[i4];
                        int length = str.length() - 1;
                        int i5 = 0;
                        boolean z2 = false;
                        while (i5 <= length) {
                            if (!z2) {
                                i2 = i5;
                            } else {
                                i2 = length;
                            }
                            if (o.LJIIJJI(str.charAt(i2), 32) <= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z2) {
                                if (!z) {
                                    z2 = true;
                                } else {
                                    i5++;
                                }
                            } else if (!z) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        strArr2[i4] = C132805Jc.LIZJ(length, 1, str, i5);
                    }
                    this.LJLILLLLZI[i4] = i3;
                    i3 += iArr[i4];
                }
                this.LJLJI = i3;
            }
        };
        AbstractC93453ld abstractC93453ld = this.LJLLJ;
        o.LJII(abstractC93453ld, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.ui.adapter.IndexerListAdapter");
        C93433lb c93433lb = (C93433lb) abstractC93453ld;
        c93433lb.LJLLJ = sectionIndexer;
        c93433lb.LJLLL.LIZ = -1;
        AbstractC93453ld abstractC93453ld2 = this.LJLLJ;
        if (abstractC93453ld2 != null) {
            abstractC93453ld2.LL(contactList);
        }
        C114134dt c114134dt = this.LLFFF;
        if (c114134dt != null && (recyclerView = this.LJLL) != null) {
            recyclerView.LJJLIL(c114134dt);
        }
        final Activity activity = this.LJLIL;
        ?? r1 = new AbstractC030309z(activity, list, list2) { // from class: X.4dt
            public final Context LJLIL;
            public final float LJLILLLLZI;
            public final Paint LJLJI;
            public final Paint LJLJJI;
            public final int LJLJJL;
            public final int LJLJJLL;
            public final float LJLJL;
            public final Rect LJLJLJ;
            public String LJLJLLL;
            public final List<String> LJLL;
            public final List<Integer> LJLLI;
            public final int LJLLILLLL = -1;

            @Override // X.AbstractC030309z
            public final void LJFF(Canvas canvas, RecyclerView recyclerView2, C0AC c0ac) {
            }

            public final String LJII(int i2) {
                String str;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= this.LJLLI.size()) {
                        break;
                    }
                    i4 += ((Integer) ListProtector.get(this.LJLLI, i3)).intValue();
                    if (i2 < i4) {
                        if (i3 != -1) {
                            str = (String) ListProtector.get(this.LJLL, i3);
                        }
                    } else {
                        i3++;
                    }
                }
                str = null;
                if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.LJLJLLL)) {
                    str = this.LJLJLLL;
                }
                if ("recent".equals(str)) {
                    str = this.LJLIL.getString(R.string.h8e);
                } else if ("Friend".equals(str)) {
                    str = this.LJLIL.getString(R.string.h7h);
                } else if (i2 == 0) {
                    int i5 = this.LJLLILLLL;
                    if (i5 == 0) {
                        str = this.LJLIL.getString(R.string.h5v);
                    } else if (i5 == -1 || i5 == 1) {
                        str = this.LJLIL.getString(R.string.h7g);
                    }
                }
                this.LJLJLLL = str;
                return str;
            }

            {
                this.LJLIL = activity;
                activity.getResources();
                this.LJLILLLLZI = KL2.LIZJ(activity, 32.0f);
                this.LJLJI = new Paint();
                Paint paint = new Paint(1);
                this.LJLJJI = paint;
                paint.setColor(C79045V0n.LJI(R.attr.gv, activity).intValue());
                paint.setTextSize(KL2.LIZJ(activity, 13.0f));
                paint.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                float f = fontMetrics.bottom;
                this.LJLJJL = (int) (f - fontMetrics.top);
                this.LJLJJLL = ((int) f) - ((int) KL2.LIZJ(activity, 8.0f));
                this.LJLJL = KL2.LIZJ(activity, 16.0f);
                this.LJLJLJ = new Rect();
                KL2.LIZJ(activity, 2.0f);
                int LIZJ = (int) KL2.LIZJ(activity, 16.0f);
                new Rect(0, 0, LIZJ, LIZJ);
                this.LJLL = list;
                this.LJLLI = list2;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
            /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
            @Override // X.AbstractC030309z
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJI(android.graphics.Canvas r16, androidx.recyclerview.widget.RecyclerView r17, X.C0AC r18) {
                /*
                    Method dump skipped, instructions count: 227
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C114134dt.LJI(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, X.0AC):void");
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view, RecyclerView recyclerView2, C0AC c0ac) {
                super.LJ(rect, view, recyclerView2, c0ac);
            }
        };
        this.LLFFF = r1;
        RecyclerView recyclerView2 = this.LJLL;
        if (recyclerView2 != 0) {
            recyclerView2.LJII(r1, -1);
        }
        LJIIJJI();
    }

    @Override // X.ViewOnTouchListenerC93253lJ
    public final void LJI(List<Integer> list, List<String> list2) {
        this.LJZI = list;
        this.LJZL = list2;
    }

    @Override // X.ViewOnTouchListenerC93253lJ
    public final void LJII(CharSequence keywords, List contactList) {
        RecyclerView recyclerView;
        o.LJIIIZ(contactList, "contactList");
        o.LJIIIZ(keywords, "keywords");
        this.LJLJJLL = true;
        C114134dt c114134dt = this.LLFFF;
        if (c114134dt != null && (recyclerView = this.LJLL) != null) {
            recyclerView.LJJLIL(c114134dt);
        }
        AbstractC93453ld abstractC93453ld = this.LJLLJ;
        if (abstractC93453ld != null) {
            abstractC93453ld.LJLIL = 1;
            abstractC93453ld.LJLJJL = keywords.toString();
            ((ArrayList) abstractC93453ld.LJLJI).clear();
            ((ArrayList) abstractC93453ld.LJLJI).addAll(contactList);
            abstractC93453ld.notifyDataSetChanged();
        }
        LJIIJJI();
    }

    public C93443lc(ActivityC45651qj activityC45651qj, View view, boolean z, List list, List list2) {
        super(activityC45651qj, view, z);
        this.LJZI = list;
        this.LJZL = list2;
        this.LLFII = KL2.LIZJ(activityC45651qj, 32.0f);
    }
}
