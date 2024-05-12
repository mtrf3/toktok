package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.RemoteException;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class VS2 extends VRK implements ActionMode.Callback {
    public ActionMode mActionMode;
    public VS3 mCheckForLongPress;
    public boolean mEnableTextSelection;
    public boolean mHasImage;
    public Paint mHighlightPaint;
    public Path mHighlightPath;
    public boolean mIsInSelection;
    public boolean mIsJustify;
    public boolean mNeedDrawStroke;
    public int mOverflow;
    public Picture mOverflowPicture;
    public boolean mOverflowPictureDirty;
    public int mSelectEnd;
    public final PointF mSelectEndPos;
    public int mSelectStart;
    public final PointF mSelectStartPos;
    public Drawable mSelectionLeftCursor;
    public Drawable mSelectionRightCursor;
    public boolean mShowSelectHandle;
    public Layout mTextLayout;
    public ColorStateList mTextSelectionColor;
    public float mTextTranslateOffset;

    public static void com_lynx_tasm_behavior_ui_text_AndroidText_android_content_ClipboardManager_setPrimaryClip(ClipboardManager clipboardManager, ClipData clipData) {
        if (new C03880Dg(2).LIZJ(101807, "android/content/ClipboardManager", "setPrimaryClip", clipboardManager, new Object[]{clipData}, "void", new C65300Pk0(false, "(Landroid/content/ClipData;)V", "-8223480104457168650")).LIZ) {
            return;
        }
        clipboardManager.setPrimaryClip(clipData);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // X.VRK, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void setTextGradient(ReadableArray readableArray) {
    }

    private void dispatchDetachImageSpan() {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC79742VRi abstractC79742VRi : (AbstractC79742VRi[]) spanned.getSpans(0, spanned.length(), AbstractC79742VRi.class)) {
                abstractC79742VRi.LJ();
                abstractC79742VRi.LJIIIIZZ(null);
            }
        }
    }

    private void drawOverflowPicture() {
        if (!this.mOverflowPictureDirty || this.mTextLayout == null) {
            return;
        }
        if (this.mOverflowPicture == null) {
            this.mOverflowPicture = new Picture();
        }
        Canvas beginRecording = this.mOverflowPicture.beginRecording(this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
        beginRecording.save();
        if (getClipBounds() != null) {
            beginRecording.clipRect(getClipBounds());
        }
        drawTextOnCanvas(beginRecording);
        if (this.mNeedDrawStroke) {
            C79741VRh.LIZLLL(beginRecording, this.mTextLayout);
        }
        beginRecording.restore();
        this.mOverflowPicture.endRecording();
        this.mOverflowPictureDirty = false;
    }

    private void hideToolbar() {
        ActionMode actionMode = this.mActionMode;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
        this.mActionMode = null;
    }

    private void performCancelSelection() {
        if (this.mSelectStart == -1 || this.mSelectEnd == -1) {
            return;
        }
        this.mIsInSelection = false;
        this.mSelectStartPos.set(-1.0f, -1.0f);
        this.mSelectEndPos.set(-1.0f, -1.0f);
        updateSelectionRange();
        hideToolbar();
        this.mShowSelectHandle = false;
    }

    private void performCopy() {
        ClipboardManager clipboardManager;
        int selectionStart = Selection.getSelectionStart(this.mTextLayout.getText());
        int selectionEnd = Selection.getSelectionEnd(this.mTextLayout.getText());
        if (selectionStart < selectionEnd) {
            ClipData newPlainText = ClipData.newPlainText("Lynx-clipboard", this.mTextLayout.getText().subSequence(selectionStart, selectionEnd));
            PPT ppt = (PPT) VEZ.LIZIZ().LIZ(PPT.class);
            if (ppt != null) {
                try {
                    ppt.LIZJ(newPlainText);
                } catch (RemoteException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("A RemoteException was encountered while calling systemInvokeService. ");
                    LIZ.append(e.getMessage());
                    LLog.LIZLLL(4, "AndroidText", X1D.LIZIZ(LIZ));
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23) {
                    clipboardManager = (ClipboardManager) getContext().getSystemService(ClipboardManager.class);
                } else {
                    clipboardManager = (ClipboardManager) C16880lQ.LLILL(getContext(), "clipboard");
                }
                INVOKEVIRTUAL_com_lynx_tasm_behavior_ui_text_AndroidText_com_ss_android_ugc_aweme_lancet_ClipboardLancet_setPrimaryClip(clipboardManager, newPlainText);
            }
        }
        hideToolbar();
        this.mSelectStartPos.set(-1.0f, -1.0f);
        this.mSelectEndPos.set(-1.0f, -1.0f);
        this.mShowSelectHandle = false;
        updateSelectionRange();
    }

    private void performSelectAll() {
        this.mSelectStartPos.set(0.0f, 0.0f);
        this.mSelectEndPos.set(this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
        updateSelectionRange();
    }

    private void removeCheckLongPressCallback() {
        VS3 vs3 = this.mCheckForLongPress;
        if (vs3 == null) {
            return;
        }
        removeCallbacks(vs3);
        this.mCheckForLongPress = null;
    }

    private void showToolbar() {
        if (Build.VERSION.SDK_INT >= 23) {
            startActionMode(this, 1);
        } else {
            startActionMode(this);
        }
    }

    public CharSequence getText() {
        Layout layout = this.mTextLayout;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    public void release() {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            AbstractC79742VRi.LJII((Spanned) getText(), null);
        }
    }

    public void updateSelectionRange() {
        PointF pointF = this.mSelectStartPos;
        float f = pointF.x;
        if (f < 0.0f) {
            this.mSelectStart = -1;
            this.mSelectEnd = -1;
            return;
        }
        this.mSelectStart = getOffsetForPosition(f, pointF.y);
        PointF pointF2 = this.mSelectEndPos;
        int offsetForPosition = getOffsetForPosition(pointF2.x, pointF2.y);
        this.mSelectEnd = offsetForPosition;
        Selection.setSelection((Spannable) this.mTextLayout.getText(), Math.min(this.mSelectStart, offsetForPosition), Math.max(this.mSelectStart, this.mSelectEnd));
    }

    @Override // X.VRK, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            AbstractC79742VRi.LJII((Spanned) getText(), this);
        }
    }

    @Override // X.VRK, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dispatchDetachImageSpan();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC79742VRi abstractC79742VRi : (AbstractC79742VRi[]) spanned.getSpans(0, spanned.length(), AbstractC79742VRi.class)) {
                abstractC79742VRi.LJFF();
            }
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC79742VRi abstractC79742VRi : (AbstractC79742VRi[]) spanned.getSpans(0, spanned.length(), AbstractC79742VRi.class)) {
                abstractC79742VRi.LJI();
            }
        }
    }

    public Layout getTextLayout() {
        return this.mTextLayout;
    }

    public VS2(Context context) {
        super(context);
        this.mHighlightPath = new Path();
        this.mHighlightPaint = new Paint();
        this.mActionMode = null;
        this.mSelectStart = -1;
        this.mSelectEnd = -1;
        this.mSelectStartPos = new PointF(-1.0f, -1.0f);
        this.mSelectEndPos = new PointF(-1.0f, -1.0f);
        this.mIsInSelection = false;
        this.mShowSelectHandle = false;
        this.mNeedDrawStroke = false;
        this.mCheckForLongPress = null;
        this.mOverflowPicture = new Picture();
        this.mOverflow = 0;
        this.mOverflowPictureDirty = true;
        setFocusable(true);
        setWillNotDraw(false);
        if (Build.VERSION.SDK_INT >= 26) {
            this.mTextSelectionColor = ColorStateList.valueOf(Color.argb(0.5f, 0.5f, 0.5f, 0.5f));
        } else {
            this.mTextSelectionColor = ColorStateList.valueOf(ColorProtector.parseColor("#80808080"));
        }
    }

    private void drawSelectHandle(Canvas canvas) {
        if (!this.mShowSelectHandle) {
            return;
        }
        if (this.mHighlightPath.isEmpty()) {
            drawSelectStartCursor(canvas, this.mSelectStartPos);
            drawSelectEndCursor(canvas, this.mSelectStartPos);
            return;
        }
        int selectionStart = Selection.getSelectionStart(this.mTextLayout.getText());
        int selectionEnd = Selection.getSelectionEnd(this.mTextLayout.getText());
        PointF positionForOffset = getPositionForOffset(selectionStart);
        PointF positionForOffset2 = getPositionForOffset(selectionEnd);
        drawSelectStartCursor(canvas, positionForOffset);
        drawSelectEndCursor(canvas, positionForOffset2);
    }

    private void drawText(Canvas canvas) {
        if (this.mSelectStart == -1) {
            drawTextOnCanvas(canvas);
        } else {
            this.mHighlightPath.reset();
            if (this.mSelectionLeftCursor == null) {
                initSelectionCursor(getContext());
                updateSelectionHighlight(this.mTextSelectionColor.getColorForState(getDrawableState(), 0));
            }
            this.mTextLayout.getSelectionPath(Math.min(this.mSelectStart, this.mSelectEnd), Math.max(this.mSelectStart, this.mSelectEnd), this.mHighlightPath);
            this.mTextLayout.draw(canvas, this.mHighlightPath, this.mHighlightPaint, 2);
        }
        if (this.mNeedDrawStroke) {
            C79741VRh.LIZLLL(canvas, this.mTextLayout);
        }
        C79741VRh.LIZIZ(canvas, this.mTextLayout);
    }

    private void drawTextOnCanvas(Canvas canvas) {
        if (this.mIsJustify && Build.VERSION.SDK_INT < 26) {
            C79741VRh.LIZJ(canvas, this.mTextLayout, (getWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.mTextLayout.draw(canvas);
        }
    }

    private int getLineAtCoordinate(float f) {
        return this.mTextLayout.getLineForVertical((int) Math.min(getHeight() - 1, Math.max(0.0f, f)));
    }

    private PointF getPositionForOffset(int i) {
        return new PointF(this.mTextLayout.getPrimaryHorizontal(i), this.mTextLayout.getLineBottom(this.mTextLayout.getLineForOffset(i)));
    }

    private void initSelectionCursor(Context context) {
        this.mSelectionLeftCursor = context.getTheme().getResources().getDrawable(R.drawable.c80);
        this.mSelectionRightCursor = context.getTheme().getResources().getDrawable(R.drawable.c82);
        Drawable drawable = this.mSelectionLeftCursor;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.mSelectionLeftCursor.getIntrinsicHeight());
        Drawable drawable2 = this.mSelectionRightCursor;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.mSelectionRightCursor.getIntrinsicHeight());
        this.mSelectionLeftCursor.setTint(this.mTextSelectionColor.getColorForState(getDrawableState(), 0));
        this.mSelectionRightCursor.setTint(this.mTextSelectionColor.getColorForState(getDrawableState(), 0));
    }

    private void updateSelectionHighlight(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        if (alpha == 0) {
            return;
        }
        if (alpha > 128) {
            alpha = 128;
        }
        int i2 = (alpha << 24) | (red << 16) | (green << 8) | blue;
        this.mTextSelectionColor = ColorStateList.valueOf(i2);
        this.mHighlightPaint.setColor(i2);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        Drawable drawable = this.mSelectionLeftCursor;
        if (drawable == null) {
            return;
        }
        drawable.setTint(i2);
        this.mSelectionRightCursor.setTint(i2);
    }

    public Layout generateTextLayout(VRS vrs) {
        return vrs.LIZJ;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (!C79411VEp.LIZ()) {
            return;
        }
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC79742VRi abstractC79742VRi : (AbstractC79742VRi[]) spanned.getSpans(0, spanned.length(), AbstractC79742VRi.class)) {
                if (abstractC79742VRi.LIZJ() == drawable) {
                    invalidate();
                    this.mOverflowPictureDirty = true;
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mTextLayout != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.mTextTranslateOffset, getPaddingTop());
            if (this.mOverflow != 0) {
                drawOverflowPicture();
                canvas.drawPicture(this.mOverflowPicture);
            } else {
                drawText(canvas);
                drawSelectHandle(canvas);
            }
            canvas.restore();
        }
    }

    @Override // X.VRK, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mTextLayout == null || !this.mEnableTextSelection) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            performBeginSelection(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getAction() == 2) {
            performMovingSelection(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getAction() == 1) {
            performEndSelection(motionEvent.getX(), motionEvent.getY());
        } else {
            performCancelSelection();
        }
        invalidate();
        return true;
    }

    public void setEnableTextSelection(boolean z) {
        this.mEnableTextSelection = z;
    }

    public void setOverflow(int i) {
        this.mOverflow = i;
    }

    public void setTextBundle(VRS vrs) {
        dispatchDetachImageSpan();
        this.mTextLayout = generateTextLayout(vrs);
        this.mTextTranslateOffset = vrs.LJFF;
        boolean z = vrs.LIZ;
        this.mHasImage = z;
        this.mNeedDrawStroke = vrs.LJI;
        this.mIsJustify = vrs.LIZIZ;
        if (z && (getText() instanceof Spanned)) {
            AbstractC79742VRi.LJII((Spanned) getText(), this);
        }
        setContentDescription(this.mTextLayout.getText());
        updateSelectionHighlight(vrs.LJ);
        invalidate();
        this.mOverflowPictureDirty = true;
    }

    public void setTextGradient(String str) {
        LLog.LIZLLL(4, "text-gradient", "setTextGradient(String) is deprecated, call this function has no effect");
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC79742VRi abstractC79742VRi : (AbstractC79742VRi[]) spanned.getSpans(0, spanned.length(), AbstractC79742VRi.class)) {
                if (abstractC79742VRi.LIZJ() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public static void INVOKEVIRTUAL_com_lynx_tasm_behavior_ui_text_AndroidText_com_ss_android_ugc_aweme_lancet_ClipboardLancet_setPrimaryClip(ClipboardManager clipboardManager, ClipData clip) {
        o.LJIIIZ(clip, "clip");
        try {
            com_lynx_tasm_behavior_ui_text_AndroidText_android_content_ClipboardManager_setPrimaryClip(clipboardManager, clip);
        } catch (Exception e) {
            C36922EeM.LIZLLL(2, "ClipboardLancet", e.getLocalizedMessage());
        }
    }

    private void drawSelectEndCursor(Canvas canvas, PointF pointF) {
        canvas.save();
        canvas.translate(pointF.x, pointF.y);
        this.mSelectionRightCursor.draw(canvas);
        canvas.restore();
    }

    private void drawSelectStartCursor(Canvas canvas, PointF pointF) {
        canvas.save();
        canvas.translate(pointF.x - this.mSelectionLeftCursor.getIntrinsicWidth(), pointF.y);
        this.mSelectionLeftCursor.draw(canvas);
        canvas.restore();
    }

    private int getOffsetAtCoordinate(int i, float f) {
        return C16880lQ.LLLLLLL(this.mTextLayout, i, Math.min(getWidth() - 1, Math.max(0.0f, f)));
    }

    private int getOffsetForPosition(float f, float f2) {
        if (this.mTextLayout == null) {
            return -1;
        }
        return getOffsetAtCoordinate(getLineAtCoordinate(f2), f);
    }

    private void performBeginSelection(float f, float f2) {
        hideToolbar();
        if (this.mIsInSelection) {
            this.mSelectStartPos.set(f, f2);
            this.mSelectEndPos.set(f, f2);
            updateSelectionRange();
        } else {
            removeCheckLongPressCallback();
            VS3 vs3 = new VS3(this, f, f2);
            this.mCheckForLongPress = vs3;
            postDelayed(vs3, ViewConfiguration.getLongPressTimeout());
        }
    }

    private void performEndSelection(float f, float f2) {
        if (!this.mIsInSelection) {
            removeCheckLongPressCallback();
            return;
        }
        if (this.mSelectStartPos.equals(f, f2)) {
            performCancelSelection();
            return;
        }
        this.mSelectEndPos.set(f, f2);
        updateSelectionRange();
        showToolbar();
        this.mShowSelectHandle = true;
    }

    private void performMovingSelection(float f, float f2) {
        if (!this.mIsInSelection) {
            VS3 vs3 = this.mCheckForLongPress;
            if (vs3 != null && Math.abs(f - vs3.LJLIL) <= 1.0f && Math.abs(f2 - this.mCheckForLongPress.LJLILLLLZI) <= 1.0f) {
                return;
            }
            removeCheckLongPressCallback();
            return;
        }
        this.mSelectEndPos.set(f, f2);
        updateSelectionRange();
        this.mShowSelectHandle = false;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (menuItem.getItemId() == 65534) {
            performCopy();
        } else if (menuItem.getItemId() == 65533) {
            performSelectAll();
        }
        invalidate();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, 65534, 0, R.string.dw4);
        menu.add(0, 65533, 1, R.string.qg0);
        return true;
    }

    @Override // X.VRK, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        this.mActionMode = actionMode;
        return false;
    }
}
