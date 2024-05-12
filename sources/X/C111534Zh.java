package X;

import Y.AObserverS69S0100000_1;
import Y.AUListenerS90S0100000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.emoji2.text.f;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS91S0101000_1;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.4Zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111534Zh extends FrameLayout {
    public static final C111544Zi LJLLLL = new Object() { // from class: X.4Zi
    };
    public static final String[] LJLLLLLL = {"😁", "🥰", "😂", "😳", "😏", "😅", "🥺", "😌", "😬", "😊", "😎"};
    public final ViewGroup LJLIL;
    public C1801275c LJLILLLLZI;
    public EditText LJLJI;
    public int LJLJJI;
    public InterfaceC1801475e LJLJJL;
    public InterfaceC1793272a LJLJJLL;
    public final List<C105454Bx> LJLJL;
    public List<? extends C105454Bx> LJLJLJ;
    public final java.util.Set<String> LJLJLLL;
    public int LJLL;
    public View LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public C106634Gl LJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C111534Zh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    private final int getMiniEmojiNum() {
        int i = C53946LFe.LIZJ(null, null).LIZIZ;
        int emojiRectWidth = getEmojiRectWidth();
        int emojiMinSpace = getEmojiMinSpace();
        int i2 = 2;
        int emojiPanelMarginEdge = ((i - (getEmojiPanelMarginEdge() * 2)) + emojiMinSpace) / (emojiRectWidth + emojiMinSpace);
        if (emojiPanelMarginEdge >= Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else if (emojiPanelMarginEdge > 1) {
            i2 = emojiPanelMarginEdge;
        }
        return Math.min(i2, ((ArrayList) this.LJLJL).size());
    }

    public final void LIZ() {
        View view;
        ViewGroup viewGroup;
        if (this.LJLIL == null) {
            return;
        }
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new C1801275c(this.LJLJI, this.LJLJJI, this.LJLJJL);
        }
        if (this.LJLJLLL.size() == 0) {
            C4VN.LIZ();
            List LIZIZ = C110154Tz.LIZIZ(2);
            if (LIZIZ == null || LIZIZ.isEmpty()) {
                ViewGroup viewGroup2 = this.LJLIL;
                if (viewGroup2 != null && viewGroup2.getVisibility() == 0 && (viewGroup = this.LJLIL) != null) {
                    viewGroup.setVisibility(4);
                }
            } else {
                Iterator it = LIZIZ.iterator();
                while (it.hasNext()) {
                    String previewEmoji = ((ImSysEmojiModel) it.next()).getPreviewEmoji();
                    if (previewEmoji != null) {
                        this.LJLJLLL.add(previewEmoji);
                    }
                }
            }
        }
        String[] strArr = LJLLLLLL;
        ArrayList arrayList = new ArrayList(C47261Igj.LJJIJIIJI(Arrays.copyOf(strArr, strArr.length)));
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (this.LJLJLLL.contains(next)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            C105454Bx c105454Bx = new C105454Bx();
            c105454Bx.LIZIZ = str;
            c105454Bx.LJI = new CommentPersonalizedEmoji(str, 0, "", "exposed_emoji");
            arrayList3.add(c105454Bx);
        }
        this.LJLJLJ = arrayList3;
        LIZLLL();
        int miniEmojiNum = getMiniEmojiNum();
        if (((ArrayList) this.LJLJL).isEmpty()) {
            return;
        }
        C106634Gl c106634Gl = new C106634Gl(this.LJLILLLLZI, this.LJLIL, ((ArrayList) this.LJLJL).subList(0, miniEmojiNum), new C4JP(miniEmojiNum, new AqS91S0101000_1(this, miniEmojiNum, 6)), miniEmojiNum, C7MY.LIZIZ(25), 2);
        c106634Gl.LJLIL.setId(R.id.d24);
        this.LJLLL = c106634Gl;
        ViewGroup viewGroup3 = this.LJLIL;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        ViewGroup viewGroup4 = this.LJLIL;
        if (viewGroup4 == null) {
            return;
        }
        C106634Gl c106634Gl2 = this.LJLLL;
        if (c106634Gl2 != null) {
            view = c106634Gl2.LJLIL;
        } else {
            view = null;
        }
        viewGroup4.addView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public final void LIZLLL() {
        ?? r4;
        List<CommentPersonalizedEmoji> wj;
        ((ArrayList) this.LJLJL).clear();
        InterfaceC1793272a interfaceC1793272a = this.LJLJJLL;
        if (interfaceC1793272a != null && (wj = interfaceC1793272a.wj()) != null) {
            ArrayList arrayList = new ArrayList();
            for (CommentPersonalizedEmoji commentPersonalizedEmoji : wj) {
                CommentPersonalizedEmoji commentPersonalizedEmoji2 = commentPersonalizedEmoji;
                if (!f.LIZJ()) {
                    if (ORZ.LJLJJI(commentPersonalizedEmoji2.getEmoji(), this.LJLJLLL)) {
                    }
                }
                arrayList.add(commentPersonalizedEmoji);
            }
            r4 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CommentPersonalizedEmoji commentPersonalizedEmoji3 = (CommentPersonalizedEmoji) it.next();
                C105454Bx c105454Bx = new C105454Bx();
                c105454Bx.LIZIZ = commentPersonalizedEmoji3.getEmoji();
                c105454Bx.LJI = CommentPersonalizedEmoji.copy$default(commentPersonalizedEmoji3, null, null, null, "exposed_emoji", 7, null);
                r4.add(c105454Bx);
            }
        } else {
            r4 = C61878OQg.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(r4);
        arrayList2.addAll(this.LJLJLJ);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((C105454Bx) next).LIZIZ)) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            C105454Bx c105454Bx2 = (C105454Bx) next2;
            if (!C118824lS.LIZ(c105454Bx2.LIZIZ)) {
                String str = c105454Bx2.LIZIZ;
                o.LJIIIIZZ(str, "it.text");
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("emoji_id", str);
                FMX.LJIIL("emoji_exception", c188727au.LIZ);
            } else {
                arrayList4.add(next2);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("personalized size: ");
        LIZ.append(r4.size());
        LIZ.append("; default emoji size: ");
        LIZ.append(this.LJLJLJ.size());
        LIZ.append("; mini emoji data size: ");
        LIZ.append(arrayList4.size());
        C71Y.LIZLLL("HorizontalEmojiMiniPanel", X1D.LIZIZ(LIZ));
        ((ArrayList) this.LJLJL).addAll(arrayList4);
    }

    public final void LJFF() {
        if (!this.LJLLJ) {
            return;
        }
        C71Y.LIZLLL("HorizontalEmojiMiniPanel", "update mini emoji panel");
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null && viewGroup.findViewById(R.id.d24) != null && this.LJLLL != null) {
            LIZLLL();
            C106634Gl c106634Gl = this.LJLLL;
            if (c106634Gl != null) {
                List subList = ((ArrayList) this.LJLJL).subList(0, getMiniEmojiNum());
                C106604Gi c106604Gi = c106634Gl.LJLJJI;
                c106604Gi.LJLJJI.clear();
                if (subList != null) {
                    c106604Gi.LJLJJI.addAll(subList);
                }
                c106604Gi.notifyDataSetChanged();
                return;
            }
            return;
        }
        LIZ();
    }

    public final int getEmojiMinSpace() {
        return (int) KL2.LIZJ(getContext(), 12.0f);
    }

    public final int getEmojiPanelMarginEdge() {
        return (int) KL2.LIZJ(getContext(), 10.0f);
    }

    public final int getEmojiRectWidth() {
        return (int) KL2.LIZJ(getContext(), 40.0f);
    }

    public final String getMEnterFrom() {
        return this.LJLLILLLL;
    }

    public final void LIZJ(boolean z) {
        if (!this.LJLLJ) {
            return;
        }
        this.LJLLJ = false;
        if (!z) {
            setViewHeight(0);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.LJLL, 0);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new AUListenerS90S0100000_1(this, 8));
        ofInt.start();
    }

    public final void LJ(boolean z) {
        if (this.LJLLJ) {
            return;
        }
        this.LJLLJ = true;
        if (!z) {
            setViewHeight(this.LJLL);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.LJLL);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new AUListenerS90S0100000_1(this, 9));
        ofInt.start();
    }

    public final void setMEnterFrom(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLLILLLL = str;
    }

    public final void setViewHeight(int i) {
        View view = this.LJLLI;
        if (view != null) {
            C78886Uxe.LJJLIIIJ(i, view);
        } else {
            C78886Uxe.LJJLIIIJ(i, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C111534Zh(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.LJLJL = r0
            X.OQg r0 = X.C61878OQg.INSTANCE
            r1.LJLJLJ = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.LJLJLLL = r0
            r0 = 40
            int r0 = X.C7MY.LIZIZ(r0)
            r1.LJLL = r0
            java.lang.String r0 = ""
            r1.LJLLILLLL = r0
            r0 = 2131558929(0x7f0d0211, float:1.8743188E38)
            android.widget.FrameLayout.inflate(r2, r0, r1)
            r0 = 2131366293(0x7f0a1195, float:1.8352475E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.LJLIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111534Zh.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LIZIZ(View view, C224748ru editText, int i, InterfaceC1801475e interfaceC1801475e, InterfaceC1793272a interfaceC1793272a, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(editText, "editText");
        this.LJLLI = view;
        this.LJLJI = editText;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC1801475e;
        this.LJLJJLL = interfaceC1793272a;
        if (view != null) {
            this.LJLL = C47959Irz.LIZJ(8, this.LJLL);
        }
        this.LJLLJ = true;
        LIZ();
        if (lifecycleOwner != null) {
            a.LJFF().LJFF().observe(lifecycleOwner, new AObserverS69S0100000_1(this, 109));
        }
    }
}
