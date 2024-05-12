package com.ss.android.ugc.aweme.base.ui;

import X.AV1;
import X.AnonymousClass636;
import X.C00F;
import X.C16880lQ;
import X.C17N;
import X.C188587ag;
import X.C188627ak;
import X.C211068Qc;
import X.C211168Qm;
import X.C211218Qr;
import X.C211258Qv;
import X.C253039wR;
import X.C27740Aue;
import X.C32151Nz;
import X.C36922EeM;
import X.C51540KKq;
import X.C51556KLg;
import X.C53326KwM;
import X.C58049MqL;
import X.C58050MqM;
import X.C60996Nwm;
import X.C62846OlW;
import X.C78765Uvh;
import X.C7F0;
import X.C86V;
import X.C8RV;
import X.InterfaceC211228Qs;
import X.InterfaceC41846Gba;
import X.KL2;
import X.W5G;
import Y.ACListenerS22S0101000_3;
import Y.ARunnableS9S0201000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.HybridLabelTagType;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import yq4.a;

/* loaded from: classes4.dex */
public class TagLayout extends LinearLayout {
    public static final int LJLJL = C17N.LJIILL(5.0d);
    public static final C211218Qr LJLJLJ = new Object() { // from class: X.8Qr
    };
    public final Context LJLIL;
    public String LJLILLLLZI;
    public Aweme LJLJI;
    public TuxTextView LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    public void setFeedFromPage(int i) {
    }

    public void setFromPostPage(boolean z) {
    }

    public final void LJII() {
        Aweme aweme = this.LJLJI;
        boolean z = false;
        if ((C211068Qc.LIZ(aweme) != null && !a.LJIILJJIL().LIZ(aweme)) || LJI(this.LJLJI)) {
            z = true;
        }
        this.LJLJJL = z;
    }

    public final boolean LJIIL() {
        Aweme aweme = this.LJLJI;
        if ((aweme != null && !aweme.isAd() && ((C53326KwM.LIZ() || C211258Qv.LIZ()) && !AV1.LJIJ(this.LJLJI.getAuthor()))) || !C7F0.LIZJ() || this.LJLJI.getInteractionTagInfo() == null || this.LJLJI.getInteractionTagInfo().getInterestLevel() != InteractionTagInterestLevel.HIGH.getLevel() || TextUtils.isEmpty(this.LJLJI.getInteractionTagInfo().getVideoLabelText())) {
            return false;
        }
        return true;
    }

    public static int getMutualLablesTotalWidth() {
        return (int) (C60996Nwm.LJII() * 0.65d);
    }

