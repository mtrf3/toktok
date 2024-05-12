package X;

/* renamed from: X.W6g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81742W6g implements PML {
    @Override // X.PML
    public final void LIZLLL(EnumC81745W6j enumC81745W6j) {
        try {
            double suggestedTrimRatio = enumC81745W6j.getSuggestedTrimRatio();
            if (EnumC81745W6j.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio() == suggestedTrimRatio || EnumC81745W6j.OnSystemLowMemoryWhileAppInBackground.getSuggestedTrimRatio() == suggestedTrimRatio || EnumC81745W6j.OnSystemLowMemoryWhileAppInForeground.getSuggestedTrimRatio() == suggestedTrimRatio) {
                W8E.LJII().LJI().LIZ();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
