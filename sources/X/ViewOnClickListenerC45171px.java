package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.1px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC45171px extends AbstractC44271oV implements View.OnClickListener {
    public static final /* synthetic */ int LLFF = 0;
    public final AnonymousClass195 LJLLI;
    public final SearchableInfo LJLLILLLL;
    public final Context LJLLJ;
    public final WeakHashMap<String, Drawable.ConstantState> LJLLL;
    public final int LJLLLL;
    public int LJLLLLLL;
    public ColorStateList LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public int LLF;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle extras;
        super.notifyDataSetChanged();
        Cursor cursor = this.LJLJI;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle extras;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.LJLJI;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // X.AbstractC37571dh
    public final void LIZJ(Cursor cursor) {
        try {
            super.LIZJ(cursor);
            if (cursor != null) {
                this.LJZ = cursor.getColumnIndex("suggest_text_1");
                this.LJZI = cursor.getColumnIndex("suggest_text_2");
                this.LJZL = cursor.getColumnIndex("suggest_text_2_url");
                this.LL = cursor.getColumnIndex("suggest_icon_1");
                this.LLD = cursor.getColumnIndex("suggest_icon_2");
                this.LLF = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.AbstractC37571dh
    public final CharSequence LIZLLL(Cursor cursor) {
        String LJIIIIZZ;
        String LJIIIIZZ2;
        if (cursor == null) {
            return null;
        }
        String LJIIIIZZ3 = LJIIIIZZ(cursor.getColumnIndex("suggest_intent_query"), cursor);
        if (LJIIIIZZ3 != null) {
            return LJIIIIZZ3;
        }
        if (this.LJLLILLLL.shouldRewriteQueryFromData() && (LJIIIIZZ2 = LJIIIIZZ(cursor.getColumnIndex("suggest_intent_data"), cursor)) != null) {
            return LJIIIIZZ2;
        }
        if (!this.LJLLILLLL.shouldRewriteQueryFromText() || (LJIIIIZZ = LJIIIIZZ(cursor.getColumnIndex("suggest_text_1"), cursor)) == null) {
            return null;
        }
        return LJIIIIZZ;
    }

    @Override // X.AbstractC37571dh
    public final View LJ(ViewGroup viewGroup) {
        View LLLLIILL = C16880lQ.LLLLIILL(this.LJLL, this.LJLJLJ, viewGroup, false);
        LLLLIILL.setTag(new C013803q(LLLLIILL));
        ((ImageView) LLLLIILL.findViewById(R.id.cph)).setImageResource(this.LJLLLL);
        return LLLLIILL;
    }

    public final Drawable LJFF(android.net.Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.LJLLJ.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = CastIntegerProtector.parseInt((String) ListProtector.get(pathSegments, 0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(C43588H8u.LIZ("Single path segment is not a resource ID: ", uri));
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier((String) ListProtector.get(pathSegments, 1), (String) ListProtector.get(pathSegments, 0), authority);
                    } else {
                        throw new FileNotFoundException(C43588H8u.LIZ("More than two path segments: ", uri));
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException(C43588H8u.LIZ("No resource found for: ", uri));
                }
                throw new FileNotFoundException(C43588H8u.LIZ("No path: ", uri));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(C43588H8u.LIZ("No package found for authority: ", uri));
            }
        }
        throw new FileNotFoundException(C43588H8u.LIZ("No authority: ", uri));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable LJI(java.lang.String r6) {
        /*
            r5 = this;
            r3 = 0
            if (r6 == 0) goto L11
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L11
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L12
        L11:
            return r3
        L12:
            int r2 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            java.lang.String r0 = "android.resource://"
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            android.content.Context r0 = r5.LJLLJ     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            java.lang.String r4 = X.X1D.LIZIZ(r1)     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r5.LJLLL     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            if (r0 != 0) goto L3f
            goto L44
        L3f:
            android.graphics.drawable.Drawable r0 = r0.newDrawable()     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 == 0) goto L48
            return r0
        L48:
            android.content.Context r0 = r5.LJLLJ     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            android.graphics.drawable.Drawable r2 = X.C04270Et.LIZIZ(r0, r2)     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            if (r2 == 0) goto Ld4
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.LJLLL     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            android.graphics.drawable.Drawable$ConstantState r0 = r2.getConstantState()     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            r1.put(r4, r0)     // Catch: java.lang.NumberFormatException -> L5a android.content.res.Resources.NotFoundException -> Ld5
            goto Ld4
        L5a:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r5.LJLLL
            java.lang.Object r0 = r0.get(r6)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L68
            r0 = r3
        L65:
            if (r0 == 0) goto L6d
            return r0
        L68:
            android.graphics.drawable.Drawable r0 = r0.newDrawable()
            goto L65
        L6d:
            android.net.Uri r4 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)
            java.lang.String r1 = r4.getScheme()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = "android.resource"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L98
            android.graphics.drawable.Drawable r3 = r5.LJFF(r4)     // Catch: android.content.res.Resources.NotFoundException -> L82 java.lang.Throwable -> Lc7
            goto Lc7
        L82:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = "Resource does not exist: "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc7
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lc7
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lc7
            throw r2     // Catch: java.lang.Throwable -> Lc7
        L98:
            android.content.Context r0 = r5.LJLLJ     // Catch: java.lang.Throwable -> Lc7
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Lc7
            java.io.InputStream r1 = r0.openInputStream(r4)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Lb1
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r1, r3)     // Catch: java.lang.Throwable -> Lac
            r1.close()
            goto Lc7
        Lac:
            r0 = move-exception
            r1.close()     // Catch: java.io.IOException -> Lb0
        Lb0:
            throw r0     // Catch: java.lang.Throwable -> Lc7
        Lb1:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = "Failed to open "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc7
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lc7
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lc7
            throw r2     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            if (r3 == 0) goto L11
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.LJLLL
            android.graphics.drawable.Drawable$ConstantState r0 = r3.getConstantState()
            r1.put(r6, r0)
            goto L11
        Ld4:
            return r2
        Ld5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC45171px.LJI(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.LJLLI.LJIILL((CharSequence) tag);
        }
    }

    public static String LJIIIIZZ(int i, Cursor cursor) {
        String str = null;
        if (i == -1) {
            return null;
        }
        try {
            str = cursor.getString(i);
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x015e, code lost:
    
        if (r9 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC37571dh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC45171px.LIZIZ(android.view.View, android.database.Cursor):void");
    }

    public final Cursor LJII(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.LJLLJ.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // X.AbstractC37571dh, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View LLLLIILL = C16880lQ.LLLLIILL(this.LJLL, this.LJLJLLL, viewGroup, false);
            if (LLLLIILL != null) {
                ((C013803q) LLLLIILL.getTag()).LIZ.setText(e.toString());
            }
            return LLLLIILL;
        }
    }

    @Override // X.AbstractC37571dh, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View LJ = LJ(viewGroup);
            ((C013803q) LJ.getTag()).LIZ.setText(e.toString());
            return LJ;
        }
    }

    public ViewOnClickListenerC45171px(Context context, AnonymousClass195 anonymousClass195, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, anonymousClass195.getSuggestionRowLayout());
        this.LJLLLLLL = 1;
        this.LJZ = -1;
        this.LJZI = -1;
        this.LJZL = -1;
        this.LL = -1;
        this.LLD = -1;
        this.LLF = -1;
        this.LJLLI = anonymousClass195;
        this.LJLLILLLL = searchableInfo;
        this.LJLLLL = anonymousClass195.getSuggestionCommitIconResId();
        this.LJLLJ = context;
        this.LJLLL = weakHashMap;
    }
}
