package X;

import Y.IDCListenerS135S0100000;
import Y.IDCListenerS250S0100000;
import Y.IDCListenerS370S0100000;
import Y.IDObjectS173S0100000;
import Y.IDRunnableS85S0100000;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView$SavedState;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o3.h0;

/* renamed from: X.195, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass195 extends LinearLayoutCompat implements InterfaceC25590zT {
    public static final C011302r LLJIJIL;
    public final AnonymousClass194 LJLLLLLL;
    public final View LJLZ;
    public final View LJZ;
    public final View LJZI;
    public final ImageView LJZL;
    public final ImageView LL;
    public final ImageView LLD;
    public final ImageView LLF;
    public final View LLFF;
    public C011402s LLFFF;
    public final Rect LLFII;
    public final Rect LLFZ;
    public final int[] LLI;
    public final int[] LLIFFJFJJ;
    public final ImageView LLII;
    public final Drawable LLIIII;
    public final int LLIIIILZ;
    public final int LLIIIJ;
    public final Intent LLIIIL;
    public final Intent LLIIIZ;
    public final CharSequence LLIIJI;
    public View.OnFocusChangeListener LLIIJLIL;
    public View.OnClickListener LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public AbstractC37571dh LLIIZ;
    public boolean LLIL;
    public CharSequence LLILII;
    public boolean LLILIL;
    public boolean LLILL;
    public int LLILLIZIL;
    public boolean LLILLJJLI;
    public CharSequence LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public SearchableInfo LLILZLL;
    public Bundle LLIZ;
    public final IDRunnableS85S0100000 LLIZLLLIL;
    public final IDRunnableS85S0100000 LLJ;
    public final WeakHashMap<String, Drawable.ConstantState> LLJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.LLILL = true;
        super.clearFocus();
        this.LJLLLLLL.clearFocus();
        this.LJLLLLLL.setImeVisibility(false);
        this.LLILL = false;
    }

    public void setOnCloseListener(InterfaceC011002o interfaceC011002o) {
    }

    public void setOnQueryTextListener(InterfaceC011102p interfaceC011102p) {
    }

    public void setOnSuggestionListener(InterfaceC011202q interfaceC011202q) {
    }

    static {
        C011302r c011302r;
        if (Build.VERSION.SDK_INT < 29) {
            c011302r = new C011302r();
        } else {
            c011302r = null;
        }
        LLJIJIL = c011302r;
    }

    public final void LJIIJJI() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.LJLLLLLL.refreshAutoCompleteResults();
            return;
        }
        C011302r c011302r = LLJIJIL;
        AnonymousClass194 anonymousClass194 = this.LJLLLLLL;
        c011302r.getClass();
        C011302r.LIZ();
        Method method = c011302r.LIZ;
        if (method != null) {
            try {
                method.invoke(anonymousClass194, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C011302r c011302r2 = LLJIJIL;
        AnonymousClass194 anonymousClass1942 = this.LJLLLLLL;
        c011302r2.getClass();
        C011302r.LIZ();
        Method method2 = c011302r2.LIZIZ;
        if (method2 == null) {
            return;
        }
        try {
            method2.invoke(anonymousClass1942, new Object[0]);
        } catch (Exception unused2) {
        }
    }

    public final void LJIIL() {
        if (TextUtils.isEmpty(this.LJLLLLLL.getText())) {
            if (this.LLIILII) {
                clearFocus();
                LJIL(true);
                return;
            }
            return;
        }
        this.LJLLLLLL.setText("");
        this.LJLLLLLL.requestFocus();
        this.LJLLLLLL.setImeVisibility(true);
    }

    public final void LJIILLIIL() {
        Editable text = this.LJLLLLLL.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.LLILZLL != null) {
                getContext().startActivity(LJIIIZ("android.intent.action.SEARCH", null, null, text.toString()));
            }
            this.LJLLLLLL.setImeVisibility(false);
            this.LJLLLLLL.dismissDropDown();
        }
    }

    public final void LJIIZILJ() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.LJLLLLLL.getText());
        int i = 0;
        if (!z2 && (!this.LLIILII || this.LLILZ)) {
            z = false;
        }
        ImageView imageView = this.LLD;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.LLD.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void LJIJ() {
        int[] iArr;
        if (this.LJLLLLLL.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.LJZ.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.LJZI.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void LJIJJ() {
        int i = 0;
        if ((!this.LLIL && !this.LLILLJJLI) || this.LLIILZL || (this.LL.getVisibility() != 0 && this.LLF.getVisibility() != 0)) {
            i = 8;
        }
        this.LJZI.setVisibility(i);
    }

    public int getImeOptions() {
        return this.LJLLLLLL.getImeOptions();
    }

    public int getInputType() {
        return this.LJLLLLLL.getInputType();
    }

    public CharSequence getQuery() {
        return this.LJLLLLLL.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.LLILII;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.LLILZLL;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.LLILZLL.getHintId());
        }
        return this.LLIIJI;
    }

    @Override // X.InterfaceC25590zT
    public final void onActionViewCollapsed() {
        this.LJLLLLLL.setText("");
        AnonymousClass194 anonymousClass194 = this.LJLLLLLL;
        anonymousClass194.setSelection(anonymousClass194.length());
        this.LLILLL = "";
        clearFocus();
        LJIL(true);
        this.LJLLLLLL.setImeOptions(this.LLILZIL);
        this.LLILZ = false;
    }

    @Override // X.InterfaceC25590zT
    public final void onActionViewExpanded() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        int imeOptions = this.LJLLLLLL.getImeOptions();
        this.LLILZIL = imeOptions;
        this.LJLLLLLL.setImeOptions(imeOptions | 33554432);
        this.LJLLLLLL.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.LLIZLLLIL);
        post(this.LLJ);
        super.onDetachedFromWindow();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.cq);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.cr);
    }

    public final void LJIJI() {
        CharSequence queryHint = getQueryHint();
        AnonymousClass194 anonymousClass194 = this.LJLLLLLL;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.LLIILII && this.LLIIII != null) {
            int textSize = (int) (anonymousClass194.getTextSize() * 1.25d);
            this.LLIIII.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.LLIIII), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        anonymousClass194.setHint(queryHint);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SearchView$SavedState searchView$SavedState = new SearchView$SavedState(super.onSaveInstanceState());
        searchView$SavedState.LJLIL = this.LLIILZL;
        return searchView$SavedState;
    }

    public int getMaxWidth() {
        return this.LLILLIZIL;
    }

    public int getSuggestionCommitIconResId() {
        return this.LLIIIJ;
    }

    public int getSuggestionRowLayout() {
        return this.LLIIIILZ;
    }

    public AbstractC37571dh getSuggestionsAdapter() {
        return this.LLIIZ;
    }

    public AnonymousClass195(Context context) {
        this(context, null);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        this.LJLLLLLL.setText(charSequence);
        AnonymousClass194 anonymousClass194 = this.LJLLLLLL;
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        anonymousClass194.setSelection(length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(int r8) {
        /*
            r7 = this;
            X.1dh r0 = r7.LLIIZ
            android.database.Cursor r4 = r0.LJLJI
            if (r4 == 0) goto L81
            boolean r0 = r4.moveToPosition(r8)
            if (r0 == 0) goto L81
            r3 = 0
            java.lang.String r0 = "suggest_intent_action"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r5 = X.ViewOnClickListenerC45171px.LJIIIIZZ(r0, r4)     // Catch: java.lang.RuntimeException -> L7b
            if (r5 != 0) goto L23
            android.app.SearchableInfo r0 = r7.LLILZLL     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r5 = r0.getSuggestIntentAction()     // Catch: java.lang.RuntimeException -> L7b
            if (r5 != 0) goto L23
            java.lang.String r5 = "android.intent.action.SEARCH"
        L23:
            java.lang.String r0 = "suggest_intent_data"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r6 = X.ViewOnClickListenerC45171px.LJIIIIZZ(r0, r4)     // Catch: java.lang.RuntimeException -> L7b
            if (r6 != 0) goto L37
            android.app.SearchableInfo r0 = r7.LLILZLL     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r6 = r0.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L7b
            if (r6 == 0) goto L5c
        L37:
            java.lang.String r0 = "suggest_intent_data_id"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r2 = X.ViewOnClickListenerC45171px.LJIIIIZZ(r0, r4)     // Catch: java.lang.RuntimeException -> L7b
            if (r2 == 0) goto L5e
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.RuntimeException -> L7b
            r1.append(r6)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r0 = android.net.Uri.encode(r2)     // Catch: java.lang.RuntimeException -> L7b
            r1.append(r0)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r6 = X.X1D.LIZIZ(r1)     // Catch: java.lang.RuntimeException -> L7b
            if (r6 != 0) goto L5e
        L5c:
            r2 = r3
            goto L62
        L5e:
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.RuntimeException -> L7b
        L62:
            java.lang.String r0 = "suggest_intent_query"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r1 = X.ViewOnClickListenerC45171px.LJIIIIZZ(r0, r4)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r0 = "suggest_intent_extra_data"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r0 = X.ViewOnClickListenerC45171px.LJIIIIZZ(r0, r4)     // Catch: java.lang.RuntimeException -> L7b
            android.content.Intent r3 = r7.LJIIIZ(r5, r2, r0, r1)     // Catch: java.lang.RuntimeException -> L7b
            goto L7f
        L7b:
            r4.getPosition()     // Catch: java.lang.RuntimeException -> L7f
            goto L81
        L7f:
            if (r3 != 0) goto L8d
        L81:
            X.194 r1 = r7.LJLLLLLL
            r0 = 0
            r1.setImeVisibility(r0)
            X.194 r0 = r7.LJLLLLLL
            r0.dismissDropDown()
            return
        L8d:
            android.content.Context r0 = r7.getContext()     // Catch: java.lang.RuntimeException -> L81
            r0.startActivity(r3)     // Catch: java.lang.RuntimeException -> L81
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass195.LJIILIIL(int):void");
    }

    public final void LJIILJJIL(int i) {
        Editable text = this.LJLLLLLL.getText();
        Cursor cursor = this.LLIIZ.LJLJI;
        if (cursor == null) {
            return;
        }
        if (cursor.moveToPosition(i)) {
            CharSequence LIZLLL = this.LLIIZ.LIZLLL(cursor);
            if (LIZLLL != null) {
                setQuery(LIZLLL);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    public final void LJIILL(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r2.LLILLJJLI == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.LLIL
            if (r0 == 0) goto L1b
            r1 = 0
            boolean r0 = r2.LLIILZL
            if (r0 != 0) goto L1b
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L1b
            if (r3 != 0) goto L15
            boolean r0 = r2.LLILLJJLI
            if (r0 != 0) goto L1b
        L15:
            android.widget.ImageView r0 = r2.LL
            r0.setVisibility(r1)
            return
        L1b:
            r1 = 8
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass195.LJIJJLI(boolean):void");
    }

    public final void LJIL(boolean z) {
        int i;
        int i2;
        int i3;
        this.LLIILZL = z;
        int i4 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.LJLLLLLL.getText());
        this.LJZL.setVisibility(i);
        LJIJJLI(z2);
        View view = this.LJLZ;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.LLII.getDrawable() == null || this.LLIILII) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        this.LLII.setVisibility(i3);
        LJIIZILJ();
        boolean z3 = !z2;
        if (this.LLILLJJLI && !this.LLIILZL && z3) {
            this.LL.setVisibility(8);
            i4 = 0;
        }
        this.LLF.setVisibility(i4);
        LJIJJ();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SearchView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SearchView$SavedState searchView$SavedState = (SearchView$SavedState) parcelable;
        super.onRestoreInstanceState(searchView$SavedState.mSuperState);
        LJIL(searchView$SavedState.LJLIL);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.LLIZLLLIL);
    }

    public void setAppSearchData(Bundle bundle) {
        this.LLIZ = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            LJIIL();
            return;
        }
        LJIL(false);
        this.LJLLLLLL.requestFocus();
        this.LJLLLLLL.setImeVisibility(true);
        View.OnClickListener onClickListener = this.LLIIL;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.LLIILII == z) {
            return;
        }
        this.LLIILII = z;
        LJIL(z);
        LJIJI();
    }

    public void setImeOptions(int i) {
        this.LJLLLLLL.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.LJLLLLLL.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.LLILLIZIL = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.LLIIJLIL = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.LLIIL = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.LLILII = charSequence;
        LJIJI();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.LLILIL = z;
        AbstractC37571dh abstractC37571dh = this.LLIIZ;
        if (abstractC37571dh instanceof ViewOnClickListenerC45171px) {
            ViewOnClickListenerC45171px viewOnClickListenerC45171px = (ViewOnClickListenerC45171px) abstractC37571dh;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            viewOnClickListenerC45171px.LJLLLLLL = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r1, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.LLILZLL = r7
            r2 = 1
            r3 = 65536(0x10000, float:9.1835E-41)
            r4 = 0
            if (r7 == 0) goto L6c
            X.194 r1 = r6.LJLLLLLL
            int r0 = r7.getSuggestThreshold()
            r1.setThreshold(r0)
            X.194 r1 = r6.LJLLLLLL
            android.app.SearchableInfo r0 = r6.LLILZLL
            int r0 = r0.getImeOptions()
            r1.setImeOptions(r0)
            android.app.SearchableInfo r0 = r6.LLILZLL
            int r1 = r0.getInputType()
            r0 = r1 & 15
            if (r0 != r2) goto L36
            r0 = -65537(0xfffffffffffeffff, float:NaN)
            r1 = r1 & r0
            android.app.SearchableInfo r0 = r6.LLILZLL
            java.lang.String r0 = r0.getSuggestAuthority()
            if (r0 == 0) goto L36
            r1 = r1 | r3
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
        L36:
            X.194 r0 = r6.LJLLLLLL
            r0.setInputType(r1)
            X.1dh r0 = r6.LLIIZ
            if (r0 == 0) goto L42
            r0.LIZJ(r4)
        L42:
            android.app.SearchableInfo r0 = r6.LLILZLL
            java.lang.String r0 = r0.getSuggestAuthority()
            if (r0 == 0) goto L69
            X.1px r5 = new X.1px
            android.content.Context r4 = r6.getContext()
            android.app.SearchableInfo r1 = r6.LLILZLL
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r6.LLJI
            r5.<init>(r4, r6, r1, r0)
            r6.LLIIZ = r5
            X.194 r0 = r6.LJLLLLLL
            r0.setAdapter(r5)
            X.1dh r1 = r6.LLIIZ
            X.1px r1 = (X.ViewOnClickListenerC45171px) r1
            boolean r0 = r6.LLILIL
            if (r0 == 0) goto Lae
            r0 = 2
        L67:
            r1.LJLLLLLL = r0
        L69:
            r6.LJIJI()
        L6c:
            android.app.SearchableInfo r0 = r6.LLILZLL
            if (r0 == 0) goto Lac
            boolean r0 = r0.getVoiceSearchEnabled()
            if (r0 == 0) goto Lac
            android.app.SearchableInfo r0 = r6.LLILZLL
            boolean r0 = r0.getVoiceSearchLaunchWebSearch()
            if (r0 == 0) goto La1
            android.content.Intent r1 = r6.LLIIIL
        L80:
            if (r1 == 0) goto Lac
            android.content.Context r0 = r6.getContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.ResolveInfo r0 = r0.resolveActivity(r1, r3)
            if (r0 == 0) goto Lac
        L90:
            r6.LLILLJJLI = r2
            if (r2 == 0) goto L9b
            X.194 r1 = r6.LJLLLLLL
            java.lang.String r0 = "nm"
            r1.setPrivateImeOptions(r0)
        L9b:
            boolean r0 = r6.LLIILZL
            r6.LJIL(r0)
            return
        La1:
            android.app.SearchableInfo r0 = r6.LLILZLL
            boolean r0 = r0.getVoiceSearchLaunchRecognizer()
            if (r0 == 0) goto Lac
            android.content.Intent r1 = r6.LLIIIZ
            goto L80
        Lac:
            r2 = 0
            goto L90
        Lae:
            r0 = 1
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass195.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.LLIL = z;
        LJIL(this.LLIILZL);
    }

    public void setSuggestionsAdapter(AbstractC37571dh abstractC37571dh) {
        this.LLIIZ = abstractC37571dh;
        this.LJLLLLLL.setAdapter(abstractC37571dh);
    }

    public AnonymousClass195(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.b_b);
    }

    public final Intent LJIIJ(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.LLIZ;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        } else {
            i = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.LLIILZL) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i3 = this.LLILLIZIL) > 0) {
                    size = Math.min(i3, size);
                }
            } else {
                size = this.LLILLIZIL;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i4 = this.LLILLIZIL;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.LLILL || !isFocusable()) {
            return false;
        }
        if (!this.LLIILZL) {
            boolean requestFocus = this.LJLLLLLL.requestFocus(i, rect);
            if (requestFocus) {
                LJIL(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    public AnonymousClass195(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLFII = new Rect();
        this.LLFZ = new Rect();
        this.LLI = new int[2];
        this.LLIFFJFJJ = new int[2];
        this.LLIZLLLIL = new IDRunnableS85S0100000(this, 8);
        this.LLJ = new IDRunnableS85S0100000(this, 9);
        this.LLJI = new WeakHashMap<>();
        IDCListenerS135S0100000 iDCListenerS135S0100000 = new IDCListenerS135S0100000(this, 5);
        View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: X.02k
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                int i3;
                AnonymousClass195 anonymousClass195 = AnonymousClass195.this;
                if (anonymousClass195.LLILZLL == null) {
                    return false;
                }
                if (anonymousClass195.LJLLLLLL.isPopupShowing() && AnonymousClass195.this.LJLLLLLL.getListSelection() != -1) {
                    AnonymousClass195 anonymousClass1952 = AnonymousClass195.this;
                    if (anonymousClass1952.LLILZLL == null || anonymousClass1952.LLIIZ == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    if (i2 == 66 || i2 == 84 || i2 == 61) {
                        anonymousClass1952.LJIILIIL(anonymousClass1952.LJLLLLLL.getListSelection());
                    } else {
                        if (i2 != 21) {
                            if (i2 == 22) {
                                i3 = anonymousClass1952.LJLLLLLL.length();
                            } else {
                                if (i2 != 19) {
                                    return false;
                                }
                                anonymousClass1952.LJLLLLLL.getListSelection();
                                return false;
                            }
                        } else {
                            i3 = 0;
                        }
                        anonymousClass1952.LJLLLLLL.setSelection(i3);
                        anonymousClass1952.LJLLLLLL.setListSelection(0);
                        anonymousClass1952.LJLLLLLL.clearListSelection();
                        anonymousClass1952.LJLLLLLL.LIZ();
                    }
                    return true;
                }
                if (TextUtils.getTrimmedLength(AnonymousClass195.this.LJLLLLLL.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                    return false;
                }
                view.cancelLongPress();
                AnonymousClass195 anonymousClass1953 = AnonymousClass195.this;
                anonymousClass1953.getContext().startActivity(anonymousClass1953.LJIIIZ("android.intent.action.SEARCH", null, null, anonymousClass1953.LJLLLLLL.getText().toString()));
                return true;
            }
        };
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: X.02l
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                AnonymousClass195.this.LJIILLIIL();
                return true;
            }
        };
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: X.02m
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                AnonymousClass195.this.LJIILIIL(i2);
            }
        };
        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: X.02n
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                AnonymousClass195.this.LJIILJJIL(i2);
            }
        };
        IDObjectS173S0100000 iDObjectS173S0100000 = new IDObjectS173S0100000(this, 0);
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(context, attributeSet, new int[]{android.R.attr.focusable, android.R.attr.maxWidth, android.R.attr.inputType, android.R.attr.imeOptions, R.attr.a3v, R.attr.a6q, R.attr.a9n, R.attr.af1, R.attr.agz, R.attr.akv, R.attr.b6d, R.attr.b6e, R.attr.b__, R.attr.b_a, R.attr.bfh, R.attr.bfq, R.attr.bwe}, i, 0);
        h0.LJIJ(this, context, new int[]{android.R.attr.focusable, android.R.attr.maxWidth, android.R.attr.inputType, android.R.attr.imeOptions, R.attr.a3v, R.attr.a6q, R.attr.a9n, R.attr.af1, R.attr.agz, R.attr.akv, R.attr.b6d, R.attr.b6e, R.attr.b__, R.attr.b_a, R.attr.bfh, R.attr.bfq, R.attr.bwe}, attributeSet, LJIILIIL.LIZIZ, i);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), LJIILIIL.LJIIIIZZ(9, R.layout.dh), this, true);
        AnonymousClass194 anonymousClass194 = (AnonymousClass194) findViewById(R.id.jhk);
        this.LJLLLLLL = anonymousClass194;
        anonymousClass194.setSearchView(this);
        this.LJLZ = findViewById(R.id.jf5);
        View findViewById = findViewById(R.id.jh0);
        this.LJZ = findViewById;
        View findViewById2 = findViewById(R.id.kpj);
        this.LJZI = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.jeh);
        this.LJZL = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.jfu);
        this.LL = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.jep);
        this.LLD = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.jii);
        this.LLF = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.jgi);
        this.LLII = imageView5;
        C16300kU.LJIILLIIL(findViewById, LJIILIIL.LJ(10));
        C16300kU.LJIILLIIL(findViewById2, LJIILIIL.LJ(14));
        imageView.setImageDrawable(LJIILIIL.LJ(13));
        imageView2.setImageDrawable(LJIILIIL.LJ(7));
        imageView3.setImageDrawable(LJIILIIL.LJ(4));
        imageView4.setImageDrawable(LJIILIIL.LJ(16));
        imageView5.setImageDrawable(LJIILIIL.LJ(13));
        this.LLIIII = LJIILIIL.LJ(12);
        C03E.LIZ(imageView, getResources().getString(R.string.a79));
        this.LLIIIILZ = LJIILIIL.LJIIIIZZ(15, R.layout.dg);
        this.LLIIIJ = LJIILIIL.LJIIIIZZ(5, 0);
        C16880lQ.LJIILLIIL(imageView, iDCListenerS135S0100000);
        C16880lQ.LJIILLIIL(imageView3, iDCListenerS135S0100000);
        C16880lQ.LJIILLIIL(imageView2, iDCListenerS135S0100000);
        C16880lQ.LJIILLIIL(imageView4, iDCListenerS135S0100000);
        anonymousClass194.setOnClickListener(new ViewOnClickListenerC13880ga(iDCListenerS135S0100000));
        anonymousClass194.addTextChangedListener(iDObjectS173S0100000);
        anonymousClass194.setOnEditorActionListener(onEditorActionListener);
        anonymousClass194.setOnItemClickListener(onItemClickListener);
        anonymousClass194.setOnItemSelectedListener(onItemSelectedListener);
        anonymousClass194.setOnKeyListener(onKeyListener);
        anonymousClass194.setOnFocusChangeListener(new IDCListenerS370S0100000(this, 0));
        setIconifiedByDefault(LJIILIIL.LIZ(8, true));
        int LIZLLL = LJIILIIL.LIZLLL(1, -1);
        if (LIZLLL != -1) {
            setMaxWidth(LIZLLL);
        }
        this.LLIIJI = LJIILIIL.LJIIJ(6);
        this.LLILII = LJIILIIL.LJIIJ(11);
        int LJII = LJIILIIL.LJII(3, -1);
        if (LJII != -1) {
            setImeOptions(LJII);
        }
        int LJII2 = LJIILIIL.LJII(2, -1);
        if (LJII2 != -1) {
            setInputType(LJII2);
        }
        setFocusable(LJIILIIL.LIZ(0, true));
        LJIILIIL.LJIILJJIL();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.LLIIIL = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.LLIIIZ = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(anonymousClass194.getDropDownAnchor());
        this.LLFF = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new IDCListenerS250S0100000(this, 0));
        }
        LJIL(this.LLIILII);
        LJIJI();
    }

    public final Intent LJIIIZ(String str, android.net.Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.LLILLL);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.LLIZ;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.LLILZLL.getSearchActivity());
        return intent;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnonymousClass194 anonymousClass194 = this.LJLLLLLL;
            Rect rect = this.LLFII;
            anonymousClass194.getLocationInWindow(this.LLI);
            getLocationInWindow(this.LLIFFJFJJ);
            int[] iArr = this.LLI;
            int i5 = iArr[1];
            int[] iArr2 = this.LLIFFJFJJ;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, anonymousClass194.getWidth() + i7, anonymousClass194.getHeight() + i6);
            Rect rect2 = this.LLFZ;
            Rect rect3 = this.LLFII;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C011402s c011402s = this.LLFFF;
            if (c011402s == null) {
                C011402s c011402s2 = new C011402s(this.LLFZ, this.LLFII, this.LJLLLLLL);
                this.LLFFF = c011402s2;
                setTouchDelegate(c011402s2);
                return;
            }
            Rect rect4 = this.LLFZ;
            Rect rect5 = this.LLFII;
            c011402s.LIZIZ.set(rect4);
            c011402s.LIZLLL.set(rect4);
            Rect rect6 = c011402s.LIZLLL;
            int i8 = -c011402s.LJ;
            rect6.inset(i8, i8);
            c011402s.LIZJ.set(rect5);
        }
    }
}
