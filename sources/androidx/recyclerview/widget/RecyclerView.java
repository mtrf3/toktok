package androidx.recyclerview.widget;

import X.AbstractC029409q;
import X.AbstractC029609s;
import X.AbstractC030109x;
import X.AbstractC030309z;
import X.C029109n;
import X.C029809u;
import X.C030009w;
import X.C030209y;
import X.C03290Az;
import X.C0A2;
import X.C0A3;
import X.C0A4;
import X.C0A5;
import X.C0A6;
import X.C0A7;
import X.C0A8;
import X.C0AB;
import X.C0AC;
import X.C0AD;
import X.C0AE;
import X.C0AI;
import X.C0AV;
import X.C0AW;
import X.C0B0;
import X.C0B1;
import X.C16300kU;
import X.C16390kd;
import X.C16500ko;
import X.C16520kq;
import X.C16610kz;
import X.C16880lQ;
import X.C17680mi;
import X.C1BX;
import X.C1C0;
import X.C28781Ba;
import X.C28891Bl;
import X.C28901Bm;
import X.C28921Bo;
import X.C29031Bz;
import X.C38413F5t;
import X.C40171ht;
import X.InterfaceC029709t;
import X.InterfaceC16140kE;
import X.InterfaceC33971Uz;
import X.InterpolatorC029009m;
import X.ViewOnAttachStateChangeListenerC13950gh;
import X.X1D;
import Y.IDRunnableS85S0100000;
import Y.IDrS12S0000000_6;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.b1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AqS73S0000000_6;
import o3.h0;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC16140kE, InterfaceC33971Uz {
    public static final int[] LLJLL = {R.attr.nestedScrollingEnabled};
    public static final boolean LLJLLIL;
    public static final boolean LLJLLL;
    public static final boolean LLJZ;
    public static final Class<?>[] LLJZIJLIL;
    public static final InterpolatorC029009m LLL;
    public final C1BX LJLIL;
    public final C0A7 LJLILLLLZI;
    public SavedState LJLJI;
    public C28781Ba LJLJJI;
    public C0AW LJLJJL;
    public final C0B0 LJLJJLL;
    public boolean LJLJL;
    public final IDRunnableS85S0100000 LJLJLJ;
    public final Rect LJLJLLL;
    public final Rect LJLL;
    public final RectF LJLLI;
    public AbstractC029409q LJLLILLLL;
    public C0A2 LJLLJ;
    public C0A8 LJLLL;
    public final List<C0A8> LJLLLL;
    public final ArrayList<AbstractC030309z> LJLLLLLL;
    public final ArrayList<C0A5> LJLZ;
    public C0A5 LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public int LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public final AccessibilityManager LLI;
    public List<C0A3> LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public int LLIIIILZ;
    public C029809u LLIIIJ;
    public EdgeEffect LLIIIL;
    public EdgeEffect LLIIIZ;
    public EdgeEffect LLIIJI;
    public EdgeEffect LLIIJLIL;
    public AbstractC030109x LLIIL;
    public int LLIILII;
    public int LLIILZL;
    public VelocityTracker LLIIZ;
    public int LLIL;
    public int LLILII;
    public int LLILIL;
    public int LLILL;
    public int LLILLIZIL;
    public C0A4 LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public boolean LLIZ;
    public final C0AE LLIZLLLIL;
    public C0B1 LLJ;
    public final C1C0 LLJI;
    public final C0AC LLJIJIL;
    public C0A6 LLJILJIL;
    public List<C0A6> LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C030209y LLJJI;
    public boolean LLJJIII;
    public C28921Bo LLJJIJI;
    public InterfaceC029709t LLJJIJIIJIL;
    public final int[] LLJJIJIL;
    public C16610kz LLJJJ;
    public final int[] LLJJJIL;
    public final int[] LLJJJJ;
    public final int[] LLJJJJJIL;
    public final List<ViewHolder> LLJJJJLIIL;
    public final IDRunnableS85S0100000 LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public final C029109n LLJLILLLLZIIL;

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public final Rect mDecorInsets;
        public boolean mInsetsDirty;
        public boolean mPendingInvalidate;
        public ViewHolder mViewHolder;

        public int getAbsoluteAdapterPosition() {
            return this.mViewHolder.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        public int getViewAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.mViewHolder.getLayoutPosition();
        }

        public int getViewPosition() {
            return this.mViewHolder.getPosition();
        }

        public boolean isItemChanged() {
            return this.mViewHolder.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.mViewHolder.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.mViewHolder.needsUpdate();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }
    }

    /* loaded from: classes.dex */
    public static class RecycledViewPool {
        public SparseArray<ScrapData> mScrap = new SparseArray<>();
        public int mAttachCount = 0;

        /* loaded from: classes.dex */
        public static class ScrapData {
            public final ArrayList<ViewHolder> mScrapHeap = new ArrayList<>();
            public int mMaxScrap = 5;
            public long mCreateRunningAverageNs = 0;
            public long mBindRunningAverageNs = 0;
        }

        public void clear() {
            for (int i = 0; i < this.mScrap.size(); i++) {
                this.mScrap.valueAt(i).mScrapHeap.clear();
            }
        }

        public int size() {
            int i = 0;
            for (int i2 = 0; i2 < this.mScrap.size(); i2++) {
                ArrayList<ViewHolder> arrayList = this.mScrap.valueAt(i2).mScrapHeap;
                if (arrayList != null) {
                    i = arrayList.size() + i;
                }
            }
            return i;
        }

        public void attach() {
            this.mAttachCount++;
        }

        public void detach() {
            this.mAttachCount--;
        }

        private ScrapData getScrapDataForType(int i) {
            ScrapData scrapData = this.mScrap.get(i);
            if (scrapData == null) {
                ScrapData scrapData2 = new ScrapData();
                this.mScrap.put(i, scrapData2);
                return scrapData2;
            }
            return scrapData;
        }

        public ViewHolder getRecycledView(int i) {
            ScrapData scrapData = this.mScrap.get(i);
            if (scrapData != null && !scrapData.mScrapHeap.isEmpty()) {
                ArrayList<ViewHolder> arrayList = scrapData.mScrapHeap;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!((ViewHolder) ListProtector.get(arrayList, size)).isAttachedToTransitionOverlay()) {
                        return (ViewHolder) ListProtector.remove(arrayList, size);
                    }
                }
                return null;
            }
            return null;
        }

        public int getRecycledViewCount(int i) {
            return getScrapDataForType(i).mScrapHeap.size();
        }

        public void putRecycledView(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList<ViewHolder> arrayList = getScrapDataForType(itemViewType).mScrapHeap;
            if (this.mScrap.get(itemViewType).mMaxScrap <= arrayList.size()) {
                return;
            }
            viewHolder.resetInternal();
            arrayList.add(viewHolder);
        }

        public void factorInBindTime(int i, long j) {
            ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mBindRunningAverageNs = runningAverage(scrapDataForType.mBindRunningAverageNs, j);
        }

        public void factorInCreateTime(int i, long j) {
            ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mCreateRunningAverageNs = runningAverage(scrapDataForType.mCreateRunningAverageNs, j);
        }

        public long runningAverage(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }

        public void setMaxRecycledViews(int i, int i2) {
            ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mMaxScrap = i2;
            ArrayList<ViewHolder> arrayList = scrapDataForType.mScrapHeap;
            while (arrayList.size() > i2) {
                ListProtector.remove(arrayList, arrayList.size() - 1);
            }
        }

        public void onAdapterChanged(AbstractC029409q abstractC029409q, AbstractC029409q abstractC029409q2, boolean z) {
            if (abstractC029409q != null) {
                detach();
            }
            if (!z && this.mAttachCount == 0) {
                clear();
            }
            if (abstractC029409q2 != null) {
                attach();
            }
        }

        public boolean willBindInTime(int i, long j, long j2) {
            long j3 = getScrapDataForType(i).mBindRunningAverageNs;
            if (j3 == 0 || j + j3 < j2) {
                return true;
            }
            return false;
        }

        public boolean willCreateInTime(int i, long j, long j2) {
            long j3 = getScrapDataForType(i).mCreateRunningAverageNs;
            if (j3 == 0 || j + j3 < j2) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ViewHolder {
        public static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public final View itemView;
        public AbstractC029409q<? extends ViewHolder> mBindingAdapter;
        public int mFlags;
        public boolean mInChangeScrap;
        public int mIsRecyclableCount;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public RecyclerView mOwnerRecyclerView;
        public List<Object> mPayloads;
        public C0A7 mScrapContainer;
        public ViewHolder mShadowedHolder;
        public ViewHolder mShadowingHolder;
        public List<Object> mUnmodifiedPayloads;
        public int mWasImportantForAccessibilityBeforeHidden;
        public int mPosition = -1;
        public int mOldPosition = -1;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public int mPreLayoutPosition = -1;
        public int mPendingAccessibilityState = -1;

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.LJIILIIL(this);
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0 && C16300kU.LJIIIIZZ(this.itemView)) {
                return true;
            }
            return false;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.LJJJJ(this);
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            AbstractC029409q adapter;
            int LJJJJ;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (LJJJJ = this.mOwnerRecyclerView.LJJJJ(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, LJJJJ);
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            if (i == -1) {
                return this.mPosition;
            }
            return i;
        }

        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            if (i == -1) {
                return this.mPosition;
            }
            return i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list == null || list.size() == 0) {
                    return FULLUPDATE_PAYLOADS;
                }
                return this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean isAdapterPositionUnknown() {
            if ((this.mFlags & 512) != 0 || isInvalid()) {
                return true;
            }
            return false;
        }

        public boolean isAttachedToTransitionOverlay() {
            if (this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView) {
                return true;
            }
            return false;
        }

        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0 && !C16300kU.LJIIIIZZ(this.itemView)) {
                return true;
            }
            return false;
        }

        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        public boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        public boolean isTmpDetached() {
            if ((this.mFlags & 256) != 0) {
                return true;
            }
            return false;
        }

        public boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean shouldIgnore() {
            if ((this.mFlags & 128) != 0) {
                return true;
            }
            return false;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public void unScrap() {
            this.mScrapContainer.LJIIL(this);
        }

        public boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }

        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public String toString() {
            String LJLLJ;
            String str;
            if (getClass().isAnonymousClass()) {
                LJLLJ = "ViewHolder";
            } else {
                LJLLJ = C16880lQ.LJLLJ(getClass());
            }
            StringBuilder LIZJ = b1.LIZJ(LJLLJ, "{");
            LIZJ.append(Integer.toHexString(hashCode()));
            LIZJ.append(" position=");
            LIZJ.append(this.mPosition);
            LIZJ.append(" id=");
            LIZJ.append(this.mItemId);
            LIZJ.append(", oldPos=");
            LIZJ.append(this.mOldPosition);
            LIZJ.append(", pLpos:");
            LIZJ.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZJ));
            if (isScrap()) {
                sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" not recyclable(");
                LIZ.append(this.mIsRecyclableCount);
                LIZ.append(")");
                sb.append(X1D.LIZIZ(LIZ));
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final AbstractC029409q<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public ViewHolder(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else {
                if ((1024 & this.mFlags) != 0) {
                    return;
                }
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public boolean hasAnyOfTheFlags(int i) {
            if ((i & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C16300kU.LIZJ(this.itemView);
            }
            if (recyclerView.LJJJLL()) {
                this.mPendingAccessibilityState = 4;
                ((ArrayList) recyclerView.LLJJJJLIIL).add(this);
            } else {
                C16300kU.LJIJ(this.itemView, 4);
            }
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            int i = this.mWasImportantForAccessibilityBeforeHidden;
            if (recyclerView.LJJJLL()) {
                this.mPendingAccessibilityState = i;
                ((ArrayList) recyclerView.LLJJJJLIIL).add(this);
            } else {
                C16300kU.LJIJ(this.itemView, i);
            }
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                return;
            }
            if (!z) {
                if (i != 1) {
                    return;
                }
                this.mFlags |= 16;
            } else {
                if (i != 0) {
                    return;
                }
                this.mFlags &= -17;
            }
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public void setScrapContainer(C0A7 c0a7, boolean z) {
            this.mScrapContainer = c0a7;
            this.mInChangeScrap = z;
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.09m] */
    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        LLJLLIL = z;
        LLJLLL = true;
        LLJZ = true;
        Class<?> cls = Integer.TYPE;
        LLJZIJLIL = new Class[]{Context.class, AttributeSet.class, cls, cls};
        LLL = new Interpolator() { // from class: X.09m
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return C06490Nh.LIZ(f2, f2, f2, f2, f2, 1.0f);
            }
        };
    }

    public RecyclerView() {
        throw null;
    }

    public void LJJLIIIJILLIZJL(int i) {
    }

    public void LJJLIIIJJI() {
    }

    public final void LJLJJI() {
        C0AB c0ab;
        setScrollState(0);
        C0AE c0ae = this.LLIZLLLIL;
        c0ae.LJLJL.removeCallbacks(c0ae);
        c0ae.LJLJI.abortAnimation();
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null && (c0ab = c0a2.LJLJJL) != null) {
            c0ab.LJI();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    private C16610kz getScrollingChildHelper() {
        if (this.LLJJJ == null) {
            this.LLJJJ = new C16610kz(this);
        }
        return this.LLJJJ;
    }

    public final void LJIILJJIL() {
        int LJII = this.LJLJJL.LJII();
        for (int i = 0; i < LJII; i++) {
            ViewHolder LJJJJL = LJJJJL(this.LJLJJL.LJI(i));
            if (!LJJJJL.shouldIgnore()) {
                LJJJJL.clearOldPosition();
            }
        }
        C0A7 c0a7 = this.LJLILLLLZI;
        int size = c0a7.LIZJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ViewHolder) ListProtector.get(c0a7.LIZJ, i2)).clearOldPosition();
        }
        int size2 = c0a7.LIZ.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ViewHolder) ListProtector.get(c0a7.LIZ, i3)).clearOldPosition();
        }
        ArrayList<ViewHolder> arrayList = c0a7.LIZIZ;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((ViewHolder) ListProtector.get(c0a7.LIZIZ, i4)).clearOldPosition();
            }
        }
    }

    public final void LJIILLIIL() {
        if (!this.LL || this.LLII) {
            Trace.beginSection("RV FullInvalidate");
            LJIJJ();
            Trace.endSection();
            return;
        }
        if (!this.LJLJJI.LJI()) {
            return;
        }
        C28781Ba c28781Ba = this.LJLJJI;
        int i = c28781Ba.LJFF;
        if ((4 & i) == 0 || (i & 11) != 0) {
            if (c28781Ba.LJI()) {
                Trace.beginSection("RV FullInvalidate");
                LJIJJ();
                Trace.endSection();
                return;
            }
            return;
        }
        Trace.beginSection("RV PartialInvalidate");
        LJLILLLLZI();
        LJJLI();
        this.LJLJJI.LJIIIZ();
        if (!this.LLF) {
            int LJ = this.LJLJJL.LJ();
            int i2 = 0;
            while (true) {
                if (i2 < LJ) {
                    ViewHolder LJJJJL = LJJJJL(this.LJLJJL.LIZLLL(i2));
                    if (LJJJJL == null || LJJJJL.shouldIgnore() || !LJJJJL.isUpdated()) {
                        i2++;
                    } else {
                        LJIJJ();
                        break;
                    }
                } else {
                    this.LJLJJI.LIZIZ();
                    break;
                }
            }
        }
        LJLJI(true);
        LJJLIIIIJ(true);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x036c, code lost:
    
        if (r15.LJLJJL.LJIIJ(getFocusedChild()) == false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03af, code lost:
    
        if (r5 != null) goto L418;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x040c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LJIJJ():void");
    }

    public final void LJIJJLI() {
        ViewHolder viewHolder;
        int absoluteAdapterPosition;
        boolean z;
        C03290Az orDefault;
        View focusedChild;
        this.LLJIJIL.LIZ(1);
        LJJIJ(this.LLJIJIL);
        this.LLJIJIL.LJIIIIZZ = false;
        LJLILLLLZI();
        C0B0 c0b0 = this.LJLJJLL;
        c0b0.LIZ.clear();
        c0b0.LIZIZ.LIZIZ();
        LJJLI();
        LJJLIIIJL();
        if (!this.LLIZ || !hasFocus() || this.LJLLILLLL == null || (focusedChild = getFocusedChild()) == null) {
            viewHolder = null;
        } else {
            viewHolder = LJJIJIL(focusedChild);
        }
        long j = -1;
        if (viewHolder == null) {
            C0AC c0ac = this.LLJIJIL;
            c0ac.LJIIL = -1L;
            c0ac.LJIIJJI = -1;
            c0ac.LJIILIIL = -1;
        } else {
            C0AC c0ac2 = this.LLJIJIL;
            if (this.LJLLILLLL.mHasStableIds) {
                j = viewHolder.getItemId();
            }
            c0ac2.LJIIL = j;
            C0AC c0ac3 = this.LLJIJIL;
            if (this.LLII) {
                absoluteAdapterPosition = -1;
            } else if (viewHolder.isRemoved()) {
                absoluteAdapterPosition = viewHolder.mOldPosition;
            } else {
                absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            }
            c0ac3.LJIIJJI = absoluteAdapterPosition;
            C0AC c0ac4 = this.LLJIJIL;
            View view = viewHolder.itemView;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            c0ac4.LJIILIIL = id;
        }
        C0AC c0ac5 = this.LLJIJIL;
        if (c0ac5.LJIIIZ && this.LLJJ) {
            z = true;
        } else {
            z = false;
        }
        c0ac5.LJII = z;
        this.LLJJ = false;
        this.LLJILLL = false;
        c0ac5.LJI = c0ac5.LJIIJ;
        c0ac5.LJ = this.LJLLILLLL.getItemCount();
        LJJIJLIJ(this.LLJJIJIL);
        if (this.LLJIJIL.LJIIIZ) {
            int LJ = this.LJLJJL.LJ();
            for (int i = 0; i < LJ; i++) {
                ViewHolder LJJJJL = LJJJJL(this.LJLJJL.LIZLLL(i));
                if (!LJJJJL.shouldIgnore() && (!LJJJJL.isInvalid() || this.LJLLILLLL.mHasStableIds)) {
                    this.LJLJJLL.LIZIZ(LJJJJL, this.LLIIL.LJIILLIIL(this.LLJIJIL, LJJJJL, AbstractC030109x.LJ(LJJJJL), LJJJJL.getUnmodifiedPayloads()));
                    if (this.LLJIJIL.LJII && LJJJJL.isUpdated() && !LJJJJL.isRemoved() && !LJJJJL.shouldIgnore() && !LJJJJL.isInvalid()) {
                        this.LJLJJLL.LIZIZ.LJI(LJJJJI(LJJJJL), LJJJJL);
                    }
                }
            }
        }
        if (this.LLJIJIL.LJIIJ) {
            int LJII = this.LJLJJL.LJII();
            for (int i2 = 0; i2 < LJII; i2++) {
                ViewHolder LJJJJL2 = LJJJJL(this.LJLJJL.LJI(i2));
                if (!LJJJJL2.shouldIgnore()) {
                    LJJJJL2.saveOldPosition();
                }
            }
            C0AC c0ac6 = this.LLJIJIL;
            boolean z2 = c0ac6.LJFF;
            c0ac6.LJFF = false;
            this.LJLLJ.LJLJJI(this.LJLILLLLZI, c0ac6);
            this.LLJIJIL.LJFF = z2;
            for (int i3 = 0; i3 < this.LJLJJL.LJ(); i3++) {
                ViewHolder LJJJJL3 = LJJJJL(this.LJLJJL.LIZLLL(i3));
                if (!LJJJJL3.shouldIgnore() && ((orDefault = this.LJLJJLL.LIZ.getOrDefault(LJJJJL3, null)) == null || (orDefault.LIZ & 4) == 0)) {
                    int LJ2 = AbstractC030109x.LJ(LJJJJL3);
                    boolean hasAnyOfTheFlags = LJJJJL3.hasAnyOfTheFlags(FileUtils.BUFFER_SIZE);
                    if (!hasAnyOfTheFlags) {
                        LJ2 |= 4096;
                    }
                    C030009w LJIILLIIL = this.LLIIL.LJIILLIIL(this.LLJIJIL, LJJJJL3, LJ2, LJJJJL3.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        LJJLIIIJLLLLLLLZ(LJJJJL3, LJIILLIIL);
                    } else {
                        C0B0 c0b02 = this.LJLJJLL;
                        C03290Az orDefault2 = c0b02.LIZ.getOrDefault(LJJJJL3, null);
                        if (orDefault2 == null) {
                            orDefault2 = C03290Az.LIZ();
                            c0b02.LIZ.put(LJJJJL3, orDefault2);
                        }
                        orDefault2.LIZ |= 2;
                        orDefault2.LIZIZ = LJIILLIIL;
                    }
                }
            }
            LJIILJJIL();
        } else {
            LJIILJJIL();
        }
        LJJLIIIIJ(true);
        LJLJI(false);
        this.LLJIJIL.LIZLLL = 2;
    }

    public final void LJJII() {
        if (this.LLIIJLIL != null) {
            return;
        }
        EdgeEffect LIZ = this.LLIIIJ.LIZ(3, this);
        this.LLIIJLIL = LIZ;
        if (this.LJLJL) {
            LIZ.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            LIZ.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void LJJIII() {
        if (this.LLIIIL != null) {
            return;
        }
        EdgeEffect LIZ = this.LLIIIJ.LIZ(0, this);
        this.LLIIIL = LIZ;
        if (this.LJLJL) {
            LIZ.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            LIZ.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void LJJIIJ() {
        if (this.LLIIJI != null) {
            return;
        }
        EdgeEffect LIZ = this.LLIIIJ.LIZ(2, this);
        this.LLIIJI = LIZ;
        if (this.LJLJL) {
            LIZ.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            LIZ.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void LJJIIJZLJL() {
        if (this.LLIIIZ != null) {
            return;
        }
        EdgeEffect LIZ = this.LLIIIJ.LIZ(1, this);
        this.LLIIIZ = LIZ;
        if (this.LJLJL) {
            LIZ.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            LIZ.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void LJJJJZI() {
        if (this.LJLLLLLL.size() == 0) {
            return;
        }
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null) {
            c0a2.LJIJI("Cannot invalidate item decorations during a scroll or layout");
        }
        LJJJZ();
        requestLayout();
    }

    public final boolean LJJJLIIL() {
        AbstractC030109x abstractC030109x = this.LLIIL;
        if (abstractC030109x != null && abstractC030109x.LJIILJJIL()) {
            return true;
        }
        return false;
    }

    public final boolean LJJJLL() {
        if (this.LLIIIILZ > 0) {
            return true;
        }
        return false;
    }

    public final void LJJJZ() {
        int LJII = this.LJLJJL.LJII();
        for (int i = 0; i < LJII; i++) {
            ((LayoutParams) this.LJLJJL.LJI(i).getLayoutParams()).mInsetsDirty = true;
        }
        C0A7 c0a7 = this.LJLILLLLZI;
        int size = c0a7.LIZJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) ((ViewHolder) ListProtector.get(c0a7.LIZJ, i2)).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.mInsetsDirty = true;
            }
        }
    }

    public final void LJJLI() {
        this.LLIIIILZ++;
    }

    public final void LJJLIIIJJIZ() {
        if (!this.LLJJIII && this.LJZI) {
            C16300kU.LJIIL(this, this.LLJJL);
            this.LLJJIII = true;
        }
    }

    public final void LJJLIIIJL() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.LLII) {
            C28781Ba c28781Ba = this.LJLJJI;
            c28781Ba.LJIIJJI(c28781Ba.LIZIZ);
            c28781Ba.LJIIJJI(c28781Ba.LIZJ);
            c28781Ba.LJFF = 0;
            if (this.LLIIII) {
                this.LJLLJ.LJLIIIL();
            }
        }
        if (this.LLIIL != null && this.LJLLJ.LLIIIJ()) {
            this.LJLJJI.LJIIIZ();
        } else {
            this.LJLJJI.LIZJ();
        }
        if (this.LLJILLL || this.LLJJ) {
            z = true;
        } else {
            z = false;
        }
        C0AC c0ac = this.LLJIJIL;
        if (this.LL && this.LLIIL != null && (this.LLII ? this.LJLLILLLL.mHasStableIds : !(!z && !this.LJLLJ.LJLJJLL))) {
            z2 = true;
        } else {
            z2 = false;
        }
        c0ac.LJIIIZ = z2;
        if (z2 && z && !this.LLII && this.LLIIL != null && this.LJLLJ.LLIIIJ()) {
            z3 = true;
        }
        c0ac.LJIIJ = z3;
    }

    public final void LJJLIIJ() {
        AbstractC030109x abstractC030109x = this.LLIIL;
        if (abstractC030109x != null) {
            abstractC030109x.LJIIJ();
        }
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null) {
            c0a2.LJLLILLLL(this.LJLILLLLZI);
            this.LJLLJ.LJLLJ(this.LJLILLLLZI);
        }
        this.LJLILLLLZI.LIZJ();
    }

    public final void LJJZZI() {
        VelocityTracker velocityTracker = this.LLIIZ;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        LJIIIIZZ(0);
        EdgeEffect edgeEffect = this.LLIIIL;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.LLIIIL.isFinished();
        }
        EdgeEffect edgeEffect2 = this.LLIIIZ;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.LLIIIZ.isFinished();
        }
        EdgeEffect edgeEffect3 = this.LLIIJI;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.LLIIJI.isFinished();
        }
        EdgeEffect edgeEffect4 = this.LLIIJLIL;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.LLIIJLIL.isFinished();
        }
        if (z) {
            C16300kU.LJIIJ(this);
        }
    }

    public final void LJLILLLLZI() {
        int i = this.LLD + 1;
        this.LLD = i;
        if (i == 1 && !this.LLFF) {
            this.LLF = false;
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 == null || !c0a2.LJIJJLI()) {
            return 0;
        }
        return this.LJLLJ.LJJIIJ(this.LLJIJIL);
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 == null || !c0a2.LJIJJLI()) {
            return 0;
        }
        return this.LJLLJ.LJJIIJZLJL(this.LLJIJIL);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 == null || !c0a2.LJIJJLI()) {
            return 0;
        }
        return this.LJLLJ.LJJIIZ(this.LLJIJIL);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 == null || !c0a2.LJIL()) {
            return 0;
        }
        return this.LJLLJ.LJJIIZI(this.LLJIJIL);
    }

    @Override // android.view.View, X.InterfaceC16140kE
    public final int computeVerticalScrollOffset() {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 == null || !c0a2.LJIL()) {
            return 0;
        }
        return this.LJLLJ.LJJIJ(this.LLJIJIL);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 == null || !c0a2.LJIL()) {
            return 0;
        }
        return this.LJLLJ.LJJIJIIJI(this.LLJIJIL);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null) {
            return c0a2.LJJIJL();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecyclerView has no LayoutManager");
        LIZ.append(LJJIIZ());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // android.view.View
    public int getBaseline() {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null) {
            c0a2.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    public int getItemDecorationCount() {
        return this.LJLLLLLL.size();
    }

    public long getNanoTime() {
        if (LLJZ) {
            return System.nanoTime();
        }
        return 0L;
    }

    public RecycledViewPool getRecycledViewPool() {
        return this.LJLILLLLZI.LJ();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.LJLJI;
        if (savedState2 != null) {
            savedState.LJLIL = savedState2.LJLIL;
        } else {
            C0A2 c0a2 = this.LJLLJ;
            if (c0a2 != null) {
                savedState.LJLIL = c0a2.LJLJLJ();
            } else {
                savedState.LJLIL = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.LLD == 0 && !this.LLFF) {
            super.requestLayout();
        } else {
            this.LLF = true;
        }
    }

    public final void LJIL() {
        boolean z;
        LJLILLLLZI();
        LJJLI();
        this.LLJIJIL.LIZ(6);
        this.LJLJJI.LIZJ();
        this.LLJIJIL.LJ = this.LJLLILLLL.getItemCount();
        this.LLJIJIL.LIZJ = 0;
        if (this.LJLJI != null && this.LJLLILLLL.canRestoreState()) {
            Parcelable parcelable = this.LJLJI.LJLIL;
            if (parcelable != null) {
                this.LJLLJ.LJLJL(parcelable);
            }
            this.LJLJI = null;
        }
        C0AC c0ac = this.LLJIJIL;
        c0ac.LJI = false;
        this.LJLLJ.LJLJJI(this.LJLILLLLZI, c0ac);
        C0AC c0ac2 = this.LLJIJIL;
        c0ac2.LJFF = false;
        if (c0ac2.LJIIIZ && this.LLIIL != null) {
            z = true;
        } else {
            z = false;
        }
        c0ac2.LJIIIZ = z;
        c0ac2.LIZLLL = 4;
        LJJLIIIIJ(true);
        LJLJI(false);
    }

    public final String LJJIIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ");
        LIZ.append(super.toString());
        LIZ.append(", adapter:");
        LIZ.append(this.LJLLILLLL);
        LIZ.append(", layout:");
        LIZ.append(this.LJLLJ);
        LIZ.append(", context:");
        LIZ.append(getContext());
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().LJIIIZ(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().LIZLLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r1 >= 30.0f) goto L44;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r2 = 0
            r4.LLIIIILZ = r2
            r1 = 1
            r4.LJZI = r1
            boolean r0 = r4.LL
            if (r0 == 0) goto L65
            boolean r0 = r4.isLayoutRequested()
            if (r0 != 0) goto L65
            r0 = 1
        L14:
            r4.LL = r0
            X.0A2 r0 = r4.LJLLJ
            if (r0 == 0) goto L1f
            r0.LJLJL = r1
            r0.LJJLIL(r4)
        L1f:
            r4.LLJJIII = r2
            boolean r0 = androidx.recyclerview.widget.RecyclerView.LLJZ
            if (r0 == 0) goto L61
            java.lang.ThreadLocal<X.0B1> r3 = X.C0B1.LJLJJL
            java.lang.Object r0 = r3.get()
            X.0B1 r0 = (X.C0B1) r0
            r4.LLJ = r0
            if (r0 != 0) goto L5a
            X.0B1 r0 = new X.0B1
            r0.<init>()
            r4.LLJ = r0
            android.view.Display r1 = X.C16310kV.LIZIZ(r4)
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L62
            if (r1 == 0) goto L62
            float r1 = r1.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L62
        L4e:
            X.0B1 r2 = r4.LLJ
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0 / r1
            long r0 = (long) r0
            r2.LJLJI = r0
            r3.set(r2)
        L5a:
            X.0B1 r0 = r4.LLJ
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.LJLIL
            r0.add(r4)
        L61:
            return
        L62:
            r1 = 1114636288(0x42700000, float:60.0)
            goto L4e
        L65:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C0B1 c0b1;
        super.onDetachedFromWindow();
        AbstractC030109x abstractC030109x = this.LLIIL;
        if (abstractC030109x != null) {
            abstractC030109x.LJIIJ();
        }
        LJLJJI();
        this.LJZI = false;
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null) {
            C0A7 c0a7 = this.LJLILLLLZI;
            c0a2.LJLJL = false;
            c0a2.LJJLJ(this, c0a7);
        }
        ((ArrayList) this.LLJJJJLIIL).clear();
        removeCallbacks(this.LLJJL);
        this.LJLJJLL.getClass();
        do {
        } while (C03290Az.LIZLLL.LIZIZ() != null);
        if (LLJZ && (c0b1 = this.LLJ) != null) {
            c0b1.LJLIL.remove(this);
            this.LLJ = null;
        }
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().LJIIL(0);
    }

    public AbstractC029409q getAdapter() {
        return this.LJLLILLLL;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.LJLJL;
    }

    public C28921Bo getCompatAccessibilityDelegate() {
        return this.LLJJIJI;
    }

    public C029809u getEdgeEffectFactory() {
        return this.LLIIIJ;
    }

    public AbstractC030109x getItemAnimator() {
        return this.LLIIL;
    }

    public C0A2 getLayoutManager() {
        return this.LJLLJ;
    }

    public int getMaxFlingVelocity() {
        return this.LLILZ;
    }

    public int getMinFlingVelocity() {
        return this.LLILLL;
    }

    public C0A4 getOnFlingListener() {
        return this.LLILLJJLI;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.LLIZ;
    }

    public int getScrollState() {
        return this.LLIILII;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.LJZI;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.LLFF;
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.09l
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new RecyclerView.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecyclerView.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final RecyclerView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new RecyclerView.SavedState(parcel, classLoader);
            }
        };
        public Parcelable LJLIL;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.LJLIL = parcel.readParcelable(classLoader == null ? C0A2.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.LJLIL, 0);
        }
    }

    public static void LJIILIIL(ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    public static RecyclerView LJJIL(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView LJJIL = LJJIL(viewGroup.getChildAt(i));
            if (LJJIL != null) {
                return LJJIL;
            }
        }
        return null;
    }

    public static int LJJJJIZL(View view) {
        ViewHolder LJJJJL = LJJJJL(view);
        if (LJJJJL != null) {
            return LJJJJL.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public static int LJJJJJ(View view) {
        ViewHolder LJJJJL = LJJJJL(view);
        if (LJJJJL != null) {
            return LJJJJL.getLayoutPosition();
        }
        return -1;
    }

    public static ViewHolder LJJJJL(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).mViewHolder;
    }

    public final void LJI(ViewHolder viewHolder) {
        boolean z;
        View view = viewHolder.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.LJLILLLLZI.LJIIL(LJJJJJL(view));
        if (viewHolder.isTmpDetached()) {
            this.LJLJJL.LIZIZ(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.LJLJJL.LIZ(-1, view, true);
            return;
        }
        C0AW c0aw = this.LJLJJL;
        int indexOfChild = ((C28891Bl) c0aw.LIZ).LIZ.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0aw.LIZIZ.LJII(indexOfChild);
            c0aw.LJIIIIZZ(view);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("view is not a child, cannot hide ");
            LIZ.append(view);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC33971Uz
    public final void LJIIIIZZ(int i) {
        getScrollingChildHelper().LJIIL(i);
    }

    public final void LJIIIZ(C0A3 c0a3) {
        if (this.LLIFFJFJJ == null) {
            this.LLIFFJFJJ = new ArrayList();
        }
        this.LLIFFJFJJ.add(c0a3);
    }

    public final void LJIIJ(C0A5 c0a5) {
        this.LJLZ.add(c0a5);
    }

    public final void LJIIJJI(C0A6 c0a6) {
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = new ArrayList();
        }
        this.LLJILJILJ.add(c0a6);
    }

    public final void LJIIL(String str) {
        if (LJJJLL()) {
            if (str == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                LIZ.append(LJJIIZ());
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
            throw new IllegalStateException(str);
        }
    }

    public final void LJIJI(View view) {
        ViewHolder LJJJJL = LJJJJL(view);
        AbstractC029409q abstractC029409q = this.LJLLILLLL;
        if (abstractC029409q != null && LJJJJL != null) {
            abstractC029409q.onViewDetachedFromWindow(LJJJJL);
        }
        List<C0A3> list = this.LLIFFJFJJ;
        if (list != null) {
            for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
                ((C0A3) ListProtector.get(this.LLIFFJFJJ, size)).LJIILIIL(view);
            }
        }
    }

    public final void LJJIJ(C0AC c0ac) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.LLIZLLLIL.LJLJI;
            overScroller.getFinalX();
            overScroller.getCurrX();
            c0ac.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        c0ac.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJIJIIJIL(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r1 = r3.getParent()
        L4:
            if (r1 == 0) goto L14
            if (r1 == r2) goto L14
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L14
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r1 = r3.getParent()
            goto L4
        L14:
            if (r1 != r2) goto L17
        L16:
            return r3
        L17:
            r3 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LJJIJIIJIL(android.view.View):android.view.View");
    }

    public final ViewHolder LJJIJIL(View view) {
        View LJJIJIIJIL = LJJIJIIJIL(view);
        if (LJJIJIIJIL == null) {
            return null;
        }
        return LJJJJJL(LJJIJIIJIL);
    }

    public final boolean LJJIJL(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.LJLZ.size();
        for (int i = 0; i < size; i++) {
            C0A5 c0a5 = (C0A5) ListProtector.get(this.LJLZ, i);
            if (c0a5.LIZJ(this, motionEvent) && action != 3) {
                this.LJZ = c0a5;
                return true;
            }
        }
        return false;
    }

    public final void LJJIJLIJ(int[] iArr) {
        int LJ = this.LJLJJL.LJ();
        if (LJ == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = LiveLayoutPreloadThreadPriority.DEFAULT;
        for (int i3 = 0; i3 < LJ; i3++) {
            ViewHolder LJJJJL = LJJJJL(this.LJLJJL.LIZLLL(i3));
            if (!LJJJJL.shouldIgnore()) {
                int layoutPosition = LJJJJL.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final ViewHolder LJJIZ(int i) {
        ViewHolder viewHolder = null;
        if (this.LLII) {
            return null;
        }
        int LJII = this.LJLJJL.LJII();
        for (int i2 = 0; i2 < LJII; i2++) {
            ViewHolder LJJJJL = LJJJJL(this.LJLJJL.LJI(i2));
            if (LJJJJL != null && !LJJJJL.isRemoved() && LJJJJ(LJJJJL) == i) {
                if (this.LJLJJL.LJIIJ(LJJJJL.itemView)) {
                    viewHolder = LJJJJL;
                } else {
                    return LJJJJL;
                }
            }
        }
        return viewHolder;
    }

    public final int LJJJJ(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        C28781Ba c28781Ba = this.LJLJJI;
        int i = viewHolder.mPosition;
        int size = c28781Ba.LIZIZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0AI c0ai = (C0AI) ListProtector.get(c28781Ba.LIZIZ, i2);
            int i3 = c0ai.LIZ;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        int i4 = c0ai.LIZIZ;
                        if (i4 == i) {
                            i = c0ai.LIZLLL;
                        } else {
                            if (i4 < i) {
                                i--;
                            }
                            if (c0ai.LIZLLL <= i) {
                                i++;
                            }
                        }
                    }
                } else {
                    int i5 = c0ai.LIZIZ;
                    if (i5 <= i) {
                        int i6 = c0ai.LIZLLL;
                        if (i5 + i6 > i) {
                            return -1;
                        }
                        i -= i6;
                    } else {
                        continue;
                    }
                }
            } else if (c0ai.LIZIZ <= i) {
                i += c0ai.LIZLLL;
            }
        }
        return i;
    }

    public final long LJJJJI(ViewHolder viewHolder) {
        if (this.LJLLILLLL.mHasStableIds) {
            return viewHolder.getItemId();
        }
        return viewHolder.mPosition;
    }

    public final ViewHolder LJJJJJL(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return LJJJJL(view);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View ");
        LIZ.append(view);
        LIZ.append(" is not a direct child of ");
        LIZ.append(this);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final Rect LJJJJLL(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mInsetsDirty) {
            return layoutParams.mDecorInsets;
        }
        if (this.LLJIJIL.LJI && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
            return layoutParams.mDecorInsets;
        }
        Rect rect = layoutParams.mDecorInsets;
        rect.set(0, 0, 0, 0);
        int size = this.LJLLLLLL.size();
        for (int i = 0; i < size; i++) {
            this.LJLJLLL.set(0, 0, 0, 0);
            ((AbstractC030309z) ListProtector.get(this.LJLLLLLL, i)).LJ(this.LJLJLLL, view, this, this.LLJIJIL);
            int i2 = rect.left;
            Rect rect2 = this.LJLJLLL;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.mInsetsDirty = false;
        return rect;
    }

    public final AbstractC030309z LJJJJZ(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (AbstractC030309z) ListProtector.get(this.LJLLLLLL, i);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append(" is an invalid index for size ");
        LIZ.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LIZ));
    }

    public final void LJJJLZIJ(int i) {
        if (this.LJLLJ == null) {
            return;
        }
        setScrollState(2);
        this.LJLLJ.LJZL(i);
        awakenScrollBars();
    }

    public final void LJJLIIIIJ(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.LLIIIILZ - 1;
        this.LLIIIILZ = i2;
        if (i2 < 1) {
            this.LLIIIILZ = 0;
            if (z) {
                int i3 = this.LLFII;
                this.LLFII = 0;
                if (i3 != 0 && (accessibilityManager = this.LLI) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    C17680mi.LIZIZ(obtain, i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = ((ArrayList) this.LLJJJJLIIL).size() - 1; size >= 0; size--) {
                    ViewHolder viewHolder = (ViewHolder) ListProtector.get(this.LLJJJJLIIL, size);
                    if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                        C16300kU.LJIJ(viewHolder.itemView, i);
                        viewHolder.mPendingAccessibilityState = -1;
                    }
                }
                ((ArrayList) this.LLJJJJLIIL).clear();
            }
        }
    }

    public final void LJJLIIIJ(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLIILZL) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLIILZL = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.LLILIL = x;
            this.LLIL = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.LLILL = y;
            this.LLILII = y;
        }
    }

    public final void LJJLIIIJLJLI(boolean z) {
        this.LLIIII = z | this.LLIIII;
        this.LLII = true;
        int LJII = this.LJLJJL.LJII();
        for (int i = 0; i < LJII; i++) {
            ViewHolder LJJJJL = LJJJJL(this.LJLJJL.LJI(i));
            if (LJJJJL != null && !LJJJJL.shouldIgnore()) {
                LJJJJL.addFlags(6);
            }
        }
        LJJJZ();
        C0A7 c0a7 = this.LJLILLLLZI;
        int size = c0a7.LIZJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            ViewHolder viewHolder = (ViewHolder) ListProtector.get(c0a7.LIZJ, i2);
            if (viewHolder != null) {
                viewHolder.addFlags(6);
                viewHolder.addChangePayload(null);
            }
        }
        AbstractC029409q abstractC029409q = c0a7.LJIIIIZZ.LJLLILLLL;
        if (abstractC029409q == null || !abstractC029409q.mHasStableIds) {
            c0a7.LJI();
        }
    }

    public final void LJJLIL(AbstractC030309z abstractC030309z) {
        boolean z;
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null) {
            c0a2.LJIJI("Cannot remove item decoration during a scroll  or layout");
        }
        this.LJLLLLLL.remove(abstractC030309z);
        if (this.LJLLLLLL.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        LJJJZ();
        requestLayout();
    }

    public final void LJJLJ(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            LJJLIL(LJJJJZ(i));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append(" is an invalid index for size ");
        LIZ.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LIZ));
    }

    public final void LJJLJLI(C0A5 c0a5) {
        this.LJLZ.remove(c0a5);
        if (this.LJZ == c0a5) {
            this.LJZ = null;
        }
    }

    public final void LJJLL(C0A6 c0a6) {
        List<C0A6> list = this.LLJILJILJ;
        if (list != null) {
            ((ArrayList) list).remove(c0a6);
        }
    }

    public final void LJLI(int i) {
        if (this.LLFF) {
            return;
        }
        LJLJJI();
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 == null) {
            return;
        }
        c0a2.LJZL(i);
        awakenScrollBars();
    }

    public void LJLIL(int i) {
        C0A2 c0a2;
        if (this.LLFF || (c0a2 = this.LJLLJ) == null) {
            return;
        }
        c0a2.LLIIII(this, this.LLJIJIL, i);
    }

    public final void LJLJI(boolean z) {
        if (this.LLD < 1) {
            this.LLD = 1;
        }
        if (!z && !this.LLFF) {
            this.LLF = false;
        }
        if (this.LLD == 1) {
            if (z && this.LLF && !this.LLFF && this.LJLLJ != null && this.LJLLILLLL != null) {
                LJIJJ();
            }
            if (!this.LLFF) {
                this.LLF = false;
            }
        }
        this.LLD--;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && this.LJLLJ.LJJ((LayoutParams) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.LJLLLLLL.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC030309z) ListProtector.get(this.LJLLLLLL, i3)).LJI(canvas, this, this.LLJIJIL);
        }
        EdgeEffect edgeEffect = this.LLIIIL;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.LJLJL) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, 0.0f);
            EdgeEffect edgeEffect2 = this.LLIIIL;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.LLIIIZ;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.LJLJL) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.LLIIIZ;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.LLIIJI;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.LJLJL) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.LLIIJI;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.LLIIJLIL;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.LJLJL) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.LLIIJLIL;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || (this.LLIIL != null && this.LJLLLLLL.size() > 0 && this.LLIIL.LJIILJJIL())) {
            C16300kU.LJIIJ(this);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null) {
            return c0a2.LJJIJLIJ(getContext(), attributeSet);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecyclerView has no LayoutManager");
        LIZ.append(LJJIIZ());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.LJLLLLLL.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC030309z) ListProtector.get(this.LJLLLLLL, i)).LJFF(canvas, this, this.LLJIJIL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r2 != 0.0f) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r1 != 0.0f) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r3 = (int) (r1 * r13.LLILZIL);
        r2 = (int) (r2 * r13.LLILZLL);
        r1 = r13.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r1 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r13.LLFF == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r0 = r13.LLJJJJJIL;
        r0[0] = 0;
        r0[1] = 0;
        r5 = r1.LJIJJLI();
        r4 = r13.LJLLJ.LJIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r4 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        r1 = (r5 ? 1 : 0) | 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        getScrollingChildHelper().LJIIJJI(r1, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r5 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r4 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (LJJ(r8, r9, 1, r13.LLJJJJJIL, r13.LLJJJIL) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        r1 = r13.LLJJJJJIL;
        r3 = r3 - r1[0];
        r2 = r2 - r1[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        if (r5 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r4 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        LJJZZIII(r1, r0, r14, 1);
        r0 = r13.LLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (r0 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        if (r3 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        if (r2 == 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        r0.LIZJ(r13, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        LJIIIIZZ(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
    
        r1 = r5 ? 1 : 0;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        if (r4 != false) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.LJLJI = savedState;
        super.onRestoreInstanceState(savedState.mSuperState);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        if (r1 != 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        setScrollState(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0155, code lost:
    
        if (r8 == false) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.LJLZ.size();
        for (int i = 0; i < size; i++) {
            ((C0A5) ListProtector.get(this.LJLZ, i)).LIZIZ(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int LIZ;
        int i = 0;
        if (LJJJLL()) {
            if (accessibilityEvent != null && (LIZ = C17680mi.LIZ(accessibilityEvent)) != 0) {
                i = LIZ;
            }
            this.LLFII |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C28921Bo c28921Bo) {
        this.LLJJIJI = c28921Bo;
        h0.LJIJI(this, c28921Bo);
    }

    public void setAdapter(AbstractC029409q abstractC029409q) {
        IDrS12S0000000_6 iDrS12S0000000_6 = C38413F5t.LIZJ;
        LJJLL(iDrS12S0000000_6);
        LJIIJJI(iDrS12S0000000_6);
        if (C38413F5t.LIZ("setRecyclerViewAdapter")) {
            try {
                new AqS73S0000000_6(1).invoke();
            } catch (Throwable unused) {
            }
        }
        setLayoutFrozen(false);
        AbstractC029409q abstractC029409q2 = this.LJLLILLLL;
        if (abstractC029409q2 != null) {
            abstractC029409q2.unregisterAdapterDataObserver(this.LJLIL);
            this.LJLLILLLL.onDetachedFromRecyclerView(this);
        }
        LJJLIIJ();
        C28781Ba c28781Ba = this.LJLJJI;
        c28781Ba.LJIIJJI(c28781Ba.LIZIZ);
        c28781Ba.LJIIJJI(c28781Ba.LIZJ);
        c28781Ba.LJFF = 0;
        AbstractC029409q abstractC029409q3 = this.LJLLILLLL;
        this.LJLLILLLL = abstractC029409q;
        if (abstractC029409q != null) {
            abstractC029409q.registerAdapterDataObserver(this.LJLIL);
            abstractC029409q.onAttachedToRecyclerView(this);
        }
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null) {
            c0a2.LJJLIIJ(this.LJLLILLLL);
        }
        C0A7 c0a7 = this.LJLILLLLZI;
        AbstractC029409q abstractC029409q4 = this.LJLLILLLL;
        c0a7.LIZJ();
        c0a7.LJ().onAdapterChanged(abstractC029409q3, abstractC029409q4, false);
        this.LLJIJIL.LJFF = true;
        LJJLIIIJLJLI(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC029709t interfaceC029709t) {
        boolean z;
        if (interfaceC029709t == this.LLJJIJIIJIL) {
            return;
        }
        this.LLJJIJIIJIL = interfaceC029709t;
        if (interfaceC029709t != null) {
            z = true;
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.LJLJL) {
            this.LLIIJLIL = null;
            this.LLIIIZ = null;
            this.LLIIJI = null;
            this.LLIIIL = null;
        }
        this.LJLJL = z;
        super.setClipToPadding(z);
        if (this.LL) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C029809u c029809u) {
        c029809u.getClass();
        this.LLIIIJ = c029809u;
        this.LLIIJLIL = null;
        this.LLIIIZ = null;
        this.LLIIJI = null;
        this.LLIIIL = null;
    }

    public void setHasFixedSize(boolean z) {
        this.LJZL = z;
    }

    public void setItemAnimator(AbstractC030109x abstractC030109x) {
        AbstractC030109x abstractC030109x2 = this.LLIIL;
        if (abstractC030109x2 != null) {
            abstractC030109x2.LJIIJ();
            this.LLIIL.LIZ = null;
        }
        this.LLIIL = abstractC030109x;
        if (abstractC030109x != null) {
            abstractC030109x.LIZ = this.LLJJI;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0A7 c0a7 = this.LJLILLLLZI;
        c0a7.LJ = i;
        c0a7.LJIILIIL();
    }

    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C0A2 c0a2) {
        if (c0a2 == this.LJLLJ) {
            return;
        }
        LJLJJI();
        if (this.LJLLJ != null) {
            AbstractC030109x abstractC030109x = this.LLIIL;
            if (abstractC030109x != null) {
                abstractC030109x.LJIIJ();
            }
            this.LJLLJ.LJLLILLLL(this.LJLILLLLZI);
            this.LJLLJ.LJLLJ(this.LJLILLLLZI);
            this.LJLILLLLZI.LIZJ();
            if (this.LJZI) {
                C0A2 c0a22 = this.LJLLJ;
                C0A7 c0a7 = this.LJLILLLLZI;
                c0a22.LJLJL = false;
                c0a22.LJJLJ(this, c0a7);
            }
            this.LJLLJ.LLFZ(null);
            this.LJLLJ = null;
        } else {
            this.LJLILLLLZI.LIZJ();
        }
        C0AW c0aw = this.LJLJJL;
        c0aw.LIZIZ.LJI();
        int size = ((ArrayList) c0aw.LIZJ).size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0AV c0av = c0aw.LIZ;
            View view = (View) ListProtector.get(c0aw.LIZJ, size);
            C28891Bl c28891Bl = (C28891Bl) c0av;
            c28891Bl.getClass();
            ViewHolder LJJJJL = LJJJJL(view);
            if (LJJJJL != null) {
                LJJJJL.onLeftHiddenState(c28891Bl.LIZ);
            }
            ListProtector.remove(c0aw.LIZJ, size);
        }
        C28891Bl c28891Bl2 = (C28891Bl) c0aw.LIZ;
        int LIZ = c28891Bl2.LIZ();
        for (int i = 0; i < LIZ; i++) {
            View childAt = c28891Bl2.LIZ.getChildAt(i);
            c28891Bl2.LIZ.LJIJI(childAt);
            childAt.clearAnimation();
        }
        c28891Bl2.LIZ.removeAllViews();
        this.LJLLJ = c0a2;
        if (c0a2 != null) {
            if (c0a2.LJLILLLLZI == null) {
                c0a2.LLFZ(this);
                if (this.LJZI) {
                    C0A2 c0a23 = this.LJLLJ;
                    c0a23.LJLJL = true;
                    c0a23.LJJLIL(this);
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("LayoutManager ");
                LIZ2.append(c0a2);
                LIZ2.append(" is already attached to a RecyclerView:");
                LIZ2.append(c0a2.LJLILLLLZI.LJJIIZ());
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
            }
        }
        this.LJLILLLLZI.LJIILIIL();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().LJIIJ(z);
    }

    public void setOnFlingListener(C0A4 c0a4) {
        this.LLILLJJLI = c0a4;
    }

    public void setOnScrollListener(C0A6 c0a6) {
        this.LLJILJIL = c0a6;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.LLIZ = z;
    }

    public void setRecycledViewPool(RecycledViewPool recycledViewPool) {
        C0A7 c0a7 = this.LJLILLLLZI;
        RecycledViewPool recycledViewPool2 = c0a7.LJI;
        if (recycledViewPool2 != null) {
            recycledViewPool2.detach();
        }
        c0a7.LJI = recycledViewPool;
        if (recycledViewPool != null && c0a7.LJIIIIZZ.getAdapter() != null) {
            c0a7.LJI.attach();
        }
    }

    public void setRecyclerListener(C0A8 c0a8) {
        this.LJLLL = c0a8;
    }

    public void setScrollState(int i) {
        C0AB c0ab;
        if (i == this.LLIILII) {
            return;
        }
        this.LLIILII = i;
        if (i != 2) {
            C0AE c0ae = this.LLIZLLLIL;
            c0ae.LJLJL.removeCallbacks(c0ae);
            c0ae.LJLJI.abortAnimation();
            C0A2 c0a2 = this.LJLLJ;
            if (c0a2 != null && (c0ab = c0a2.LJLJJL) != null) {
                c0ab.LJI();
            }
        }
        C0A2 c0a22 = this.LJLLJ;
        if (c0a22 != null) {
            c0a22.LJLJLLL(i);
        }
        LJJLIIIJILLIZJL(i);
        C0A6 c0a6 = this.LLJILJIL;
        if (c0a6 != null) {
            c0a6.LJIILJJIL(i, this);
        }
        List<C0A6> list = this.LLJILJILJ;
        if (list != null) {
            int size = ((ArrayList) list).size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C0A6) ListProtector.get(this.LLJILJILJ, size)).LJIILJJIL(i, this);
                } else {
                    return;
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.LLILLIZIL = viewConfiguration.getScaledTouchSlop();
        } else {
            this.LLILLIZIL = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(C0AD c0ad) {
        this.LJLILLLLZI.LJII = c0ad;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().LJIIJJI(i, 0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.LLFF) {
            LJIIL("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.LLFF = false;
                if (this.LLF && this.LJLLJ != null && this.LJLLILLLL != null) {
                    requestLayout();
                }
                this.LLF = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.LLFF = true;
            this.LLFFF = true;
            LJLJJI();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null) {
            return c0a2.LJJIL(layoutParams);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecyclerView has no LayoutManager");
        LIZ.append(LJJIIZ());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.b7e);
    }

    public static void LJJJJLI(Rect rect, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.mDecorInsets;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    public final void LJII(AbstractC030309z abstractC030309z, int i) {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null) {
            c0a2.LJIJI("Cannot add item decoration during a scroll  or layout");
        }
        if (this.LJLLLLLL.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.LJLLLLLL.add(abstractC030309z);
        } else {
            ListProtector.add(this.LJLLLLLL, i, abstractC030309z);
        }
        LJJJZ();
        requestLayout();
    }

    public final void LJIILL(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.LLIIIL;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.LLIIIL.onRelease();
            z = this.LLIIIL.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.LLIIJI;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.LLIIJI.onRelease();
            z |= this.LLIIJI.isFinished();
        }
        EdgeEffect edgeEffect3 = this.LLIIIZ;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.LLIIIZ.onRelease();
            z |= this.LLIIIZ.isFinished();
        }
        EdgeEffect edgeEffect4 = this.LLIIJLIL;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.LLIIJLIL.onRelease();
            z |= this.LLIIJLIL.isFinished();
        }
        if (z) {
            C16300kU.LJIIJ(this);
        }
    }

    public final void LJIIZILJ(int i, int i2) {
        setMeasuredDimension(C0A2.LJJI(i, getPaddingRight() + getPaddingLeft(), C16300kU.LJ(this)), C0A2.LJJI(i2, getPaddingBottom() + getPaddingTop(), C16300kU.LIZLLL(this)));
    }

    public final void LJJIFFI(int i, int i2) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        LJJLIIIJJI();
        C0A6 c0a6 = this.LLJILJIL;
        if (c0a6 != null) {
            c0a6.LJIILL(this, i, i2);
        }
        List<C0A6> list = this.LLJILJILJ;
        if (list != null) {
            int size = ((ArrayList) list).size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C0A6) ListProtector.get(this.LLJILJILJ, size)).LJIILL(this, i, i2);
                } else {
                    return;
                }
            }
        }
    }

    public final View LJJIJIIJI(float f, float f2) {
        for (int LJ = this.LJLJJL.LJ() - 1; LJ >= 0; LJ--) {
            View LIZLLL = this.LJLJJL.LIZLLL(LJ);
            float translationX = LIZLLL.getTranslationX();
            float translationY = LIZLLL.getTranslationY();
            if (f >= LIZLLL.getLeft() + translationX && f <= LIZLLL.getRight() + translationX && f2 >= LIZLLL.getTop() + translationY && f2 <= LIZLLL.getBottom() + translationY) {
                return LIZLLL;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder LJJJ(int r6, boolean r7) {
        /*
            r5 = this;
            X.0AW r0 = r5.LJLJJL
            int r4 = r0.LJII()
            r1 = 0
            r3 = 0
        L8:
            if (r3 >= r4) goto L39
            X.0AW r0 = r5.LJLJJL
            android.view.View r0 = r0.LJI(r3)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = LJJJJL(r0)
            if (r2 == 0) goto L22
            boolean r0 = r2.isRemoved()
            if (r0 != 0) goto L22
            if (r7 == 0) goto L25
            int r0 = r2.mPosition
            if (r0 == r6) goto L2c
        L22:
            int r3 = r3 + 1
            goto L8
        L25:
            int r0 = r2.getLayoutPosition()
            if (r0 == r6) goto L2c
            goto L22
        L2c:
            X.0AW r1 = r5.LJLJJL
            android.view.View r0 = r2.itemView
            boolean r0 = r1.LJIIJ(r0)
            if (r0 == 0) goto L38
            r1 = r2
            goto L22
        L38:
            return r2
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LJJJ(int, boolean):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public boolean LJJJI(int i, int i2) {
        boolean z;
        int i3 = i2;
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 == null || this.LLFF) {
            return false;
        }
        int LJIJJLI = c0a2.LJIJJLI();
        boolean LJIL = this.LJLLJ.LJIL();
        if (LJIJJLI == 0 || Math.abs(i) < this.LLILLL) {
            i = 0;
        }
        if (!LJIL || Math.abs(i3) < this.LLILLL) {
            i3 = 0;
        }
        if (i == 0 && i3 == 0) {
            return false;
        }
        float f = i;
        float f2 = i3;
        if (!dispatchNestedPreFling(f, f2)) {
            if (LJIJJLI != 0 || LJIL) {
                z = true;
            } else {
                z = false;
            }
            dispatchNestedFling(f, f2, z);
            C0A4 c0a4 = this.LLILLJJLI;
            if (c0a4 != null && c0a4.LIZ(i, i3)) {
                return true;
            }
            if (z) {
                if (LJIL) {
                    LJIJJLI = (LJIJJLI == true ? 1 : 0) | 2;
                }
                getScrollingChildHelper().LJIIJJI(LJIJJLI, 1);
                int i4 = this.LLILZ;
                int max = Math.max(-i4, Math.min(i, i4));
                int i5 = this.LLILZ;
                int max2 = Math.max(-i5, Math.min(i3, i5));
                C0AE c0ae = this.LLIZLLLIL;
                c0ae.LJLJL.setScrollState(2);
                c0ae.LJLILLLLZI = 0;
                c0ae.LJLIL = 0;
                Interpolator interpolator = c0ae.LJLJJI;
                InterpolatorC029009m interpolatorC029009m = LLL;
                if (interpolator != interpolatorC029009m) {
                    c0ae.LJLJJI = interpolatorC029009m;
                    c0ae.LJLJI = new OverScroller(c0ae.LJLJL.getContext(), interpolatorC029009m);
                }
                c0ae.LJLJI.fling(0, 0, max, max2, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE);
                c0ae.LIZIZ();
                return true;
            }
        }
        return false;
    }

    public final void LJJLIIIJLLLLLLLZ(ViewHolder viewHolder, C030009w c030009w) {
        viewHolder.setFlags(0, FileUtils.BUFFER_SIZE);
        if (this.LLJIJIL.LJII && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.LJLJJLL.LIZIZ.LJI(LJJJJI(viewHolder), viewHolder);
        }
        this.LJLJJLL.LIZIZ(viewHolder, c030009w);
    }

    public final void LJJZ(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.LJLJLLL.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.mInsetsDirty) {
                Rect rect = layoutParams2.mDecorInsets;
                Rect rect2 = this.LJLJLLL;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.LJLJLLL);
            offsetRectIntoDescendantCoords(view, this.LJLJLLL);
        }
        C0A2 c0a2 = this.LJLLJ;
        Rect rect3 = this.LJLJLLL;
        boolean z2 = !this.LL;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        c0a2.LJLLLLLL(this, view, rect3, z2, z);
    }

    public final void LJLIIIL(int i, int i2) {
        LJLIIL(i, i2, null, LiveLayoutPreloadThreadPriority.DEFAULT, false);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().LIZIZ(f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x006a, code lost:
    
        if (r3.findNextFocus(r13, r14, r0) == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r3.findNextFocus(r13, r14, r0) == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        LJIILLIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (LJJIJIIJIL(r14) != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        LJLILLLLZI();
        r13.LJLLJ.LJJLJLI(r14, r15, r13.LJLILLLLZI, r13.LLJIJIL);
        LJLJI(false);
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        InterfaceC029709t interfaceC029709t = this.LLJJIJIIJIL;
        if (interfaceC029709t == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return interfaceC029709t.LIZ(i, i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 == null) {
            LJIIZILJ(i, i2);
            return;
        }
        boolean z = false;
        if (c0a2.LJJLIIIJ()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.LJLLJ.LJLJJLL(i, i2, this.LJLILLLLZI, this.LLJIJIL);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.LLJJLIIIJLLLLLLLZ = z;
            if (z || this.LJLLILLLL == null) {
                return;
            }
            if (this.LLJIJIL.LIZLLL == 1) {
                LJIJJLI();
            }
            this.LJLLJ.LLFF(i, i2);
            this.LLJIJIL.LJIIIIZZ = true;
            LJIL();
            this.LJLLJ.LLFII(i, i2);
            if (this.LJLLJ.LLIFFJFJJ()) {
                this.LJLLJ.LLFF(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.LLJIJIL.LJIIIIZZ = true;
                LJIL();
                this.LJLLJ.LLFII(i, i2);
            }
            this.LLJL = getMeasuredWidth();
            this.LLJLIL = getMeasuredHeight();
            return;
        }
        if (this.LJZL) {
            this.LJLLJ.LJLJJLL(i, i2, this.LJLILLLLZI, this.LLJIJIL);
            return;
        }
        if (this.LLFZ) {
            LJLILLLLZI();
            LJJLI();
            LJJLIIIJL();
            LJJLIIIIJ(true);
            C0AC c0ac = this.LLJIJIL;
            if (c0ac.LJIIJ) {
                c0ac.LJI = true;
            } else {
                this.LJLJJI.LIZJ();
                this.LLJIJIL.LJI = false;
            }
            this.LLFZ = false;
            LJLJI(false);
        } else if (this.LLJIJIL.LJIIJ) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC029409q abstractC029409q = this.LJLLILLLL;
        if (abstractC029409q != null) {
            this.LLJIJIL.LJ = abstractC029409q.getItemCount();
        } else {
            this.LLJIJIL.LJ = 0;
        }
        LJLILLLLZI();
        this.LJLLJ.LJLJJLL(i, i2, this.LJLILLLLZI, this.LLJIJIL);
        LJLJI(false);
        this.LLJIJIL.LJI = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (LJJJLL()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        ViewHolder LJJJJL = LJJJJL(view);
        if (LJJJJL != null) {
            if (LJJJJL.isTmpDetached()) {
                LJJJJL.clearTmpDetachFlag();
            } else if (!LJJJJL.shouldIgnore()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                LIZ.append(LJJJJL);
                LIZ.append(LJJIIZ());
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        view.clearAnimation();
        LJIJI(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0AB c0ab = this.LJLLJ.LJLJJL;
        if ((c0ab == null || !c0ab.LJ) && !LJJJLL() && view2 != null) {
            LJJZ(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 == null || this.LLFF) {
            return;
        }
        boolean LJIJJLI = c0a2.LJIJJLI();
        boolean LJIL = this.LJLLJ.LJIL();
        if (LJIJJLI || LJIL) {
            if (!LJIJJLI) {
                i = 0;
            }
            if (!LJIL) {
                i2 = 0;
            }
            LJJZZIII(i, i2, null, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BX] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1C0 c1c0;
        float LIZ;
        float LIZ2;
        boolean z;
        int i2;
        int i3;
        char c;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.LJLIL = new AbstractC029609s() { // from class: X.1BX
            @Override // X.AbstractC029609s
            public final void LIZJ() {
                RecyclerView.this.LJIIL(null);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.LLJIJIL.LJFF = true;
                recyclerView.LJJLIIIJLJLI(true);
                if (!RecyclerView.this.LJLJJI.LJI()) {
                    RecyclerView.this.requestLayout();
                }
            }

            @Override // X.AbstractC029609s
            public final void LJIIIIZZ() {
                AbstractC029409q abstractC029409q;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.LJLJI != null && (abstractC029409q = recyclerView.LJLLILLLL) != null && abstractC029409q.canRestoreState()) {
                    RecyclerView.this.requestLayout();
                }
            }

            public final void LJIIIZ() {
                if (RecyclerView.LLJLLL) {
                    RecyclerView recyclerView = RecyclerView.this;
                    if (recyclerView.LJZL && recyclerView.LJZI) {
                        C16300kU.LJIIL(recyclerView, recyclerView.LJLJLJ);
                        return;
                    }
                }
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.LLFZ = true;
                recyclerView2.requestLayout();
            }

            @Override // X.AbstractC029609s
            public final void LJFF(int i4, int i5) {
                RecyclerView.this.LJIIL(null);
                C28781Ba c28781Ba = RecyclerView.this.LJLJJI;
                if (i5 < 1) {
                    c28781Ba.getClass();
                    return;
                }
                c28781Ba.LIZIZ.add(c28781Ba.LJII(1, i4, i5, null));
                c28781Ba.LJFF |= 1;
                if (c28781Ba.LIZIZ.size() != 1) {
                    return;
                }
                LJIIIZ();
            }

            @Override // X.AbstractC029609s
            public final void LJI(int i4, int i5) {
                RecyclerView.this.LJIIL(null);
                C28781Ba c28781Ba = RecyclerView.this.LJLJJI;
                c28781Ba.getClass();
                if (i4 == i5) {
                    return;
                }
                c28781Ba.LIZIZ.add(c28781Ba.LJII(8, i4, i5, null));
                c28781Ba.LJFF |= 8;
                if (c28781Ba.LIZIZ.size() != 1) {
                    return;
                }
                LJIIIZ();
            }

            @Override // X.AbstractC029609s
            public final void LJII(int i4, int i5) {
                RecyclerView.this.LJIIL(null);
                C28781Ba c28781Ba = RecyclerView.this.LJLJJI;
                if (i5 < 1) {
                    c28781Ba.getClass();
                    return;
                }
                c28781Ba.LIZIZ.add(c28781Ba.LJII(2, i4, i5, null));
                c28781Ba.LJFF |= 2;
                if (c28781Ba.LIZIZ.size() != 1) {
                    return;
                }
                LJIIIZ();
            }

            @Override // X.AbstractC029609s
            public final void LJ(int i4, int i5, Object obj) {
                RecyclerView.this.LJIIL(null);
                C28781Ba c28781Ba = RecyclerView.this.LJLJJI;
                if (i5 < 1) {
                    c28781Ba.getClass();
                    return;
                }
                c28781Ba.LIZIZ.add(c28781Ba.LJII(4, i4, i5, obj));
                c28781Ba.LJFF |= 4;
                if (c28781Ba.LIZIZ.size() != 1) {
                    return;
                }
                LJIIIZ();
            }
        };
        this.LJLILLLLZI = new C0A7(this);
        this.LJLJJLL = new C0B0();
        this.LJLJLJ = new IDRunnableS85S0100000(this, 24);
        this.LJLJLLL = new Rect();
        this.LJLL = new Rect();
        this.LJLLI = new RectF();
        this.LJLLLL = new ArrayList();
        this.LJLLLLLL = new ArrayList<>();
        this.LJLZ = new ArrayList<>();
        this.LLD = 0;
        this.LLII = false;
        this.LLIIII = false;
        this.LLIIIILZ = 0;
        this.LLIIIJ = new C029809u();
        this.LLIIL = new C40171ht();
        this.LLIILII = 0;
        this.LLIILZL = -1;
        this.LLILZIL = Float.MIN_VALUE;
        this.LLILZLL = Float.MIN_VALUE;
        this.LLIZ = true;
        this.LLIZLLLIL = new C0AE(this);
        if (LLJZ) {
            c1c0 = new C1C0();
        } else {
            c1c0 = null;
        }
        this.LLJI = c1c0;
        this.LLJIJIL = new C0AC();
        this.LLJILLL = false;
        this.LLJJ = false;
        C030209y c030209y = new C030209y(this);
        this.LLJJI = c030209y;
        this.LLJJIII = false;
        this.LLJJIJIL = new int[2];
        this.LLJJJIL = new int[2];
        this.LLJJJJ = new int[2];
        this.LLJJJJJIL = new int[2];
        this.LLJJJJLIIL = new ArrayList();
        this.LLJJL = new IDRunnableS85S0100000(this, 25);
        this.LLJL = 0;
        this.LLJLIL = 0;
        this.LLJLILLLLZIIL = new C029109n(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LLILLIZIL = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            LIZ = C16500ko.LIZ(viewConfiguration);
        } else {
            LIZ = C16520kq.LIZ(viewConfiguration, context);
        }
        this.LLILZIL = LIZ;
        if (i4 >= 26) {
            LIZ2 = C16500ko.LIZIZ(viewConfiguration);
        } else {
            LIZ2 = C16520kq.LIZ(viewConfiguration, context);
        }
        this.LLILZLL = LIZ2;
        this.LLILLL = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLILZ = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.LLIIL.LIZ = c030209y;
        this.LJLJJI = new C28781Ba(new C28901Bm(this));
        this.LJLJJL = new C0AW(new C28891Bl(this));
        if (i4 >= 26) {
            i2 = C16390kd.LIZIZ(this);
        } else {
            i2 = 0;
        }
        if (i2 == 0 && i4 >= 26) {
            C16390kd.LJIIJJI(this, 8);
        }
        if (C16300kU.LIZJ(this) == 0) {
            C16300kU.LJIJ(this, 1);
        }
        this.LLI = (AccessibilityManager) C16880lQ.LLILL(getContext(), "accessibility");
        setAccessibilityDelegateCompat(new C28921Bo(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.orientation, R.attr.clipToPadding, R.attr.descendantFocusability, com.zhiliaoapp.musically.R.attr.acy, com.zhiliaoapp.musically.R.attr.acz, com.zhiliaoapp.musically.R.attr.ad0, com.zhiliaoapp.musically.R.attr.ad1, com.zhiliaoapp.musically.R.attr.ad2, com.zhiliaoapp.musically.R.attr.aky, com.zhiliaoapp.musically.R.attr.b7s, com.zhiliaoapp.musically.R.attr.bbw, com.zhiliaoapp.musically.R.attr.be3}, i, 0);
        h0.LJIJ(this, context, new int[]{R.attr.orientation, R.attr.clipToPadding, R.attr.descendantFocusability, com.zhiliaoapp.musically.R.attr.acy, com.zhiliaoapp.musically.R.attr.acz, com.zhiliaoapp.musically.R.attr.ad0, com.zhiliaoapp.musically.R.attr.ad1, com.zhiliaoapp.musically.R.attr.ad2, com.zhiliaoapp.musically.R.attr.aky, com.zhiliaoapp.musically.R.attr.b7s, com.zhiliaoapp.musically.R.attr.bbw, com.zhiliaoapp.musically.R.attr.be3}, attributeSet, obtainStyledAttributes, i);
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.LJLJL = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                i3 = 4;
                c = 2;
                new C29031Bz(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.rc), resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.re), resources.getDimensionPixelOffset(com.zhiliaoapp.musically.R.dimen.rd));
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Trying to set fast scroller without both required drawables.");
                LIZ3.append(LJJIIZ());
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
            }
        } else {
            i3 = 4;
            c = 2;
        }
        obtainStyledAttributes.recycle();
        if (LLLZLZ != null) {
            String trim = LLLZLZ.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(context.getPackageName());
                    LIZ4.append(trim);
                    trim = X1D.LIZIZ(LIZ4);
                } else if (!trim.contains(".")) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(RecyclerView.class.getPackage().getName());
                    LIZ5.append('.');
                    LIZ5.append(trim);
                    trim = X1D.LIZIZ(LIZ5);
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(C0A2.class);
                    try {
                        constructor = asSubclass.getConstructor(LLJZIJLIL);
                        objArr = new Object[i3];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append(attributeSet.getPositionDescription());
                            LIZ6.append(": Error creating LayoutManager ");
                            LIZ6.append(trim);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ6), e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0A2) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append(attributeSet.getPositionDescription());
                    LIZ7.append(": Class is not a LayoutManager ");
                    LIZ7.append(trim);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ7), e3);
                } catch (ClassNotFoundException e4) {
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append(attributeSet.getPositionDescription());
                    LIZ8.append(": Unable to find LayoutManager ");
                    LIZ8.append(trim);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ8), e4);
                } catch (IllegalAccessException e5) {
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append(attributeSet.getPositionDescription());
                    LIZ9.append(": Cannot access non-public constructor ");
                    LIZ9.append(trim);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ9), e5);
                } catch (InstantiationException e6) {
                    StringBuilder LIZ10 = X1D.LIZ();
                    LIZ10.append(attributeSet.getPositionDescription());
                    LIZ10.append(": Could not instantiate the LayoutManager: ");
                    LIZ10.append(trim);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ10), e6);
                } catch (InvocationTargetException e7) {
                    StringBuilder LIZ11 = X1D.LIZ();
                    LIZ11.append(attributeSet.getPositionDescription());
                    LIZ11.append(": Could not instantiate the LayoutManager: ");
                    LIZ11.append(trim);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ11), e7);
                }
            }
        }
        int[] iArr = LLJLL;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        h0.LJIJ(this, context, iArr, attributeSet, obtainStyledAttributes2, i);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    public final void LJJL(int i, int i2, boolean z) {
        int i3 = i + i2;
        int LJII = this.LJLJJL.LJII();
        for (int i4 = 0; i4 < LJII; i4++) {
            ViewHolder LJJJJL = LJJJJL(this.LJLJJL.LJI(i4));
            if (LJJJJL != null && !LJJJJL.shouldIgnore()) {
                int i5 = LJJJJL.mPosition;
                if (i5 >= i3) {
                    LJJJJL.offsetPosition(-i2, z);
                    this.LLJIJIL.LJFF = true;
                } else if (i5 >= i) {
                    LJJJJL.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.LLJIJIL.LJFF = true;
                }
            }
        }
        C0A7 c0a7 = this.LJLILLLLZI;
        int size = c0a7.LIZJ.size();
        while (true) {
            size--;
            if (size >= 0) {
                ViewHolder viewHolder = (ViewHolder) ListProtector.get(c0a7.LIZJ, size);
                if (viewHolder != null) {
                    int i6 = viewHolder.mPosition;
                    if (i6 >= i3) {
                        viewHolder.offsetPosition(-i2, z);
                    } else if (i6 >= i) {
                        viewHolder.addFlags(8);
                        c0a7.LJII(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void LJL(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        ViewHolder viewHolder;
        LJLILLLLZI();
        LJJLI();
        Trace.beginSection("RV Scroll");
        LJJIJ(this.LLJIJIL);
        if (i != 0) {
            i3 = this.LJLLJ.LJZI(i, this.LJLILLLLZI, this.LLJIJIL);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.LJLLJ.LL(i2, this.LJLILLLLZI, this.LLJIJIL);
        } else {
            i4 = 0;
        }
        Trace.endSection();
        int LJ = this.LJLJJL.LJ();
        for (int i5 = 0; i5 < LJ; i5++) {
            View LIZLLL = this.LJLJJL.LIZLLL(i5);
            ViewHolder LJJJJJL = LJJJJJL(LIZLLL);
            if (LJJJJJL != null && (viewHolder = LJJJJJL.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = LIZLLL.getLeft();
                int top = LIZLLL.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        LJJLIIIIJ(true);
        LJLJI(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 != null) {
            c0a2.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.LJLLJ.LJLLLLLL(this, view, rect, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0100, code lost:
    
        if (r4 == 0.0f) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJZZIII(int r21, int r22, android.view.MotionEvent r23, int r24) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LJJZZIII(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().LIZLLL(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.LLIIJLIL = null;
            this.LLIIIZ = null;
            this.LLIIJI = null;
            this.LLIIIL = null;
        }
    }

    public boolean LJJ(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().LIZJ(i, i2, i3, iArr, iArr2);
    }

    public final void LJLIIL(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C0A2 c0a2 = this.LJLLJ;
        if (c0a2 == null || this.LLFF) {
            return;
        }
        int i4 = 0;
        if (!c0a2.LJIJJLI()) {
            i = 0;
        }
        if (!this.LJLLJ.LJIL()) {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            if (i3 == Integer.MIN_VALUE || i3 > 0) {
                if (z) {
                    if (i != 0) {
                        i4 = 1;
                    }
                    if (i2 != 0) {
                        i4 |= 2;
                    }
                    getScrollingChildHelper().LJIIJJI(i4, 1);
                }
                this.LLIZLLLIL.LIZJ(i, i2, i3, interpolator);
                return;
            }
            scrollBy(i, i2);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().LJFF(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        LJIJJ();
        Trace.endSection();
        this.LL = true;
    }

    public final void LJJI(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().LJII(i, i2, i3, i4, iArr, i5, iArr2);
    }
}
