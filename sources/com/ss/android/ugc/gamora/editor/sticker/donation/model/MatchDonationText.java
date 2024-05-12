package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MatchDonationText implements Serializable {

    @InterfaceC65349Pkn("double_donation_text")
    public final String matchDonateText;

    @InterfaceC65349Pkn("double_donation_highlight")
    public final String matchDonationHighlightText;

    @InterfaceC65349Pkn("double_donation_sticker")
    public final String matchDonationTextForSticker;

    public static /* synthetic */ MatchDonationText copy$default(MatchDonationText matchDonationText, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = matchDonationText.matchDonationTextForSticker;
        }
        if ((i & 2) != 0) {
            str2 = matchDonationText.matchDonateText;
        }
        if ((i & 4) != 0) {
            str3 = matchDonationText.matchDonationHighlightText;
        }
        return matchDonationText.copy(str, str2, str3);
    }

    public final MatchDonationText copy(String str, String str2, String str3) {
        return new MatchDonationText(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchDonationText)) {
            return false;
        }
        MatchDonationText matchDonationText = (MatchDonationText) obj;
        return o.LJ(this.matchDonationTextForSticker, matchDonationText.matchDonationTextForSticker) && o.LJ(this.matchDonateText, matchDonationText.matchDonateText) && o.LJ(this.matchDonationHighlightText, matchDonationText.matchDonationHighlightText);
    }

    public int hashCode() {
        String str = this.matchDonationTextForSticker;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.matchDonateText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.matchDonationHighlightText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchDonationText(matchDonationTextForSticker=");
        LIZ.append(this.matchDonationTextForSticker);
        LIZ.append(", matchDonateText=");
        LIZ.append(this.matchDonateText);
        LIZ.append(", matchDonationHighlightText=");
        return q.LIZIZ(LIZ, this.matchDonationHighlightText, ')', LIZ);
    }

    public final String getMatchDonateText() {
        return this.matchDonateText;
    }

    public final String getMatchDonationHighlightText() {
        return this.matchDonationHighlightText;
    }

    public final String getMatchDonationTextForSticker() {
        return this.matchDonationTextForSticker;
    }

    public MatchDonationText(String str, String str2, String str3) {
        this.matchDonationTextForSticker = str;
        this.matchDonateText = str2;
        this.matchDonationHighlightText = str3;
    }
}