    public static ArrayList LIZLLL(Aweme aweme) {
        MutualStruct LJ = LJ(aweme);
        if (LJ != null && LJ.getUserList() != null) {
            ArrayList arrayList = new ArrayList();
            for (MutualUser mutualUser : LJ.getUserList()) {
                if (mutualUser.getSecUid() != null && !mutualUser.getSecUid().isEmpty()) {
                    arrayList.add(mutualUser.getSecUid());
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static MutualStruct LJ(Aweme aweme) {
        if (aweme != null && aweme.getAuthor() != null && aweme.getAuthor().getMatchedFriendStruct() != null && aweme.getAuthor().getMatchedFriendStruct().getMMutualStruct() != null) {
            return aweme.getAuthor().getMatchedFriendStruct().getMMutualStruct();
        }
        return null;
    }

    public static ArrayList LJFF(Aweme aweme) {
        MutualStruct LJ = LJ(aweme);
        if (LJ != null && LJ.getUserList() != null) {
            ArrayList arrayList = new ArrayList();
            for (MutualUser mutualUser : LJ.getUserList()) {
                if (mutualUser.getUid() != null && !mutualUser.getUid().isEmpty()) {
                    arrayList.add(mutualUser.getUid());
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public static boolean LJI(Aweme aweme) {
        if (aweme.getHybridLabels() == null || aweme.getHybridLabels().size() <= 0) {
            return false;
        }
        if (aweme.getHybridLabels() != null) {
            for (int i = 0; i < aweme.getHybridLabels().size(); i++) {
                if (((AwemeHybridLabelModel) ListProtector.get(aweme.getHybridLabels(), i)).getImageUrl() != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJIIJJI(Aweme aweme) {
        if (aweme != null && !aweme.isAd() && ((C53326KwM.LIZ() || C211258Qv.LIZ()) && !AV1.LJIJ(aweme.getAuthor()))) {
            return false;
        }
        if ((aweme.getHybridLabels() == null || aweme.getHybridLabels().size() <= 0) && C188587ag.LIZJ(aweme) == null) {
            return false;
        }
        return true;
    }

    private void setGeoFencingTag(Aweme aweme) {
        String str;
        int childCount = getChildCount();
        if (1 < childCount) {
            int i = 1;
            do {
                C16880lQ.LLFF(this, getChildAt(i));
                i++;
            } while (i < childCount);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) KL2.LIZJ(this.LJLIL, 22.0f));
        layoutParams.leftMargin = (int) KL2.LIZJ(this.LJLIL, 0.0f);
        View childAt = getChildAt(0);
        if (childAt != null) {
            C16880lQ.LLFF(this, childAt);
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.ack, this, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AnonymousClass636.LJIIIIZZ(R.attr.dl, getContext()));
        gradientDrawable.setCornerRadius(KL2.LIZJ(this.LJLIL, 2.0f));
        LLLLIILL.setBackground(gradientDrawable);
        ((W5G) LLLLIILL.findViewById(R.id.f5w)).setImageResource(R.drawable.a9e);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.m_d);
        List<String> geofencingRegions = aweme.getGeofencingRegions();
        if (geofencingRegions == null || geofencingRegions.isEmpty()) {
            str = "";
        } else if (geofencingRegions.size() == 1) {
            str = this.LJLIL.getString(R.string.h20, ListProtector.get(geofencingRegions, 0));
        } else {
            str = this.LJLIL.getString(R.string.h1z, ListProtector.get(geofencingRegions, 0), Integer.valueOf(geofencingRegions.size() - 1));
        }
        textView.setText(str);
        textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, getContext()));
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        addView(LLLLIILL, 0, layoutParams);
    }

    private void setMutualTagView(MutualStruct mutualStruct) {
        if (mutualStruct == null || !C8RV.LIZ(null, this.LJLILLLLZI, null)) {
            return;
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            C16880lQ.LLFF(this, childAt);
        }
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) KL2.LIZJ(this.LJLIL, 22.0f));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.bk8, this, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, this.LJLIL));
        gradientDrawable.setCornerRadius(KL2.LIZJ(this.LJLIL, 2.0f));
        LLLLIILL.setBackground(gradientDrawable);
        C188627ak c188627ak = (C188627ak) LLLLIILL.findViewById(R.id.ksk);
        int i = 1;
        int LIZ = C00F.LIZ(31744, 0, "display_mutual_connections", true);
        if (LIZ != 1) {
            if (LIZ != 2) {
                if (LIZ != 3) {
                    i = 0;
                }
            } else {
                i = 4;
            }
        }
        c188627ak.LIZ(mutualStruct, i);
        c188627ak.LJLILLLLZI.setTuxFont(62);
        c188627ak.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, this.LJLIL));
        c188627ak.setTvMaxWidth(getMutualLablesTotalWidth());
        addView(LLLLIILL, 0, layoutParams);
    }

    private void setRelationLabelView(MatchedFriendStruct matchedFriendStruct) {
        if (matchedFriendStruct == null) {
            return;
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            C16880lQ.LLFF(this, childAt);
        }
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) KL2.LIZJ(this.LJLIL, 22.0f));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.acl, this, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, this.LJLIL));
        gradientDrawable.setCornerRadius(KL2.LIZJ(this.LJLIL, 2.0f));
        LLLLIILL.setBackground(gradientDrawable);
        C58049MqL c58049MqL = (C58049MqL) LLLLIILL.findViewById(R.id.iuj);
        c58049MqL.setMaxWidth(C60996Nwm.LJIIIIZZ(this.LJLIL) - C17N.LJIILL(130.0d));
        c58049MqL.LJJJJ(matchedFriendStruct, C58050MqM.LJIIJ);
        c58049MqL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, this.LJLIL));
        addView(LLLLIILL, 0, layoutParams);
    }

    private void setSocialVideoTagView(String str) {
        Aweme aweme = this.LJLJI;
        if (aweme == null || aweme.getInteractionTagInfo() == null) {
            return;
        }
        removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) KL2.LIZJ(this.LJLIL, 22.0f));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.acj, this, false);
        TuxTag tuxTag = (TuxTag) LLLLIILL.findViewById(R.id.m_d);
        tuxTag.setTagSize(3);
        tuxTag.setText(str);
        tuxTag.setTagTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, this.LJLIL));
        tuxTag.setTagBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, this.LJLIL));
        addView(LLLLIILL, 0, layoutParams);
    }

    public final View LIZJ(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getTag() instanceof Integer) && i == ((Integer) childAt.getTag()).intValue()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILJJIL(Aweme aweme) {
        removeAllViews();
        if (this.LJLIL == null) {
            return;
        }
        C51556KLg.LIZ.getClass();
        InterfaceC211228Qs poiTagView = C51556KLg.LIZ().getPoiTagView(this.LJLIL);
        if (poiTagView == 0) {
            return;
        }
        poiTagView.setData(aweme);
        if (!(poiTagView instanceof View)) {
            return;
        }
        addView((View) poiTagView, new LinearLayout.LayoutParams(-2, -2));
    }

    public void setEventType(String str) {
        this.LJLILLLLZI = str;
    }

    public TagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = context;
    }

    public static void LJIIIIZZ(TuxTextView tuxTextView, AwemeTextLabelModel awemeTextLabelModel) {
        C253039wR.LIZJ(tuxTextView, awemeTextLabelModel);
        tuxTextView.setTag(Integer.valueOf(awemeTextLabelModel.getLabelType()));
        tuxTextView.setText(awemeTextLabelModel.getLabelName());
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColor(ColorProtector.parseColor(awemeTextLabelModel.getTextColor()));
        tuxTextView.setGravity(16);
        tuxTextView.setBackgroundDrawable(C27740Aue.LIZJ(C17N.LJIILL(4.0d), ColorProtector.parseColor(awemeTextLabelModel.getBgColor())));
        int i = LJLJL;
        tuxTextView.setPadding(i, 0, i, 0);
        tuxTextView.setSingleLine();
        tuxTextView.setMaxEms(20);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setVisibility(0);
        tuxTextView.setAlpha(1.0f);
    }

    public final void LJIIIZ(Aweme aweme, C211218Qr c211218Qr) {
        if (aweme == null || aweme.getTextVideoLabels() == null) {
            return;
        }
        int size = aweme.getTextVideoLabels().size();
        int childCount = getChildCount();
        if (size < childCount) {
            while (size < childCount) {
                C16880lQ.LLFF(this, getChildAt(size));
                size++;
            }
        }
        for (int i = 0; i < aweme.getTextVideoLabels().size(); i++) {
            Context context = this.LJLIL;
            c211218Qr.getClass();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) KL2.LIZJ(context, 22));
            if (i == 0) {
                layoutParams.leftMargin = (int) KL2.LIZJ(this.LJLIL, 0.0f);
            } else {
                layoutParams.leftMargin = (int) KL2.LIZJ(this.LJLIL, 7);
            }
            AwemeTextLabelModel awemeTextLabelModel = (AwemeTextLabelModel) ListProtector.get(aweme.getTextVideoLabels(), i);
            if (awemeTextLabelModel != null) {
                View childAt = getChildAt(i);
                if (childAt == null) {
                    TuxTextView tuxTextView = new TuxTextView(getContext());
                    addView(tuxTextView, -1, layoutParams);
                    LJIIIIZZ(tuxTextView, awemeTextLabelModel);
                } else if (childAt instanceof TuxTextView) {
                    LJIIIIZZ((TuxTextView) getChildAt(i), awemeTextLabelModel);
                } else {
                    C16880lQ.LLFF(this, childAt);
                    TuxTextView tuxTextView2 = new TuxTextView(getContext());
                    addView(tuxTextView2, i, layoutParams);
                    LJIIIIZZ(tuxTextView2, awemeTextLabelModel);
                }
            }
        }
    }

    public final void LJIIJ(List<AwemeLabelModel> list, C211218Qr c211218Qr) {
        if (list == null) {
            return;
        }
        int size = list.size();
        int childCount = getChildCount();
        if (size < childCount) {
            while (size < childCount) {
                C16880lQ.LLFF(this, getChildAt(size));
                size++;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Context context = this.LJLIL;
            c211218Qr.getClass();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) KL2.LIZJ(context, 22));
            if (i == 0) {
                layoutParams.leftMargin = (int) KL2.LIZJ(this.LJLIL, 0.0f);
            } else {
                layoutParams.leftMargin = (int) KL2.LIZJ(this.LJLIL, 7);
            }
            AwemeLabelModel awemeLabelModel = (AwemeLabelModel) ListProtector.get(list, i);
            View childAt = getChildAt(i);
            if (childAt != null && !(childAt instanceof C62846OlW)) {
                C16880lQ.LLFF(this, childAt);
                childAt = null;
            }
            C62846OlW c62846OlW = (C62846OlW) childAt;
            if (awemeLabelModel != null) {
                if (c62846OlW == null) {
                    c62846OlW = new C62846OlW(this.LJLIL);
                    addView(c62846OlW, i, layoutParams);
                } else {
                    c62846OlW.setLayoutParams(layoutParams);
                }
                c62846OlW.setVisibility(0);
                c62846OlW.setAlpha(1.0f);
                UrlModel urlModels = awemeLabelModel.getUrlModels();
                int labelType = awemeLabelModel.getLabelType();
                c62846OlW.setTag(Integer.valueOf(labelType));
                c62846OlW.setScaleType(ImageView.ScaleType.FIT_XY);
                if (labelType == 3) {
                    c62846OlW.setVisibility(8);
                    C16880lQ.LLFF(this, c62846OlW);
                } else {
                    C78765Uvh.LJII(c62846OlW, urlModels, new C51540KKq(c62846OlW));
                }
            }
        }
    }

    public final void LJIILIIL(Aweme aweme, C211218Qr c211218Qr) {
        int LJIIIIZZ;
        View LLLLIILL;
        int LJIIIIZZ2;
        String LIZJ = C188587ag.LIZJ(aweme);
        if (LJI(aweme) || (LIZJ != null && !a.LJIILJJIL().LIZ(aweme))) {
            this.LJLJJLL = true;
            if (aweme.getReplaceRecTagByRepost()) {
                return;
            }
        }
        if (aweme.getHybridLabels() != null && aweme.getHybridLabels().size() > 0 && ((AwemeHybridLabelModel) ListProtector.get(aweme.getHybridLabels(), 0)).getLabelType() != HybridLabelTagType.MAF.getValue()) {
            removeAllViews();
            if (aweme.getHybridLabels() == null) {
                return;
            }
            for (int i = 0; i < aweme.getHybridLabels().size(); i++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) KL2.LIZJ(this.LJLIL, 22.0f));
                if (i == 0) {
                    layoutParams.leftMargin = (int) KL2.LIZJ(this.LJLIL, 0.0f);
                } else {
                    Context context = this.LJLIL;
                    c211218Qr.getClass();
                    layoutParams.leftMargin = (int) KL2.LIZJ(context, 7);
                }
                AwemeHybridLabelModel awemeHybridLabelModel = (AwemeHybridLabelModel) ListProtector.get(aweme.getHybridLabels(), i);
                if (awemeHybridLabelModel != null) {
                    View childAt = getChildAt(i);
                    if (childAt != null) {
                        C16880lQ.LLFF(this, childAt);
                    }
                    String backgroundColor = awemeHybridLabelModel.getBackgroundColor();
                    String textColor = awemeHybridLabelModel.getTextColor();
                    try {
                        LJIIIIZZ = Color.parseColor(backgroundColor);
                    } catch (Exception unused) {
                        C36922EeM.LIZLLL(5, "TagLayout", C16880lQ.LLLZ("parse background color failed & color: %s", new Object[]{backgroundColor}));
                        LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.cl, getContext());
                    }
                    if ("transparent".equals(textColor)) {
                        LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.acj, this, false);
                        final TuxTag tuxTag = (TuxTag) LLLLIILL.findViewById(R.id.m_d);
                        tuxTag.setTagSize(3);
                        tuxTag.setHollow(true);
                        Context context2 = this.LJLIL;
                        c211218Qr.getClass();
                        C60996Nwm.LJIIIIZZ(context2);
                        C32151Nz.LJIILLIIL(7);
                        C32151Nz.LJIILLIIL(Integer.valueOf(LiveTryModeCountDownThresholdSetting.DEFAULT));
                        KL2.LIZJ(this.LJLIL, 28.0f);
                        tuxTag.setText(awemeHybridLabelModel.getText());
                        tuxTag.setTextColor(LJIIIIZZ);
                        if (awemeHybridLabelModel.getImageUrl() != null) {
                            tuxTag.setTagBackgroundColor(LJIIIIZZ);
                            C78765Uvh.LJIILJJIL(awemeHybridLabelModel.getImageUrl(), 0, 0, new InterfaceC41846Gba<Bitmap>() { // from class: X.8Qq
                                @Override // X.InterfaceC41846Gba
                                public final void accept(Bitmap bitmap) {
                                    TuxTag tuxTag2 = TuxTag.this;
                                    tuxTag2.post(new ARunnableS9S0201000_6(2, bitmap, tuxTag2, 0));
                                }
                            });
                        }
                    } else {
                        LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.ack, this, false);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColor(LJIIIIZZ);
                        gradientDrawable.setCornerRadius(KL2.LIZJ(this.LJLIL, 2.0f));
                        LLLLIILL.setBackground(gradientDrawable);
                        C62846OlW c62846OlW = (C62846OlW) LLLLIILL.findViewById(R.id.f5w);
                        if (awemeHybridLabelModel.getImageUrl() != null) {
                            c62846OlW.setVisibility(0);
                            C78765Uvh.LJII(c62846OlW, awemeHybridLabelModel.getImageUrl(), new C51540KKq(c62846OlW));
                        } else {
                            c62846OlW.setVisibility(8);
                        }
                        TextView textView = (TextView) LLLLIILL.findViewById(R.id.m_d);
                        Context context3 = this.LJLIL;
                        c211218Qr.getClass();
                        C60996Nwm.LJIIIIZZ(context3);
                        C32151Nz.LJIILLIIL(7);
                        C32151Nz.LJIILLIIL(Integer.valueOf(LiveTryModeCountDownThresholdSetting.DEFAULT));
                        textView.setText(awemeHybridLabelModel.getText());
                        try {
                            LJIIIIZZ2 = Color.parseColor(textColor);
                        } catch (Exception unused2) {
                            C36922EeM.LIZLLL(5, "TagLayout", C16880lQ.LLLZ("parse text color failed & color: %s", new Object[]{textColor}));
                            LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.go, getContext());
                        }
                        textView.setTextColor(LJIIIIZZ2);
                    }
                    List<AwemeLabelModel> videoLabels = aweme.getVideoLabels();
                    if (videoLabels != null && i < videoLabels.size() && ListProtector.get(videoLabels, i) != null) {
                        LLLLIILL.setTag(Integer.valueOf(((AwemeLabelModel) ListProtector.get(videoLabels, i)).getLabelType()));
                    } else {
                        LLLLIILL.setTag(null);
                    }
                    addView(LLLLIILL, i, layoutParams);
                    if (!TextUtils.isEmpty(awemeHybridLabelModel.getRefUrl())) {
                        C16880lQ.LJJJJLL(this, new ACListenerS22S0101000_3(0, awemeHybridLabelModel, 4));
                    } else {
                        C16880lQ.LJJJJLL(this, null);
                    }
                }
            }
            return;
        }
        if (C188587ag.LIZJ(aweme) == null) {
            return;
        }
        setRelationLabelView(C211068Qc.LIZ(aweme));
    }

    public final void LIZ(Aweme aweme, List<AwemeLabelModel> list, C211218Qr c211218Qr) {
        this.LJLJI = aweme;
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            C16880lQ.LLFF(this, tuxTextView);
        }
        LJII();
        int i = 8;
        if (aweme == null) {
            setVisibility(8);
            return;
        }
        List<String> geofencingRegions = aweme.getGeofencingRegions();
        if (geofencingRegions != null && !geofencingRegions.isEmpty()) {
            setGeoFencingTag(aweme);
        } else if (LJIIL()) {
            if (aweme.getInteractionTagInfo() != null) {
                setSocialVideoTagView(aweme.getInteractionTagInfo().getVideoLabelText());
            }
        } else if (LJIIJJI(aweme)) {
            LJIILIIL(aweme, c211218Qr);
        } else if (aweme.getTextVideoLabels() != null && aweme.getTextVideoLabels().size() > 0) {
            LJIIIZ(aweme, c211218Qr);
        } else if (list != null && !list.isEmpty()) {
            LJIIJ(list, c211218Qr);
        } else {
            C51556KLg.LIZ.getClass();
            if (C51556KLg.LIZ().isPoiTagShow(this.LJLILLLLZI, aweme)) {
                LJIILJJIL(aweme);
            } else {
                removeAllViews();
            }
        }
        if (getChildCount() > 0) {
            i = 0;
        }
        setVisibility(i);
    }

    public final void LIZIZ(Aweme aweme, List<AwemeLabelModel> list, C211218Qr c211218Qr) {
        boolean z;
        String LJFF;
        int i;
        this.LJLJI = aweme;
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            C16880lQ.LLFF(this, tuxTextView);
        }
        LJII();
        int i2 = 8;
        if (aweme == null) {
            setVisibility(8);
            return;
        }
        List<String> geofencingRegions = aweme.getGeofencingRegions();
        boolean z2 = true;
        if (geofencingRegions != null && !geofencingRegions.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setGeoFencingTag(aweme);
            C16880lQ.LJJJJLL(this, null);
        } else if (LJIIL()) {
            C16880lQ.LJJJJLL(this, null);
            setSocialVideoTagView(aweme.getInteractionTagInfo().getVideoLabelText());
        } else if (LJIIJJI(aweme)) {
            LJIILIIL(aweme, c211218Qr);
        } else if (aweme.getTextVideoLabels() != null && aweme.getTextVideoLabels().size() > 0) {
            C16880lQ.LJJJJLL(this, null);
            LJIIIZ(aweme, c211218Qr);
        } else if ((list != null && !list.isEmpty()) || (aweme.getRelationLabel() != null && aweme.getRelationLabel().isValid())) {
            C16880lQ.LJJJJLL(this, null);
            LJIIJ(list, c211218Qr);
            RelationDynamicLabel relationLabel = aweme.getRelationLabel();
            if (relationLabel != null && relationLabel.isValid()) {
                int i3 = 16;
                if (this.LJLJJI == null) {
                    TuxTextView tuxTextView2 = new TuxTextView(getContext());
                    tuxTextView2.setTuxFont(61);
                    tuxTextView2.setTextColor(C86V.LIZIZ(R.color.kv));
                    tuxTextView2.setGravity(16);
                    tuxTextView2.setBackgroundDrawable(C27740Aue.LIZJ(C17N.LJIILL(4.0d), C86V.LIZIZ(R.color.ar)));
                    int i4 = LJLJL;
                    tuxTextView2.setPadding(i4, 0, i4, 0);
                    tuxTextView2.setSingleLine();
                    this.LJLJJI = tuxTextView2;
                }
                String nickname = relationLabel.getNickname();
                String labelInfo = relationLabel.getLabelInfo();
                if (getChildCount() > 0) {
                    i3 = 15;
                } else {
                    z2 = false;
                }
                if (TextUtils.isEmpty(nickname)) {
                    LJFF = C211168Qm.LIZ(i3, labelInfo, "");
                } else {
                    String LIZ = C211168Qm.LIZ((int) Math.ceil(i3 - C211168Qm.LIZJ(labelInfo)), i0.LJFF("@", nickname), C211168Qm.LIZ);
                    if (!TextUtils.isEmpty(LIZ)) {
                        LIZ = i0.LJFF(LIZ, " ");
                    }
                    LJFF = i0.LJFF(LIZ, labelInfo);
                }
                this.LJLJJI.setText(LJFF);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (z2) {
                    i = C17N.LJIILL(6.0d);
                } else {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                addView(this.LJLJJI, layoutParams);
            }
        } else {
            C51556KLg.LIZ.getClass();
            if (C51556KLg.LIZ().isPoiTagShow(this.LJLILLLLZI, aweme)) {
                LJIILJJIL(aweme);
            } else {
                C16880lQ.LJJJJLL(this, null);
                removeAllViews();
            }
        }
        if (getChildCount() > 0) {
            i2 = 0;
        }
        setVisibility(i2);
    }
}
